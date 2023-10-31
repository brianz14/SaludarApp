package com.example.saludar

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import org.w3c.dom.Text

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)


        val textoSaludar= findViewById<EditText>(R.id.InputTextSaludar);
        val btnSaludar = findViewById<Button>(R.id.btnSaludar);

        btnSaludar.setOnClickListener {
            val nombre= textoSaludar.text.toString();
            if (nombre.isNotEmpty()){
                //oculto el teclado
                val inputMethodManager =
                    getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                inputMethodManager.hideSoftInputFromWindow(textoSaludar.windowToken, 0)
                Toast.makeText(this,"hola $nombre", Toast.LENGTH_SHORT).show()
                Snackbar.make( btnSaludar,"hola snackbar $nombre",Snackbar.LENGTH_SHORT).show()

            }
        }


    }



}