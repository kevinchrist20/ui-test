package com.hubtel.test.hubtel

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ShopActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)

        val toolbar = findViewById<Toolbar>(R.id.shop_toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.let {
            it.setDisplayShowTitleEnabled(true)
            it.title = "Shop"
        }

        val recyclerView = findViewById<RecyclerView>(R.id.shop_recycler_view).apply {
            layoutManager = LinearLayoutManager(this@ShopActivity)
            setHasFixedSize(true)
        }

        val adapter = ShopAdapter()
        adapter.addShopItems(loadShopItems())
        recyclerView.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.shop_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.profile -> {
                startActivity(Intent(this, MainActivity::class.java))
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun loadShopItems(): ArrayList<Shop> {
        return arrayListOf(
            Shop(R.drawable.image, "Toiletries", "180 Minutes Delivery"),
            Shop(R.drawable.image, "Frozen Foods", "90 Minutes Delivery"),
            Shop(R.drawable.image, "Toiletries", "180 Minutes Delivery"),
            Shop(R.drawable.image, "Cooking Oils And Sprays¬", "60 Minutes Delivery"),
            Shop(R.drawable.image, "Toiletries", "180 Minutes Delivery"),
            Shop(R.drawable.image, "Frozen Foods", "90 Minutes Delivery"),
            Shop(R.drawable.image, "Toiletries", "180 Minutes Delivery"),
            Shop(R.drawable.image, "Cooking Oils And Sprays¬", "60 Minutes Delivery"),
            Shop(R.drawable.image, "Toiletries", "180 Minutes Delivery"),
            Shop(R.drawable.image, "Toiletries", "180 Minutes Delivery"),
            Shop(R.drawable.image, "Frozen Foods", "90 Minutes Delivery"),
            Shop(R.drawable.image, "Toiletries", "180 Minutes Delivery"),
            Shop(R.drawable.image, "Cooking Oils And Sprays¬", "60 Minutes Delivery"),
            Shop(R.drawable.image, "Toiletries", "180 Minutes Delivery"),
            Shop(R.drawable.image, "Frozen Foods", "90 Minutes Delivery"),
            Shop(R.drawable.image, "Toiletries", "180 Minutes Delivery"),
            Shop(R.drawable.image, "Cooking Oils And Sprays¬", "60 Minutes Delivery")
        )
    }

}