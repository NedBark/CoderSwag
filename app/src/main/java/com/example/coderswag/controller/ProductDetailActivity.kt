package com.example.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.coderswag.R
import com.example.coderswag.model.Kart
import com.example.coderswag.model.Product
import com.example.coderswag.utils.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    lateinit var product: Product

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        product = this.intent.getParcelableExtra<Product>(EXTRA_PRODUCT)!!

        val productImage = this.findViewById<ImageView>(R.id.productDetailImageID)
        val productTitle = this.findViewById<TextView>(R.id.productDetailTitleID)
        val productPrice = this.findViewById<TextView>(R.id.productDetailPriceID)

        productImage.setImageResource(this.resources.getIdentifier(product.image, "drawable", this.packageName))
        productTitle.text = product.name
        productPrice.text = product.price
    }

    fun addToCartClicked(view: View){
        println("Added to cart")
        Kart.addToCart(product)
        Toast.makeText(this, "Added to cart", Toast.LENGTH_SHORT).show()
        Kart.printCart()
    }
}