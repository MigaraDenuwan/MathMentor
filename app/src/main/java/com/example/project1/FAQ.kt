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

class FAQ : AppCompatActivity() {

    private lateinit var imageButton3: ImageButton
    private lateinit var imageButton4: ImageButton
    private lateinit var imageButton5: ImageButton
    private lateinit var imageButton6: ImageButton
    private lateinit var button6: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_faq)

        imageButton3 = findViewById(R.id.imageButton3);
        imageButton4 = findViewById(R.id.imageButton4);
        imageButton5 = findViewById(R.id.imageButton5);
        imageButton6 = findViewById(R.id.imageButton6);
        button6 = findViewById(R.id.button6);

        imageButton3.setOnClickListener{
            val intent = Intent(this@FAQ, Home::class.java)
            startActivity(intent)
        }
        imageButton4.setOnClickListener{
            val intent = Intent(this@FAQ, bookmark::class.java)
            startActivity(intent)
        }
        imageButton5.setOnClickListener{
            val intent = Intent(this@FAQ, Notification::class.java)
            startActivity(intent)
        }
        imageButton6.setOnClickListener{
            val intent = Intent(this@FAQ, profile::class.java)
            startActivity(intent)
        }
        button6.setOnClickListener{
            val intent = Intent(this@FAQ, Home::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
}