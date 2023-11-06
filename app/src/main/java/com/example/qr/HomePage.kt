package com.example.qr

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.qr.databinding.ActivityHomePageBinding
import com.google.android.material.navigation.NavigationView

class HomePage : AppCompatActivity() {
    lateinit var binding: ActivityHomePageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val SignButton = findViewById<ImageButton>(R.id.imageButton2)
        SignButton.setOnClickListener {
            val intent = Intent(this, ListPage::class.java)
            startActivity(intent)
            finish()
        }

        val navigationView = findViewById<NavigationView>(R.id.nav_menu_homr)
        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.butaccountmenu -> {
                    onAccountButtonClick()
                    true // Return true to indicate that the item click is handled
                }
                // Handle other menu items here if needed
                else -> false // Return false if not handled
            }
        }
    }

    fun onAccountButtonClick() {
        // Handle the menu item click here
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
        finish()
    }
}
