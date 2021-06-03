package com.example.testdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        var temp = findViewById<EditText>(R.id.temp)
        var dirt = findViewById<EditText>(R.id.dirt)
        var result = findViewById<TextView>(R.id.textView4)
        var btn = findViewById<Button>(R.id.button4)

        btn.setOnClickListener (View.OnClickListener {

            var temp:Int = temp.text.toString().toInt()
            var dirt:Int = dirt.text.toString().toInt()

            var day = randomDay()
            var food = fishFood(day.toString());
            var isChangeWaterNeeded = shouldchangeWater(day.toString(),temp,dirt )
            result.setText("It is $day today, you must feed with $food \n Change water : ${if (isChangeWaterNeeded) "is Needed" else "Not Needed"}")
        })
    }
    fun shouldchangeWater(day: String, temp: Int, dirtReading: Int): Boolean
    {
        return when {
            isHot(temp) -> true
            isDirt(dirtReading) -> true
            isSunday(day) -> true
            else ->false
        }
    }

    fun fishFood(day:String):String
    {
        var food:String = ""
        when(day){
            "Monday" -> food = "flakes"
            "Tuesday" -> food = "pellets"
            "Wednesday" -> food = "redworms"
            "Thursday" -> food = "granules"
            "Friday" -> food = "mosquitoes"
            "Saturday" -> food = "lettuce"
            "Sunday" -> food = "plankton"
        }
        return food;
    }
    fun isHot(temp:Int):Boolean = temp > 30
    fun isDirt(dirtReading:Int) = dirtReading > 30
    fun isSunday(day:String) = day == "Sunday"

    fun randomDay(): String {
        var days = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
        var num:Int = Random().nextInt(days.size) // 0 to 6
        var day = days[num]
        return day
    }
}
