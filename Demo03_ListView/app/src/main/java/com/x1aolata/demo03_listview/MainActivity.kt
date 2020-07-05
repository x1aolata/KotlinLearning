package com.x1aolata.demo03_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private val data = listOf<String>(
        "Apple",
        "Banana",
        "Orange",
        "Apple",
        "Banana",
        "Orange",
        "Apple",
        "Banana",
        "Orange",
        "Apple",
        "Banana",
        "Orange",
        "Apple",
        "Banana",
        "Orange",
        "Apple",
        "Banana",
        "Orange"
    )


    private val fruitList = ArrayList<Fruit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFruits()
//      val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data)
        val adapter = FruitAdapter(this, R.layout.fruit_item, fruitList)
        listView.adapter = adapter


        listView.setOnItemClickListener { parent, view, position, id ->
            val fruit = fruitList[position]
            Toast.makeText(this, fruit.name, Toast.LENGTH_SHORT).show()
        }


    }

    private fun initFruits() {
        repeat(100) {

            fruitList.add(Fruit("Apple", R.drawable.ic_launcher_background))
            fruitList.add(Fruit("Banana", R.drawable.ic_launcher_foreground))
            fruitList.add(Fruit("Orange", R.drawable.ic_launcher_background))
        }
    }
}
