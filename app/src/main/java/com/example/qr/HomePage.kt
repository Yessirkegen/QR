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
        val Sign2Button = findViewById<ImageButton>(R.id.imageButton6)
        Sign2Button.setOnClickListener {
            val intent = Intent(this, ListPage::class.java)
            startActivity(intent)
            finish()
        }
        val Sign3Button = findViewById<ImageButton>(R.id.imageButton7)
        Sign3Button.setOnClickListener {
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
            when (menuItem.itemId) {
                R.id.kidsheadwearButtonMenu -> {
                    onItemButtonClick()
                    true // Return true to indicate that the item click is handled
                }
                // Handle other menu items here if needed
                else -> false // Return false if not handled
        }
            when (menuItem.itemId) {
                R.id.kidsshirtButtonMenu -> {
                    onItemButtonClick()
                    true // Return true to indicate that the item click is handled
                }
                // Handle other menu items here if needed
                else -> false // Return false if not handled
            }
            when (menuItem.itemId) {
                R.id.kidsjeansButtonMenu -> {
                    onItemButtonClick()
                    true // Return true to indicate that the item click is handled
                }
                // Handle other menu items here if needed
                else -> false // Return false if not handled
            }
            when (menuItem.itemId) {
                R.id.kidsnewButtonMenu -> {
                    onItemButtonClick()
                    true // Return true to indicate that the item click is handled
                }
                // Handle other menu items here if needed
                else -> false // Return false if not handled
            }
            when (menuItem.itemId) {
                R.id.womanheadwearButtonMenu -> {
                    onItemButtonClick()
                    true // Return true to indicate that the item click is handled
                }
                // Handle other menu items here if needed
                else -> false // Return false if not handled
            }
            when (menuItem.itemId) {
                R.id.womanshirtButtonMenu -> {
                    onItemButtonClick()
                    true // Return true to indicate that the item click is handled
                }
                // Handle other menu items here if needed
                else -> false // Return false if not handled
            }
            when (menuItem.itemId) {
                R.id.womanjeansButtonMenu -> {
                    onItemButtonClick()
                    true // Return true to indicate that the item click is handled
                }
                // Handle other menu items here if needed
                else -> false // Return false if not handled
            }
            when (menuItem.itemId) {
                R.id.womannewButtonMenu -> {
                    onItemButtonClick()
                    true // Return true to indicate that the item click is handled
                }
                // Handle other menu items here if needed
                else -> false // Return false if not handled
            }
            when (menuItem.itemId) {
                R.id.headwearButtonMenu -> {
                    onItemButtonClick()
                    true // Return true to indicate that the item click is handled
                }
                // Handle other menu items here if needed
                else -> false // Return false if not handled
            }
            when (menuItem.itemId) {
                R.id.shirtButtonMenu -> {
                    onItemButtonClick()
                    true // Return true to indicate that the item click is handled
                }
                // Handle other menu items here if needed
                else -> false // Return false if not handled
            }
            when (menuItem.itemId) {
                R.id.jeansButtonMenu -> {
                    onItemButtonClick()
                    true // Return true to indicate that the item click is handled
                }
                // Handle other menu items here if needed
                else -> false // Return false if not handled
            }
            when (menuItem.itemId) {
                R.id.newButtonMenu -> {
                    onItemButtonClick()
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
    fun onItemButtonClick() {
        // Handle the menu item click here
        val intent = Intent(this, ListPage::class.java)
        startActivity(intent)
        finish()
    }
}
