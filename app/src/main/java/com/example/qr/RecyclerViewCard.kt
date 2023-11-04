package com.example.qr

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewCard constructor(private val getActivity: ListPage, private val cardlist: List<Card>):
        RecyclerView.Adapter<RecyclerViewCard.MyViewHolder>() {
        var onItemClick : ((Card)->Unit)? =null

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
