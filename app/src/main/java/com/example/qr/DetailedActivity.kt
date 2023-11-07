package com.example.qr

import Card
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.qr.databinding.ActivityDetailedBinding

class DetailedActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailedBinding
    private var card: Card? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailedBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val card = this.intent.getParcelableExtra<Card>("card")

        if(card!=null){
            val textView :TextView = findViewById(R.id.textCatalog)
            val imageView: ImageView = findViewById(R.id.ImageCatalog)
            val textViewSecond :TextView = findViewById(R.id.textSecond)
            val textViewPrice :TextView = findViewById(R.id.textPrice)

            textView.text = card.title
            imageView.setImageResource(card.image)
            textViewSecond.text = card.secondText
            textViewPrice.text = card.price

            val addToFavoritesButton = findViewById<Button>(R.id.addToFavoritesButton)
            addToFavoritesButton.setOnClickListener {
                card?.isFavorite = true // Помечаем карточку как избранную
                // Здесь можно добавить логику для обновления интерфейса, например, изменение цвета кнопки
            }

            // Добавим обработку события "Добавить в корзину"
            val addToCartButton = findViewById<Button>(R.id.addToCartButton)
            addToCartButton.setOnClickListener {
                card?.isInCart = true // Помечаем карточку как добавленную в корзину
                // Здесь можно добавить логику для обновления интерфейса, например, изменение цвета кнопки
            }

        }
        val SignButton = findViewById<Button>(R.id.backbutton)
        SignButton.setOnClickListener {
            val intent = Intent(this, ListPage::class.java)
            startActivity(intent)
            finish()
        }


    }
}