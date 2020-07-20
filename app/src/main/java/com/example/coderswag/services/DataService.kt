package com.example.coderswag.services

import com.example.coderswag.model.Category
import com.example.coderswag.model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("DDD", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Beanie", "$15", "hat1"),
        Product("Hat Black", "$20", "hat2"),
        Product("Hat White", "$10", "hat3"),
        Product("Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
        Product("Hoodie Gray", "$15", "hoodie1"),
        Product("Hoodie Red", "$20", "hoodie2"),
        Product("Hoodie Gray", "$10", "hoodie3"),
        Product("Hoodie Black", "$22", "hoodie4")
    )

    val shirts = listOf(
        Product("Shirt Black", "$15", "hoodie1"),
        Product("Shirt Black", "$20", "hoodie2"),
        Product("Shirt Logo Red", "$10", "hoodie3"),
        Product("Shirt Hustle", "$22", "hoodie4"),
        Product("KickFlip Studios", "$22", "hoodie4")
    )

    val digitalGoods = emptyList<Product>()

    init {
        println("Singleton ${this::class.java} was initiated with data")
    }

    fun getProducts(category: String) : List<Product> {
        return when (category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods
        }
    }

}