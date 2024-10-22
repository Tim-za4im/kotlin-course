package lesson15

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
}
//*fun main() {
//    val person = Person("John", 30)
//    person.sayHello()
//}
//class Person(val name: String, var age: Int) {
//
//    // Метод класса
//    fun sayHello() {
//        println("Hello, my name is $name and I am $age years old.")
//    }
//}*/

data class User(val id: Int, val name: String)

var lamp1 = Lamp ( isOn : true)
        lamp.switch