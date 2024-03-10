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

class Home : AppCompatActivity() {

    private lateinit var imageButton3: ImageButton
    private lateinit var imageButton4: ImageButton
    private lateinit var imageButton5: ImageButton
    private lateinit var imageButton6: ImageButton
    private lateinit var imageButton16: ImageButton
    private lateinit var imageButton17: ImageButton
    private lateinit var imageButton18: ImageButton
    private lateinit var imageButton19: ImageButton
    private lateinit var imageButton20: ImageButton
    private lateinit var imageButton21: ImageButton
    private lateinit var imageButton22: ImageButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        imageButton3 = findViewById(R.id.imageButton3);
        imageButton4 = findViewById(R.id.imageButton4);
        imageButton5 = findViewById(R.id.imageButton5);
        imageButton6 = findViewById(R.id.imageButton6);
        imageButton16 = findViewById(R.id.imageButton16);
        imageButton17 = findViewById(R.id.imageButton17);
        imageButton18 = findViewById(R.id.imageButton18);
        imageButton19 = findViewById(R.id.imageButton19);
        imageButton20 = findViewById(R.id.imageButton20);
        imageButton21 = findViewById(R.id.imageButton21);
        imageButton22 = findViewById(R.id.imageButton22);

        imageButton3.setOnClickListener{
            val intent = Intent(this@Home, Home::class.java)
            startActivity(intent)
        }
        imageButton4.setOnClickListener{
            val intent = Intent(this@Home, bookmark::class.java)
            startActivity(intent)
        }
        imageButton5.setOnClickListener{
            val intent = Intent(this@Home, Notification::class.java)
            startActivity(intent)
        }
        imageButton6.setOnClickListener{
            val intent = Intent(this@Home, profile::class.java)
            startActivity(intent)
        }
        imageButton16.setOnClickListener{
            val intent = Intent(this@Home, MainActivity8::class.java)
            startActivity(intent)
        }
        imageButton17.setOnClickListener{
            val intent = Intent(this@Home, MainActivity8::class.java)
            startActivity(intent)
        }
        imageButton18.setOnClickListener{
            val intent = Intent(this@Home, MainActivity8::class.java)
            startActivity(intent)
        }
        imageButton19.setOnClickListener{
            val intent = Intent(this@Home, MainActivity8::class.java)
            startActivity(intent)
        }
        imageButton20.setOnClickListener{
            val intent = Intent(this@Home, MainActivity8::class.java)
            startActivity(intent)
        }
        imageButton21.setOnClickListener{
            val intent = Intent(this@Home, signout::class.java)
            startActivity(intent)
        }
        imageButton22.setOnClickListener{
            val intent = Intent(this@Home, FAQ::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
}