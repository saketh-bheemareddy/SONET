package com.example.testdemo

class Bicycle {
    var brandName:String = ""
    //getter
    get() {
        return field
    }
    //setter
    set(value) {
        field = value.uppercase()
    }
    var modelYear:Int = 0
    get() =  field
    set(value) {
        if (value > 1990) {
            field = value
        }
        else{
           // println("Model not in prodoction")
            throw Exception("Model not in prodoction")
        }
    }

    fun display(){
        println("$brandName -> $modelYear")
    }
}
