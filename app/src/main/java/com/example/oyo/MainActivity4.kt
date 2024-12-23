package com.example.oyo

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)


        var button1 = findViewById<ImageView>(R.id.close_page_1)
        button1.setOnClickListener{
            val intent1 = Intent(this,MainActivity2::class.java)
            startActivity(intent1)
        }

        var button2 = findViewById<ImageView>(R.id.close_page_2)
        button2.setOnClickListener{
            val intent1 = Intent(this,MainActivity2::class.java)
            startActivity(intent1)
        }
    }
}