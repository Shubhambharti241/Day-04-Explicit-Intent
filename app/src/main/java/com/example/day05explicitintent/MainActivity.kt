package com.example.day05explicitintent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val IntentButton = findViewById<Button>(R.id.button)

        IntentButton.setOnClickListener {
            // Open a new Activity
            intent = Intent(applicationContext,SecondActivity::class.java)
            startActivity(intent)

        }
    }
}