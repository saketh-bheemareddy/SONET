package com.example.testdemo
/*
class Person {
    var name:String? = null
    get() = field
    set(value) {
        field = value?.uppercase()
    }
    var gender:String? =null
    var age:Int = 0 set(value) = if (value < 18) field = 0 else field = value

}
*/
class Persons(var name:String, var weightLbs:Double){
    //Initialisation block
    init{
        print("Test")
    }
    //secondary constructor
    constructor(name:String): this("",0.0){
        println("Hello")
    }
    var weightKilo:Double
    get() = weightLbs/2.0
    set(value) {
        weightLbs = value*2.0
    }
    fun eatSweets(addIeCream:Boolean){
        weightLbs += if (addIeCream) 4.0 else 2.0
    }
    fun calGoal(weighttolose:Double):Double{
        return weightLbs-weighttolose
    }
}