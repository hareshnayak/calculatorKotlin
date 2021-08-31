package com.hareshnayak.developerdays

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val add : Button = findViewById(R.id.add)
        val sub : Button = findViewById(R.id.subtract)
        val mul : Button = findViewById(R.id.multiply)
        val div : Button = findViewById(R.id.divide)

        val num1 : EditText = findViewById(R.id.num1)
        val num2 : EditText = findViewById(R.id.num2)

        val ans : TextView = findViewById(R.id.answer)
        val op : TextView = findViewById(R.id.operator)

        val imageCal : ImageView = findViewById(R.id.imageView)

        add.setOnClickListener{
            op.text = "+"
            imageCal.setImageResource(R.drawable.add)
            ans.text = (num1.text.toString().toFloat() + num2.text.toString().toFloat()).toString()
        }
        sub.setOnClickListener{
            op.text = "-"
            imageCal.setImageResource(R.drawable.sub)
            ans.text = (num1.text.toString().toFloat() - num2.text.toString().toFloat()).toString()
        }
        mul.setOnClickListener{
            op.text = "x"
            imageCal.setImageResource(R.drawable.multi)
            ans.text = (num1.text.toString().toFloat() * num2.text.toString().toFloat()).toString()
        }
        div.setOnClickListener{
            op.text = "/"
            imageCal.setImageResource(R.drawable.divide)
            ans.text = (num1.text.toString().toFloat() / num2.text.toString().toFloat()).toString()
        }
    }
}