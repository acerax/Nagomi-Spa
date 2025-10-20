package com.example.nagomispa

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class HomeActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val button = findViewById<Button>(R.id.memberGamificationBtn)
        button.setOnClickListener {

            val intent = Intent(this, GamificationActivity::class.java)
            startActivity(intent)

        val button = findViewById<Button>(R.id.bookSessionBtn)
        button.setOnClickListener {

            val intent = Intent(this, BookingActivity::class.java)
            startActivity(intent)

            val button = findViewById<Button>(R.id.ProfileBtn)
            button.setOnClickListener {

                val intent = Intent(this, ProfileActivity::class.java)
                startActivity(intent)
            }
        }
        }
    }
}