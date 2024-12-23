package com.example.oyo

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var button1 = findViewById<LinearLayout>(R.id.confirm_button)
        button1.setOnClickListener{
            val intent1 = Intent(this,MainActivity2::class.java)
            startActivity(intent1)
        }
    }
}