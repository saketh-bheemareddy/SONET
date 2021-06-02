package com.example.testdemo

import java.util.*

/*
fun main(){
    print(checkTemp(28))
}

fun checkTemp(temp:Int):String = if(temp>30) "Hot" else "cold"
*/
fun main()
{
    var day = randomDay()
    var food = fishFood(day.toString());
    var isChangeWaterNeeded = shouldchangeWater(day.toString(),29,20 )
    println("It is $day today, you must feed with $food");
    print("Change water : ${if (isChangeWaterNeeded) "is Needed" else "Not Needed"}")
}

fun shouldchangeWater(day: String, temp: Int, dirtReading: Int): Boolean {
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