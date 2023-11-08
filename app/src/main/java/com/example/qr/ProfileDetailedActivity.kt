package com.example.qr

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ProfileDetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_detailed)
        val ProfileEditButton = findViewById<ImageButton>(R.id.buttonProfileDetailed)
        ProfileEditButton.setOnClickListener {
            val intent = Intent(this, ProfileMainActivity::class.java)
            startActivity(intent)
            finish()
        }
        val ButtonEditPssword = findViewById<ImageButton>(R.id.ButtonPasswordChange)
        ButtonEditPssword.setOnClickListener {
            val intent = Intent(this, PasswordDetailedActivity::class.java)
            startActivity(intent)
            finish()
        }
        val ButtonEmailNotify = findViewById<ImageButton>(R.id.buttonEmalnotify)
        ButtonEmailNotify.setOnClickListener {
            val intent = Intent(this, EmailNotifyActivity::class.java)
            startActivity(intent)
            finish()
        }
        val SignButton = findViewById<Button>(R.id.backbutton4)
        SignButton.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }



    }
}