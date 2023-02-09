package com.slottica.casino.slotica.slots.sesesese.fragments

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.slottica.casino.slotica.slots.sesesese.ItemActivity
import com.slottica.casino.slotica.slots.sesesese.R
import com.slottica.casino.slotica.slots.sesesese.fragments.model.CardsModel
import com.slottica.casino.slotica.slots.sesesese.fragments.model.NewsModel

class AdapterNews(private val mList: List<NewsModel>) : RecyclerView.Adapter<AdapterNews.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.news_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]
        holder.news.text = ItemsViewModel.news
        holder.time.text = ItemsViewModel.time

    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val news: TextView = itemView.findViewById(R.id.item_text_news)
        val time: TextView = itemView.findViewById(R.id.item_txt_time)
    }
}
