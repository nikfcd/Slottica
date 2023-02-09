package com.slottica.casino.slotica.slots.sesesese.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.slottica.casino.slotica.slots.sesesese.R
import com.slottica.casino.slotica.slots.sesesese.fragments.model.loadCardsModel
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_home, container, false)
        val recyclerview = view.findViewById<RecyclerView>(R.id.rec_home)
        recyclerview.layoutManager = GridLayoutManager(requireContext(),2,RecyclerView.VERTICAL,false)
        val adapter = AdapterHome(loadCardsModel("all"),"all",requireContext())
        recyclerview.adapter = adapter
        view.cs_all_games.setOnClickListener {
            val adapter = AdapterHome(loadCardsModel("all"),"all",requireContext())
            recyclerview.adapter = adapter
        }
        view.cs_new_games.setOnClickListener {
            val adapter = AdapterHome(loadCardsModel("new"),"new",requireContext())
            recyclerview.adapter = adapter
        }
        view.cs_popular_games.setOnClickListener {
            val adapter = AdapterHome(loadCardsModel("popular"),"popular",requireContext())
            recyclerview.adapter = adapter
        }
        return view
    }


}