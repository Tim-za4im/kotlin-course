package lesson15

import lesson15.Person.ocompObject2
import lesson15.Person.person2

class pesron (
    val name : String,
    val age : Int
){


    fun sayHello () {
        println( " Helloб, my name  is $name and I am $age years old")
    }
}
class callculator {
    companion object {
        fun add (a: Int, b: Int): Int{
            return  a+b
        }
    }
}

class Calculator {
    companion object {
        fun add(a: Int, b: Int): Int {
            return a + b
        }
    }
}

fun main() {
    val result = Calculator.add(5, 3)
    println("Result: $result")

//*fun main() {
//    val person = Person("John", 30)
//    person.sayHello()
//}
//class Person(val name: String, var age: Int) {
//
//    // Метод класса
//    fun sayHello() {
//        println("Hello, my name is $name ad I am $age years old.")
//    }
//}*/
val person2=person2 ("John" , 30)
    person2.sayhello2()

    //Logger.log( " Matrix")

    val resukt = ocompObject2.add(5 , 2)

    ocompObject2.version2}
//data class User(val id: Int, val name: String)

//var lamp1 = Lamp ( isOn : true)
       // lamp.switch

///*fun advancedRemoveShelf(index: Int): List<String> {
//    val unallocatedItems = mutableListOf<String>()
//    if (index >= shelves.size) return unallocatedItems
//    val removedShelf = shelves.removeAt(index)
//    for (item in removedShelf.getItems().sortedByDescending { it.length }) {
//        if (addItem(item)) continue
//        unallocatedItems.add(item)
//    }
//    return unallocatedItems
//}
//
//