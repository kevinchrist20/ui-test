package com.hubtel.test.hubtel

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.let {
            it.setDisplayHomeAsUpEnabled(true)
            it.setDisplayShowTitleEnabled(false)
        }

        val settingsAdapter = SettingsAdapter(this, loadData())
        val listView = findViewById<ListView>(R.id.main_list_view)
        listView.adapter = settingsAdapter
    }

    private fun loadData(): ArrayList<Setting> {
        return arrayListOf(
            Setting(R.drawable.ic_monetization, "Coupons"),
            Setting(R.drawable.ic_payments, "Payments"),
            Setting(R.drawable.ic_message, "Messaging"),
            Setting(R.drawable.ic_security, "Security"),
        )
    }
}