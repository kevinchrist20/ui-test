package com.hubtel.test.hubtel

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class SettingsAdapter(private val context: Activity, private val settings: ArrayList<Setting>) :
    ArrayAdapter<Setting>(context, R.layout.settings_list_layout, settings) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val setting: Setting = getItem(position) as Setting
        val convertView = LayoutInflater.from(context).inflate(R.layout.settings_list_layout, parent, false)

        val itemIV = convertView.findViewById<ImageView>(R.id.settings_iv)
        val itemTextView = convertView.findViewById<TextView>(R.id.settings_title)

        itemIV.setImageResource(setting.icon)
        itemTextView.text = setting.title
        return convertView
    }

    override fun getCount(): Int {
        return settings.size
    }
}