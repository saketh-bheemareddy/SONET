package com.example.testdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var input = findViewById<EditText>(R.id.inputtxt);
        var btn = findViewById<Button>(R.id.button);
        var result = findViewById<TextView>(R.id.textView)

        btn.setOnClickListener (View.OnClickListener {
            var a:Editable = input.text;
            var number:Int = a.toString().toInt();
            var i:Int = 1
            var res:String = ""
            while (true){
                if (i==number)
                    break;
                res += "@$i" // concatinating string
                ++i
            }
            result.setText(res)
        });
    }
}