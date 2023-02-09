package com.slottica.casino.slotica.slots.sesesese

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_item.*
import kotlinx.android.synthetic.main.activity_itemnews.*

class ItemnewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_itemnews)
        img_itemnews.setImageResource(intent.getIntExtra("icon",R.drawable.ragingbull)!!)
        txt_fullnews.text=intent.getStringExtra("name")!!
    }
}