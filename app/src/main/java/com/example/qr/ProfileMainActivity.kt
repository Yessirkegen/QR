package com.example.qr

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_main)
        val myButton = findViewById<ImageButton>(R.id.imageButtonSave)

        myButton.setOnClickListener {
            // Code to execute when the button is clicked
            showToast("Data Saved")
        }
        val SignButton = findViewById<Button>(R.id.backbutton5)
        SignButton.setOnClickListener {
            val intent = Intent(this, ProfileDetailedActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}