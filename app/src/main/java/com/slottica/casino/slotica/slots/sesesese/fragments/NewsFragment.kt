package com.slottica.casino.slotica.slots.sesesese.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.slottica.casino.slotica.slots.sesesese.R
import com.slottica.casino.slotica.slots.sesesese.fragments.model.loadCardsModel
import com.slottica.casino.slotica.slots.sesesese.fragments.model.loadNewsModel
import kotlinx.android.synthetic.main.fragment_home.*


class NewsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_news, container, false)
        val recyclerview = view.findViewById<RecyclerView>(R.id.rec_news)
        recyclerview.layoutManager = GridLayoutManager(requireContext(),1,
            RecyclerView.VERTICAL,false)
        val adapter = AdapterNews(loadNewsModel())
        recyclerview.adapter = adapter

        return view
    }


}