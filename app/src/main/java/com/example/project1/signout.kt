package com.example.project1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class signout : AppCompatActivity() {

    private lateinit var button5: Button
    private lateinit var imageButton15: ImageButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signout)

        button5 = findViewById(R.id.button5);
        imageButton15 = findViewById(R.id.imageButton15);

        button5.setOnClickListener{
            val intent = Intent(this@signout, MainActivity5::class.java)
            startActivity(intent)
        }
        imageButton15.setOnClickListener{
            val intent = Intent(this@signout, Home::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
}