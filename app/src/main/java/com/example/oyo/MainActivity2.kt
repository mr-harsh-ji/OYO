package com.example.oyo


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        var button1 = findViewById<LinearLayout>(R.id.link)
        button1.setOnClickListener{
            val intent1 = Intent(this,MainActivity3::class.java)
            startActivity(intent1)
        }

        var button2 = findViewById<Button>(R.id.book_now)
        button2.setOnClickListener{
            val intent1 = Intent(this,MainActivity3::class.java)
            startActivity(intent1)
        }

        var button3 = findViewById<Button>(R.id.book_now2)
        button3.setOnClickListener{
            val intent1 = Intent(this,MainActivity4::class.java)
            startActivity(intent1)
        }

        var button4 = findViewById<LinearLayout>(R.id.link_1)
        button4.setOnClickListener{
            val intent1 = Intent(this,MainActivity4::class.java)
            startActivity(intent1)
        }

    }
}