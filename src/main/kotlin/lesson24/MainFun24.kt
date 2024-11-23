package lesson24

import java.io.File
import java.io.IOException

//try {
//
//    // Код, который может выбросить исключение
//
//} catch (e: SpecificException) {
//
//    // Обработка конкретного типа исключения
//
//} catch (e: Exception) {
//
//    // Обработка всех остальных исключений
//
//} finally {
//
//    // Блок, который выполняется всегда, независимо от наличия исключения
//
//}
//
//
//try {
//
//    // Код, который может выбросить исключения
//
//} catch (e: Exception) {
//
//    when(e) {
//
//        is ExceptionA, is ExceptionB -> {
//
//            // Обработка исключений ExceptionA или ExceptionB
//
//            println("Обработано исключение типа A или B")
//
//        }
//
//        else -> throw e // Перебрасываем исключение дальше, если оно не соответствует обработанным типам
//
//    }
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
//try {
//    val i = "string" as Double
//} catch (e: Throwable) {
//    println("ClassCastException")
//}
//
//val i = "123.0".toDouble()
//println(i)
//
//
//setAge(-1)
//val file = File("lasjdkljaskldjalkj")
//file.createNewFile()
//val i = file.inputStream()
//i.close()
//i.read()
//
//val list = mutableListOf("")
//try {
//    while (true) {
//        list.add("лралорывлоралоывралоырволарыолвралоырваолроаоырвлоралыорвлаорыл")
//    }
//} catch (e: Throwable) {
//    println("не отдам память")
//}
//try {
//    stack()
//} catch (e: Throwable) {
//    println("StackOverFlow")
//}
//}
//
//class OrderException(message: String) : RuntimeException(message) {
//}
//
//fun setAge(age: Int) {
//    check(age >= 0) {
//        "Age could not be negative"
//    }
//}
//
//fun stack() {
//    stack()
//}
//Задание 1. Воспроизвести фрагменты кода, которые могут привести к возникновению исключений:
//NullPointerException
//ArrayIndexOutOfBoundsException
//ClassCastException
//NumberFormatException
//IllegalArgumentException
//IllegalStateException
//OutOfMemoryError
//StackOverflowError
//
//Задание 2. Оберни все вызовы из предыдущего задания в блок try-catch и создай для каждого типа ошибки свой catch блок
//
//Задание 3. Оберни все вызовы из предыдущего задания в блок try-catch с одним блоком catch для любого типа исключений. Внутри блока catch, используя when, напиши для каждого исключения вывод в консоль специфического сообщения, подходящего под каждый из типов.
//
//Задание 4. Создай свой тип исключения в отдельном файле, наследуемый от AssertionError и принимающий текст. Выброси это исключение в main
//
//Задание 5. Создай свой тип исключения в отдельном файле, наследуемый от RuntimeException и принимающий ArrayIndexOutOfBoundsException тип в качестве аргумента. Напиши код, который спровоцирует выброс ArrayIndexOutOfBoundsException, перехвати его с помощью try-catch и в блоке catch выведи сообщение в консоль и сделай выброс своего типа исключения.
