package com.example.and102_prework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dogoButton = findViewById<Button>(R.id.introButton)

        dogoButton.setOnClickListener {
            Toast.makeText(this, "Hello to you too!", Toast.LENGTH_SHORT).show();
        }
    }
}