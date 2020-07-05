package com.x1aolata.demo02_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var change = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        when (v?.id) {
            R.id.button -> {
                textView.text = (editText.text.toString())
            }

            R.id.button2 -> {
                imageView.setImageResource(
                    if (change) {
                        change = !change
                        R.drawable.test_image2
                    } else {
                        change = !change
                        R.drawable.test_image1
                    }
                )
            }

            R.id.button3 -> {
                progressBar.visibility = when (progressBar.visibility) {
                    View.VISIBLE -> View.GONE
                    View.GONE -> View.VISIBLE
                    else -> View.VISIBLE
                }
            }

            R.id.button4 -> {
                AlertDialog.Builder(this).apply {

                    setTitle("Dialog")
                    setMessage("警告")
                    setCancelable(false)
                    setPositiveButton("OK") { dialog, which ->
                    }
                    setNegativeButton("Cancel") { dialog, which ->
                    }
                    show()
                }
            }

        }
    }
}
