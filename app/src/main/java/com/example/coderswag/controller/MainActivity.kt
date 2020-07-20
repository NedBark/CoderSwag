package com.example.coderswag.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.R
import com.example.coderswag.adapters.CategoryRecyclerAdapter
import com.example.coderswag.services.DataService
import com.example.coderswag.utils.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerAdapter(this, DataService.categories) { category -> println(category.title)
            intent = Intent(this, ProductsActivity::class.java)
            intent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(intent)
        }
        listViewCategory.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        listViewCategory.layoutManager = layoutManager
        listViewCategory.setHasFixedSize(true)


    }
}