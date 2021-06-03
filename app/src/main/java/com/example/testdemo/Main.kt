package com.example.testdemo

fun main()
{
    val bicycle:Bicycle = Bicycle()
    bicycle.brandName = "Asia Cycles"
    bicycle.modelYear = 1996
    bicycle.display()

    val bicycle2:Bicycle = Bicycle()
    bicycle2.brandName = "Hero Cycles"
    bicycle2.modelYear = 2000
    bicycle2.display()
}