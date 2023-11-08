package com.example.qr

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val ProfileButton = findViewById<Button>(R.id.buttonProfile)
        ProfileButton.setOnClickListener {
            val intent = Intent(this, ProfileDetailedActivity::class.java)
            startActivity(intent)
            finish()
        }
        val OrdersButton = findViewById<Button>(R.id.buttonOrders)
        OrdersButton.setOnClickListener {
            val intent = Intent(this, BuyActivity::class.java)
            startActivity(intent)
            finish()
        }
        val FavButton = findViewById<Button>(R.id.buttongotofav)
        FavButton.setOnClickListener {
            val intent = Intent(this, FavActivity::class.java)
            startActivity(intent)
            finish()
        }
        val SignButton = findViewById<Button>(R.id.backbutton3)
        SignButton.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
            finish()
        }
    }
}