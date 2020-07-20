package com.example.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.R
import com.example.coderswag.model.Product

class ProductRecyclerAdapter(private val context: Context, private val products: List<Product>, val itemClick: (Product) -> Unit) : RecyclerView.Adapter<ProductRecyclerAdapter.Holder>(){

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val productImage: ImageView = itemView.findViewById<ImageView>(R.id.productImageID)
        private val productPrice: TextView = itemView.findViewById<TextView>(R.id.priceID)
        private val productTitle: TextView = itemView.findViewById<TextView>(R.id.titleID)

        fun bindHolder(product: Product, context: Context){
            val imageID = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage.setImageResource(imageID)
            productPrice.text = product.price
            productTitle.text = product.name
            itemView.setOnClickListener { itemClick(product) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val itemViewInflated = LayoutInflater.from(parent.context).inflate(R.layout.product_list_item, parent, false)
        return Holder(itemViewInflated)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindHolder(products[position], context)
    }

}