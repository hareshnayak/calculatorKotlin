package com.hareshnayak.developerdays

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

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

        var ans : TextView = findViewById(R.id.answer)
        var op : TextView = findViewById(R.id.operator)

        add.setOnClickListener{
            op.text = "-"
            ans.text = (num1.text.toString().toFloat() + num2.text.toString().toFloat()).toString()
        }
        sub.setOnClickListener{
            op.text = "-"
            ans.text = (num1.text.toString().toFloat() - num2.text.toString().toFloat()).toString()
        }
        mul.setOnClickListener{
            op.text = "x"
            ans.text = (num1.text.toString().toFloat() * num2.text.toString().toFloat()).toString()
        }
        div.setOnClickListener{
            op.text = "/"
            ans.text = (num1.text.toString().toFloat() / num2.text.toString().toFloat()).toString()
        }
    }
}