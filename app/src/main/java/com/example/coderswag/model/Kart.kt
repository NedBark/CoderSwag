package com.example.coderswag.model

object Kart {
    private val shoppingCart : ArrayList<Product> = arrayListOf()

    fun addToCart(product: Product){
        shoppingCart.add(product)
    }

    fun printCart(){
        println("Shopping cart products are:")
        for (e in shoppingCart)
            println("Product ${e.name} has price ${e.price}")
    }
}