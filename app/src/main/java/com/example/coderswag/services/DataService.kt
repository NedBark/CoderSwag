package com.example.coderswag.services

import com.example.coderswag.model.Category
import com.example.coderswag.model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Beanie", "$15", "hat01"),
        Product("Hat Black", "$20", "hat02"),
        Product("Hat White", "$10", "hat03"),
        Product("Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
        Product("Hoodie Gray", "$15", "hoodie01"),
        Product("Hoodie Red", "$20", "hoodie02"),
        Product("Hoodie Gray", "$10", "hoodie03"),
        Product("Hoodie Black", "$22", "hoodie04")
    )

    val shirts = listOf(
        Product("Shirt Black", "$15", "hoodie01"),
        Product("Shirt Black", "$20", "hoodie02"),
        Product("Shirt Logo Red", "$10", "hoodie03"),
        Product("Shirt Hustle", "$22", "hoodie04"),
        Product("KickFlip Studios", "$22", "hoodie04")
    )

    init {
        println("Singleton ${this::class.java} was initiated with data")
    }

}