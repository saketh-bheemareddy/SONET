package com.example.testdemo

class ListDemo {
    public var names = mutableListOf<String>("scott","Bob","Mac","Bern")

    fun display(){
        println(names[2])
        println(names.get(3))
        names.add(1,"Saketh")
        names.remove("Bern")
        for (name in names){
            println(name)
        }
        println("List completed")
        println("-----------------------------------------------")
    }
}

class SetDemo {
    public var names = hashSetOf<String>("scott","Bob","Mac","Bern")

    fun display(){
        names.add("Saketh")
        names.remove("Bern")
        for (name in names){
            println(name)
        }
        println("Set completed")
        println("------------------------------------------------")
    }
}
class MapDemo{
    var names = hashMapOf<Int,String>(
        101 to "scott",
        115 to "Mac",
        23 to "Bob"
    )

    fun display(){
        println(names.get(23))
        println(names[101])
        println(names.get(115))

        for (key in names){
            println(key)
        }
    }
}
fun main(){
    var listnames:ListDemo = ListDemo()
    listnames.display()
    var setnames:SetDemo = SetDemo()
    setnames.display()
    var mapnames:MapDemo = MapDemo()
    mapnames.display()
}