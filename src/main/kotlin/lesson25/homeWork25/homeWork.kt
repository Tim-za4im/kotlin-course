package lesson25.homeWork25


import lesson13.filter
import lessopackage.format
import java.util.*
import kotlin.collections.Map as Ma

//Задание 1. Создай константу в файле с текстом. Создай функцию, которая ничего не принимает и не возвращает и печатает в консоль текст константы.
//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Создай лямбда выражение без указания типа.
//Проверь как функция работает
const val stringText = " Hello Kotlin world"
fun printText() {
    println(stringText)
}

val anonymStrinText = fun() { println(stringText) }
val unitText: () -> Unit = { println(stringText) }
val noTypeText = { println(stringText) }


//
//Задание 2. Создай функцию, которая принимает список чисел и возвращает среднее арифметическое этого списка. С помощью require проверь, что список не пустой.
//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Создай лямбда выражение без указания типа.
//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных (в том числе пустого).

fun listAveragesInt(number: List<Int>): Double {
    require(number.isNotEmpty()) { throw Exception("List emty") }
    return number.average()
}

val anonymlist2 = fun(number: List<Int>): Double {
    require(number.isNotEmpty()) { throw Exception("List emty") }
    return number.average()
}

val funList3: (List<Int>) -> Double = { number ->
    require(number.isNotEmpty()) { throw Exception("List emty") }
    number.average()
}

val funlist0 = { number: List<Int> ->
    require(number.isNotEmpty()) { throw Exception("List emty") }
    number.average()
}

//Создай функцию, которая принимает список строк и число,
// а возвращает список из строк, длина которых больше или равна заданному числу.
// Если список пуст, нужно выкинуть исключение.
//По аналогии с предыдущим заданием выполни трансформации и проверки.
fun filterMinimum(strings: List<String>, minWords: Int): List<String> {
    require(strings.isNotEmpty()) { throw Exception("List emty") }
    return strings.filter { it.length >= minWords }
}


val anonyimFilterStrings = fun(strings: List<String>, minWords: Int): List<String> {
    require(strings.isNotEmpty()) { throw Exception("List emty") }
    return strings.filter { it.length >= minWords }
}

val filterStringsB2: (List<String>, Int) -> List<String> =
    { strings, minWords ->
        require(strings.isNotEmpty())
        { throw Exception("List emty") }
        strings.filter { it.length >= minWords }
    }

val filterStringgsC3 = { strings: List<String>, minWords: Int ->
    require(strings.isNotEmpty())
    { throw Exception("List emty") }
    strings.filter { it.length >= minWords }
}


// Создай функцию, которая принимает большое число и
// возвращает сумму цифр этого числа.
//По аналогии с предыдущим заданием выполни трансформации и проверки.
//Подсказка: для парсинга строки “3” в число 3 можно использовать “3”.digitToInt()
fun sumLong(sumbL: Long): Int {
    require(sumbL >= 0) { throw Exception("List emty") }
    return sumbL.toString().sumOf { it.digitToInt() }
}


val anonymLong = fun(sumbL: Long): Int {
    require(sumbL >= 0) { throw Exception("List emty") }
    return sumbL.toString().sumOf { it.digitToInt() }
}

val funLong2: (Long) -> Int = { sumbL ->
    require(sumbL >= 0)
    { throw Exception("List emty") }
    sumbL.toString().sumOf { it.digitToInt() }
}

val typeLong = { sumbL: Long ->
    require(sumbL >= 0)
    { throw Exception("List emty") }
    sumbL.toString().sumOf { it.digitToInt() }
}

// Создай функцию расширение списка чисел,
// которая будет возвращать список уникальных чисел (без дубликатов).
//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.

fun unicom(j: List<Int>): List<Int> {
    return j.distinct()
}

val anonymUnicom = fun(j: List<Int>): List<Int> { return j.distinct() }

val unicomType: (List<Int>) -> List<Int> = { it.distinct() }


//Создай функцию расширение словаря из строк и чисел,
// которая принимает число и возвращает список ключей,
// длина которых меньше их значений но больше заданного в функции аргумента.
// В случае если список получается пустой нужно выкинуть исключение IllegalState.
//По аналогии с предыдущим заданием выполни трансформации и проверки.
fun Map<String, Int>.filterKey(j: Int): List<String> {
    require(j >= 0)
    { throw Exception(" not minus") }
    val resultMap = this.filter{ (key, value) ->
        key.length < value && key.length > j
    }.keys.toList()
    if (resultMap.isEmpty())
        throw IllegalStateException("List keys Emty!")
    return resultMap
}

val anonymMap = fun (map: Ma<String,Int>, j:Int): List<String> {
    require(j >= 0)
    { throw Exception(" not minus") }
    val resultMap = map.filter { (key, value) ->
        key.length < value && key.length > j
    }.keys.toList()
    if (resultMap.isEmpty())
        throw IllegalStateException("List keys Emty!")
    return resultMap

}


val filterMap2 : (map: Ma<String,Int>, j:Int) ->
                  List<String> = { map, j ->
    require(j >= 0)
    { throw Exception(" not minus") }
    val resultMap = map.filter { (key, value) ->
        key.length < value && key.length > j
    }.keys.toList()
    if (resultMap.isEmpty())
        throw IllegalStateException("List keys Emty!")
    resultMap}

val filterMapkey3  = { map: Ma<String,Int>, j:Int ->
        require(j >= 0)
        { throw Exception(" not minus") }
        val resultMap = map.filter { (key, value) ->
            key.length < value && key.length > j
        }.keys.toList()
        if (resultMap.isEmpty())
            throw IllegalStateException("List keys Emty!")
        resultMap}

fun main() {

    printText()
    anonymStrinText()
    unitText()
    noTypeText()
    println("\n")


    val listAveregeA = listOf(1, 5, 8, 4, 6, 7)
    val listAveregeB = listOf(0, 7, -9, 1)
    val listAveregeC = listOf<Int>()
    val listAveregeD = listOf(10, 15, 2, 1, 9)
    println(anonymlist2(listAveregeB))
    println(listAveragesInt(listAveregeA))
    println(funList3(listAveregeD))
    println(
        try {
            funlist0(listAveregeC)
        } catch (e: Exception) {
            e
        }
    )
    println("\n")


    val filterString3A = listOf("Hello", "World", "Kotlin")
    val filterString4A = listOf("He", "She", "Clock", "Who")
    val filterString5B = listOf<String>()
    println(anonyimFilterStrings(filterString3A, 3))
    println(filterStringsB2(filterString4A, 2))
    println(
        try {
            filterStringgsC3(filterString5B, 4)
        } catch (e: Exception) {
            e
        }
    )
    println("\n")


    val teseLong = 1234567L
    val test2Long = 4567863L
    val tel3Long = -9854645L

    println(anonymLong(teseLong))
    println(funLong2(test2Long))
    println(
        try {
            typeLong(tel3Long)
        } catch (e: Exception) {
            e
        }
    )
    println("\n")

    val testUnicom0 = listOf(1, 11, 1, 5, 7, 7, 5, 9, 78)
    val unicomTest1 = listOf(10, 11, 11, 52, 1, 4, 86, 86)
    val unicomTes2 = listOf(88, 77, 88, 77, 54, 63, 11, 11, 45, 4, 5, 45)

    println(unicom(testUnicom0))
    println(anonymUnicom(unicomTest1))
    println(unicomType(unicomTes2))
    println("\n")


    val  testMap= mapOf(
        "Hello" to 4,
        "World" to 3,
        "Kotlin" to 2,
        "Map Test" to 5,
        "TestingMaps" to 7
    )
    val zeoMap = mapOf<String,Int>()
    println(testMap.filterKey(2))
    println(anonymMap(testMap,3))
    println(filterMap2(testMap,4))
    try {
        println(filterMapkey3(zeoMap,1))}
    catch (e:IllegalStateException){
        println("Erorr ${e}")
    }

    println("\n")

}
