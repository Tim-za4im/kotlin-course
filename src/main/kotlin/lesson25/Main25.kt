package less

import java.awt.SystemColor.text

fun main() {
    val i = fun(a: Int): Int {
        return a + 1
    }
    println(i(1))


    val k: (c: Int) -> Int = {
        it + 1
    }

    val d = { d: Int ->
        d + 1
        println("")
    }


    fun j(b: Int): Int {
        return b + 1
    }
//
//    val findIndex = fun(text: String, word: String, ignoreCase: Boolean = false): Int {
//        return text.indexOf(word, startIndex = 0, ignoreCase)
    }

    val findIndex2: (String, String, Boolean) -> Int = { text, word, ignoreCase ->
        text.indexOf(word, startIndex = 0, ignoreCase)
    }

    val findIndex3 = { text: String, word: String, ignoreCase: Boolean ->
        text.indexOf(word, startIndex = 0, ignoreCase)
    }

   // println()//findIndex2("I love Kotlin", "Love", false))


    fun findIndex(text: String, word: String, ignoreCase: Boolean = false): Int {
        return text.indexOf(word, startIndex = 0, ignoreCase)
    }
//
//    val calculateDeliveryTime = fun OrderProccessor.(productId: Int): String {
//
//        val deliveryTimeDays = when (productId) {
//
//            in 1..100 -> 3
//
//            else -> 5

//        }
//
//        return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу " //$deliveryAddress."
//
//    }
////
////    fun OrderProccessor.calculateDeliveryTime(productId: Int): String {
//
//        val deliveryTimeDays = when (productId) {
//
//            in 1..100 -> 3
//
//            else -> 5
//
//        }
//
//        return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу "//$deliveryAddress."
//
//    }
////
//////Лямбда выражение
//    //val calculateDeliveryTime1: OrderProccessor.(Int) -> String = {
//
//        val deliveryTimeDays = when (it) {
//
//            in 1..100 -> 3
//
//            else -> 5



//        "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу "//$deliveryAddress."
//
//    }
//
//    //val op = OrderProccessor("my address")
//
//    //op.calculateDeliveryTime1(34)
//
//    val anonyb = fun() {
//        println("qwert")
//    }
//    val anonym1: () -> Unit = {
//        println("qwert")
//    }
//
//    val functiob22 = {
//        println("qwert")
//    }
//
//    val functio44: (String) -> Int = {
//        it.length
//    }
//    val funk5 = { f: String -> f.length }

//    val anonymStringer = fun Stringe19.(a: Int, b: Int): Boolean {
//        println(this)
//        println(a)
//        println(b)
//        return a == b

//        val fuctyion: String(Int, Int)-> Boolean ={ a, b ->
//            println(this)
//            println(a)
//            println(b)
//            return a == b
//        }
//
//        val function37 = fun Set<Int>.filterEven(): Set<Int {
//            return this.filter { if% 2 == 0 }.toSet()
//        }
//
//        val function38: Set<Int>.() -> Set<Int> = {
//            filter { it % 2 == 0 }.toSet()
//        }
//
//        fun sumList(list: List<Int>): Int {
//            return list.filter { it > 0 }.sum
//        }
//    }
//    val sumlist23: (List<Int>) -> Int = { list ->
//        list.filter { it > 0 }.sum
//    }
//
//    val sumulist24 = fun(list: List<Int>): Int {
//        list.filter { it > 0 }.sum
//    }
//    val function25 = { list: List<Int -> list.filter { it > 0 }.sum }
//}
//
//}
//fun Stringe19.anonymStringer(a: Int, b: Int): Boolean {
//    println(this)
//    println(a)
//    println(b)
//    return a == b
//
//
//}
//
//val functiion33 (w:String):Int
//{
//    return w.length
//}
//
//class OrderProccessor(val deliverryAddress: String) {
//    fun calkulitorDeliveryTime(productID: Int): String {
//
//        val deliveryTimeDays = when (productID) {
//            in 1..100 -> 3
//            else -> 5
//        }
//        return "Ожидание дата доставкиЖ через 4; через $deliveryTimeDays дня по адресу $deliverryAddress"
//    }
//}
//
//
//fun function() {
//    println("qwert")
//}
//
//fun set<Int>.filterEven(): Set<Int {
//    return this.filter { if% 2 == 0 }.toSet()
//}