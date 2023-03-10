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

class AdapterHome(private val mList: List<CardsModel>, val filter:String, val context: Context) : RecyclerView.Adapter<AdapterHome.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.home_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]

            holder.imageView.setImageResource(ItemsViewModel.icon)
            holder.name.text = ItemsViewModel.name

        holder.itemView.setOnClickListener {
            val intent= Intent(context,ItemActivity::class.java)
            intent.putExtra("name",ItemsViewModel.name)
            intent.putExtra("description",ItemsViewModel.description)
            intent.putExtra("icon",ItemsViewModel.icon)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.item_img)
        val name: TextView = itemView.findViewById(R.id.item_txt_name)
    }
}
