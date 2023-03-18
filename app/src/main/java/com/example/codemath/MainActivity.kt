package com.example.codemath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val submit = findViewById<Button>(R.id.button)
        val firstnumber = findViewById<EditText>(R.id.firstnumber)
        val secondnumber = findViewById<EditText>(R.id.secondnumber)
       val add = findViewById<Button>(R.id.addition)
        val divide = findViewById<Button>(R.id.divide)
        val subtract = findViewById<Button>(R.id.subtract)
        val multiply = findViewById<Button>(R.id.multiply)

        val answer = findViewById<TextView>(R.id.answer)


        add.setOnClickListener{
            val first = firstnumber.text.toString().toInt()
            val second = secondnumber.text.toString().toInt()
            val calc = first+second
            answer.text = calc.toString()
        }
        subtract.setOnClickListener{
            val first = firstnumber.text.toString().toInt()
            val second = secondnumber.text.toString().toInt()
            val calc = first-second
            answer.text = calc.toString()
        }
        divide.setOnClickListener{
            val first = firstnumber.text.toString().toInt()
            val second = secondnumber.text.toString().toInt()
            val calc = first/second
            answer.text = calc.toString()
        }
        multiply.setOnClickListener{
            val first = firstnumber.text.toString().toInt()
            val second = secondnumber.text.toString().toInt()
            val calc = first*second
            answer.text = calc.toString()
        }


    }
}