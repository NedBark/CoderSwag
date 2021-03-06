package com.example.coderswag.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.R
import com.example.coderswag.adapters.ProductRecyclerAdapter
import com.example.coderswag.model.Product
import com.example.coderswag.services.DataService
import com.example.coderswag.utils.EXTRA_CATEGORY
import com.example.coderswag.utils.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_products.*
import kotlinx.android.synthetic.main.product_list_item.*

class ProductsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)

        val adapter =  ProductRecyclerAdapter(this, DataService.getProducts(categoryType!!)) { product ->
            println(product.name)
            val productDetailIntent = Intent(this, ProductDetailActivity::class.java)
            productDetailIntent.putExtra(EXTRA_PRODUCT, product)
            this.startActivity(productDetailIntent)
        }

        val layoutManager = GridLayoutManager(this, 2)
        productsListViewID.layoutManager = layoutManager
        productsListViewID.setHasFixedSize(true)
        productsListViewID.adapter = adapter
    }
}