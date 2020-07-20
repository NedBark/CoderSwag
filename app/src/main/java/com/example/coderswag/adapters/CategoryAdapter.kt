package com.example.coderswag.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.R
import com.example.coderswag.model.Category
import com.example.coderswag.services.DataService
import java.text.FieldPosition

class CategoryAdapter(val context: Context, val categories: List<Category>) : BaseAdapter(){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView : View
        val holder: ViewHolder
        if (convertView == null){
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()

            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryText = categoryView.findViewById(R.id.categoryLabel)
            categoryView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        val categ = categories[position]
        holder.categoryText?.text = categ.title
        val resourceID = context.resources.getIdentifier(categ.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceID)
        return categoryView
    }

    override fun getItem(index: Int): Any {
        return categories[index]
    }

    override fun getItemId(index: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }


    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryText: TextView? = null
    }

}