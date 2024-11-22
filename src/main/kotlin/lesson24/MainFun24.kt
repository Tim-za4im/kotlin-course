package lesson24

import java.io.File
import java.io.IOException

////fun setAge ( age : Int){
////    require( age >= 0){
////        "erorr "
////        error()
////    }
////}
//
//fun main() {
//    setAge(-1)
//    try {
//
//        val j = "String" as Double}
//    catch (e:  Throwable){
//        println("ClassException")
//    }
//
//    val u : Double=" 123.0".toDouble()
//    println(u)
//
//
//fun main() {
//
//
//
//    try {
//        val t= null
//        t!!
//        val r= listOf(1)
//        r[2]
//
//    } catch (e: NullPointerException) {
//        println("NullPointerException")
//        // Обработка конкретного типа исключения
//    } catch (e: RuntimeException) { println("ArrayIndexOutOfBoundsException")
//        throw IOException (e)
//        // Обработка всех остальных исключений
//    } finally {
//        println("Finally block")
//        // Блок, который выполняется всегда, независимо от наличия исключения
//    }
//
////    try {
////        // Код, который может выбросить исключения
////    } catch (e: Exception) {
////        when(e) {
////          //  is ExceptionA, is ExceptionB -> {
////                // Обработка исключений ExceptionA или ExceptionB
////                println("Обработано исключение типа A или B")
////            }
////            else -> throw e // Перебрасываем исключение дальше, если оно не соответствует обработанным типам
////        }
//    }
//
//
//    val file = File ("sadasdasdas")
//    file.canRead()
//    file.createNewFile()
//    val o = file.inputStream()
//    o.close()
//    o.read()
//
////    val list = mutableListOf("")
////    try{
////    while(true){
////        list.add("dannie")
////    }}catch (e: Throwable){
////        println("not member")
////    }
//
//}