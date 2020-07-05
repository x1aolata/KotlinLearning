package com.x1aolata.demo03_listview

import android.app.Activity
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

/**
 * @author x1aolata
 * @date  2020/7/5 21:36
 * @script 水果适配器
 */
class FruitAdapter(activity: Activity, val resourceId: Int, data: ArrayList<Fruit>) :
    ArrayAdapter<Fruit>(activity, resourceId, data) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(context).inflate(resourceId, parent, false)

        val fruitImage: ImageView = view.findViewById(R.id.fruit_imageView)
        val fruitName: TextView = view.findViewById(R.id.fruit_textView)
        val fruit = getItem(position)
        fruit?.let {
            fruitImage.setImageResource(fruit.imageId)
            fruitName.text = fruit.name
        }
        return view
    }
}