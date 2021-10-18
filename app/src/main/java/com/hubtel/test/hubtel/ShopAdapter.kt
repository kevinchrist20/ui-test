package com.hubtel.test.hubtel

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hubtel.test.hubtel.databinding.ShopItemsLayoutBinding


class ShopAdapter : RecyclerView.Adapter<ShopAdapter.ShopVH>() {
    private var shopItems: ArrayList<Shop> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopAdapter.ShopVH {
        return ShopVH(
            ShopItemsLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ShopAdapter.ShopVH, position: Int) {
        val shopItem: Shop = shopItems[position]
        holder.bind(shopItem)
    }

    override fun getItemCount(): Int {
        return shopItems.size
    }

    fun addShopItems(shopList: ArrayList<Shop>) {
        shopItems = shopList
    }

    inner class ShopVH(private val binding: ShopItemsLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(shop: Shop) {
            binding.shopIv.setImageResource(shop.image)
            binding.deliveryTimeTv.text = shop.deliveryTime
            binding.deliveryTimeTv.bringToFront()
            binding.titleTv.text = shop.name
        }
    }
}