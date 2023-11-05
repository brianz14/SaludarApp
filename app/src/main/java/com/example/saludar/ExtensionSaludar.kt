package com.example.saludar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class ExtensionSaludar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extension_saludar)

        val tvGreeting = findViewById<TextView>(R.id.tvGreeting)

        val nombre:String=intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvGreeting.text=("hola $nombre")

    }
}