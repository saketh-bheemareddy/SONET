package com.example.testdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var num_1 = findViewById<EditText>(R.id.num1)
        var num_2 = findViewById<EditText>(R.id.num2)
        var btn = findViewById<Button>(R.id.button3)
        var result = findViewById<TextView>(R.id.textView3)
        var spin:Spinner = findViewById<Spinner>(R.id.spinner)

        btn.setOnClickListener (View.OnClickListener {

            var number1:Float = num_1.text.toString().toFloat()
            var number2:Float = num_2.text.toString().toFloat()
            var s = spin.selectedItem.toString()
            when(s) {
                "+" -> result.setText("Result : "+add(number1,number2))
                "-" -> result.setText("Result : "+subtract(number1,number2))
                "*" -> result.setText("Result : "+multiply(number1,number2))
                "/" -> result.setText("Result : "+divide(number1,number2))
            }
        })

    }
}
fun add(a:Float,b:Float) = a+b
fun subtract(a:Float,b:Float) = a-b
fun multiply(a:Float,b:Float) = a*b
fun divide(a:Float,b:Float) = a/b