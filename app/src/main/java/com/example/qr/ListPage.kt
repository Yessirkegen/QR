package com.example.qr

import Card
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.Locale


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
        var card =  Card("GGG", R.drawable.img_39,"Short sleeve polo shirt","$179" )
        cardList.add(card)
        card =  Card("Canelo", R.drawable.img_40,"Short sleeve polo shirt","$179")
        cardList.add(card)
         card =  Card("Shirt Polo", R.drawable.img_41,"Short sleeve polo shirt","$179")
        cardList.add(card)
         card =  Card("Shirt Polo", R.drawable.img_42,"Short sleeve polo shirt","$179")
        cardList.add(card)
         card =  Card("Shirt Polo", R.drawable.img_43,"Short sleeve polo shirt","$179")
        cardList.add(card)
         card =  Card("Shirt Polo", R.drawable.img_44,"Short sleeve polo shirt","$179" )
        cardList.add(card)

        recyclerViewCardAdapter!!.notifyDataSetChanged()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.search_menu, menu)
        val searchItem = menu?.findItem(R.id.action_search)
        val searchView = searchItem?.actionView as SearchView

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                // Handle the search query submission
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                // Filter the RecyclerView data based on the search query
                val searchText = newText.orEmpty().toLowerCase(Locale.getDefault())
                filterRecyclerView(searchText)
                return true
            }
        })

        return super.onCreateOptionsMenu(menu)
    }
    private fun filterRecyclerView(query: String) {
        val filteredList = ArrayList<Card>()

        for (item in cardList) {
            if (item.title.toLowerCase(Locale.getDefault()).contains(query)) {
                filteredList.add(item)
            }
        }

        // Update the RecyclerView adapter with the filtered list
        recyclerViewCardAdapter?.filterList(filteredList)
    }


}
