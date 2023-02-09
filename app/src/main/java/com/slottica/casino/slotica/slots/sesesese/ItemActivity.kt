package com.slottica.casino.slotica.slots.sesesese

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_item.*
import kotlinx.android.synthetic.main.home_item.*

class ItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)
        img_item.setImageResource(intent.getIntExtra("icon",R.drawable.ragingbull)!!)
        txt_description.text=intent.getStringExtra("description")!!
    }
}