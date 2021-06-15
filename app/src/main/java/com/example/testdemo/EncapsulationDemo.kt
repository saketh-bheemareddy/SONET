package com.example.testdemo


open class A{
    public var a:Int = 10
    private var b:Int = 20
    open var c:Int = 30
    protected var d:Int = 40

    open fun display(){
        println("A class variable a = $a")
        println("A class variable b = $b")
    }
    protected fun test(){
        println("Hello")
    }

}
class EncapsulationDemo:A() {
    override var c:Int = 100
    override fun display() {
        super.display()
        println("Encapculation class variable $a")
        println("Encapculation class variable $c")
        println("Encapculation class variable $d")
        test()
    }
}

fun main(){
    var en:EncapsulationDemo = EncapsulationDemo()
    en.display()
}