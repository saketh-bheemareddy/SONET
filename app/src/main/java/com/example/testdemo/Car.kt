package com.example.testdemo

class Car : Vehicle{
    override var name:String = "Mercedes"
    override var mediumOfTravel:String = "Land"
    override var wheels:Int = 4
    override fun display(){
        println("the $name has $wheels wheels and runs on the $mediumOfTravel")
    }

    fun m1(){
        println("Hello")
    }
}