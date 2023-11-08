package com.example.qr

import Card
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.qr.databinding.ActivityDetailedBinding
import com.google.android.material.navigation.NavigationView

class DetailedActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailedBinding
    private var card: Card? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailedBinding.inflate(layoutInflater)
        setContentView(binding.root)
        card = this.intent.getParcelableExtra<Card>("card")

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

        if(card!=null){
            val textView :TextView = findViewById(R.id.textCatalog)
            val imageView: ImageView = findViewById(R.id.ImageCatalog)
            val textViewSecond :TextView = findViewById(R.id.textSecond)
            val textViewPrice :TextView = findViewById(R.id.textPrice)

            textView.text = card!!.title
            imageView.setImageResource(card!!.image)
            textViewSecond.text = card!!.secondText
            textViewPrice.text = card!!.price



        }
        val SignButton = findViewById<Button>(R.id.backbutton)
        SignButton.setOnClickListener {
            val intent = Intent(this, ListPage::class.java)
            startActivity(intent)
            finish()
        }


    }
    fun onAddToFavoriteClick(view: View) {
        val favoriteIcon = findViewById<Button>(R.id.addToFavoritesButton)

        if (card != null) {
            card!!.isFavorite = !card!!.isFavorite // Инвертируем значение isFavorite

            if (card!!.isFavorite) {
                favoriteIcon.setBackgroundResource(R.drawable.img_62) // Установить иконку "избранное"
                Toast.makeText(this, "Добавлено в избранное", Toast.LENGTH_SHORT).show()
            } else {
                favoriteIcon.setBackgroundResource(R.drawable.img_58) // Установить иконку "не избранное"
            }
        }
    }
    fun onItemButtonClick() {
        // Handle the menu item click here
        val intent = Intent(this, ListPage::class.java)
        startActivity(intent)
        finish()
    }
    fun onAccountButtonClick() {
        // Handle the menu item click here
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun onAddToCartClick(view: View) {
        val cartIcon = findViewById<Button>(R.id.addToCartButton)

        if (card != null) {
            card!!.isInCart = !card!!.isInCart // Инвертируем значение isInCart

            if (card!!.isInCart) {
                cartIcon.setBackgroundResource(R.drawable.img_63) // Установить иконку "в корзине"
                Toast.makeText(this, "Добавлено в корзину", Toast.LENGTH_SHORT).show()
            } else {
                cartIcon.setBackgroundResource(R.drawable.img_64) // Установить иконку "не в корзине"
            }
        }
    }

}
