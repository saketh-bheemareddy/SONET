package com.example.testdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
/*
        var name = findViewById<EditText>(R.id.name)
        var gender = findViewById<EditText>(R.id.gender)
        var age = findViewById<EditText>(R.id.age)
        var btn = findViewById<Button>(R.id.button5)

        btn.setOnClickListener(View.OnClickListener {
            val person = Person()
            person.name = name.text.toString()
            person.gender = gender.text.toString()
            person.age = age.text.toString().toInt()

            var result = if(person.age != 0)"${person.name}" else "person is minor"

            Toast.makeText(this,result,Toast.LENGTH_LONG).show()
        })*/
    }
}