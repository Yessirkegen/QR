package com.example.qr

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ListPage : AppCompatActivity() {
    private var cardList= mutableListOf<Card>()
    private var recyclerView:RecyclerView? =null
    private var recyclerViewCardAdapter:RecyclerViewCard?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_page)

        cardList=ArrayList()
        recyclerView=findViewById(R.id.recycleList) as RecyclerView
        recyclerViewCardAdapter = RecyclerViewCard(this@ListPage, cardList)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = recyclerViewCardAdapter
        recyclerViewCardAdapter!!.onItemClick ={
            val intent = Intent(this, DetailedActivity::class.java)
            intent.putExtra("card", it)
            startActivity(intent)

        }

        prepareCardListData()

        }
    private fun prepareCardListData() {
        var card =  Card("Shirt Polo", R.drawable.img_39,"Short sleeve polo shirt","$179" )
        cardList.add(card)
        card =  Card("Shirt Polo", R.drawable.img_40,"Short sleeve polo shirt","$179" )
        cardList.add(card)
         card =  Card("Shirt Polo", R.drawable.img_41,"Short sleeve polo shirt","$179" )
        cardList.add(card)
         card =  Card("Shirt Polo", R.drawable.img_42,"Short sleeve polo shirt","$179" )
        cardList.add(card)
         card =  Card("Shirt Polo", R.drawable.img_43,"Short sleeve polo shirt","$179" )
        cardList.add(card)
         card =  Card("Shirt Polo", R.drawable.img_44,"Short sleeve polo shirt","$179" )
        cardList.add(card)

        recyclerViewCardAdapter!!.notifyDataSetChanged()
    }

}