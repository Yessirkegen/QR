package com.example.qr

import Card
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewCard(private val getActivity: ListPage, private var cardlist: List<Card>):
        RecyclerView.Adapter<RecyclerViewCard.MyViewHolder>() {



    var onItemClick : ((Card)->Unit)? =null
    fun filterList(filteredList: List<Card>) {
        cardlist = filteredList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cardlist.size
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val cloth =cardlist[position]
        holder.cardTitle.text = cardlist[position].title
        holder.cardTitleSecond.text= cardlist[position].secondText
        holder.cardPrice.text = cardlist[position].price
        holder.cardImage.setImageResource(cardlist[position].image)

        holder.cardView.setOnClickListener{
            Toast.makeText(getActivity, cardlist[position].title, Toast.LENGTH_LONG).show()
            onItemClick?.invoke(cloth)
        }



    }
    class MyViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        val cardTitle : TextView = itemView.findViewById(R.id.cardnametext)
        val cardTitleSecond : TextView = itemView.findViewById(R.id.cardsecondtext)
        val cardPrice : TextView = itemView.findViewById(R.id.cardpricetext)
        val cardImage : ImageView = itemView.findViewById(R.id.cardImage)
        val cardView : CardView = itemView.findViewById(R.id.cardMain)

    }


}
class RecyclerViewCardFav(private val getActivity: FavActivity, private var cardlist: List<Card>):
    RecyclerView.Adapter<RecyclerViewCardFav.MyViewHolder>() {



    var onItemClick : ((Card)->Unit)? =null
    fun filterList(filteredList: List<Card>) {
        cardlist = filteredList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return MyViewHolder(view)
    }


    override fun onBindViewHolder(holder: RecyclerViewCardFav.MyViewHolder, position: Int) {
        val cloth =cardlist[position]
        holder.cardTitle.text = cardlist[position].title
        holder.cardTitleSecond.text= cardlist[position].secondText
        holder.cardPrice.text = cardlist[position].price
        holder.cardImage.setImageResource(cardlist[position].image)

        holder.cardView.setOnClickListener{
            Toast.makeText(getActivity, cardlist[position].title, Toast.LENGTH_LONG).show()
            onItemClick?.invoke(cloth)
        }



    }

    override fun getItemCount(): Int {
        return cardlist.size
    }



    class MyViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        val cardTitle : TextView = itemView.findViewById(R.id.cardnametext)
        val cardTitleSecond : TextView = itemView.findViewById(R.id.cardsecondtext)
        val cardPrice : TextView = itemView.findViewById(R.id.cardpricetext)
        val cardImage : ImageView = itemView.findViewById(R.id.cardImage)
        val cardView : CardView = itemView.findViewById(R.id.cardMain)

    }


}
class RecyclerViewCardBuy(private val getActivity: BuyActivity, private var cardlist: List<Card>):
    RecyclerView.Adapter<RecyclerViewCardBuy.MyViewHolder>() {



    var onItemClick : ((Card)->Unit)? =null
    fun filterList(filteredList: List<Card>) {
        cardlist = filteredList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return MyViewHolder(view)
    }


    override fun onBindViewHolder(holder: RecyclerViewCardBuy.MyViewHolder, position: Int) {
        val cloth =cardlist[position]
        holder.cardTitle.text = cardlist[position].title
        holder.cardTitleSecond.text= cardlist[position].secondText
        holder.cardPrice.text = cardlist[position].price
        holder.cardImage.setImageResource(cardlist[position].image)

        holder.cardView.setOnClickListener{
            Toast.makeText(getActivity, cardlist[position].title, Toast.LENGTH_LONG).show()
            onItemClick?.invoke(cloth)
        }



    }

    override fun getItemCount(): Int {
        return cardlist.size
    }



    class MyViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        val cardTitle : TextView = itemView.findViewById(R.id.cardnametext)
        val cardTitleSecond : TextView = itemView.findViewById(R.id.cardsecondtext)
        val cardPrice : TextView = itemView.findViewById(R.id.cardpricetext)
        val cardImage : ImageView = itemView.findViewById(R.id.cardImage)
        val cardView : CardView = itemView.findViewById(R.id.cardMain)

    }

    }