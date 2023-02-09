package com.slottica.casino.slotica.slots.sesesese

import android.content.Context
import android.content.SharedPreferences

object Prefs {

    val LINK = "link"

    fun getPref(context: Context, name: String): SharedPreferences = context.getSharedPreferences(name, Context.MODE_PRIVATE)

    inline fun SharedPreferences.editMe(operation: (SharedPreferences.Editor) -> Unit) {
        val editMe = edit()
        operation(editMe)
        editMe.apply()
    }
    var SharedPreferences.link
        get() = getString(LINK, "")
        set(value) {
            editMe {
                it.putString(LINK, value)
            }
        }


}