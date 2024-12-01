package lesson25.homeWork25


import kotlin.collections.Map

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


//}
//fun Map<String,Int>.filterKey(j: Int): List<String>{
//    val resultMap = this.filterKey{ it.length <this[it]!! && it.length > j }.keys.toList()
//    require(j >= 0)
//    { throw Exception(" not minus") }
//    return resultMap
//}
//fun Map<String, Int>.keysLength2(minLength: Int): List<String> {
//    fun Map<String, Int>.keysLength(minLength: Int): List<String> {
//        val result = this.filterKeys { (key, value) -> key.length < value && key.length > minLength }.keys.toList()
//
//        require(result.isNotEmpty()) { "Список не должен быть пустым" }
//
//        return result
//    }
////        val result = this.filter { (key, value) -> key.length < value && key.length > minLength }.keys.toList()
////
////        require(result.isNotEmpty()) { "Список не должен быть пустым" }
////
////        return result
/*fun Map<String, Int>.keysLength(minJ: Int): List<String> {
    val result = mutableListOf<String>()
    for ((key, value) in this) {
        if (key.length < value && key.length > minJ) {
            result.add(key)
        }
    }
    if (result.isEmpty()) {
        throw IllegalStateException("list not emty")
    }

    return result
}
val anonymusFunc = fun(map: Map<String, Int>, minJ: Int): List<String> {
    val result = mutableListOf<String>()
    for ((key, value) in map) {
        if (key.length < value && key.length > minJ) {
            result.add(key)
        }
    }

    if (result.isEmpty()) {
        throw IllegalStateException("list not emty")
    }

    return result
}
val keyFunction3 = { map: Map<String, Int>, minJ: Int ->
    val result = mutableListOf<String>()
    for ((key, value) in map) {
        if (key.length < value && key.length > minJ) {
            result.add(key)
        }
    }

    if (result.isEmpty()) {
        throw IllegalStateException("list no emty" +
                "")
    }

    result
}*/


//val anonymMap = fun (map: Map<String,Int>, j:Int): List<String> {
//    require(j >= 0)
//    { throw Exception(" not minus") }
//    val resultMap = map.filter { (key, value) ->
//        key.length < value && key.length > j
//    }.keys.toList()
//    if (resultMap.isEmpty())
//        throw IllegalStateException("List keys Emty!")
//    return resultMap
//}
//
//val filterMap2 : (map: Map<String,Int>, j:Int) ->
//List<String> = { map, j ->
//    require(j >= 0)
//    { throw Exception(" not minus") }
//    val resultMap = map.filter { (key, value) ->
//        key.length < value && key.length > j
//    }.keys.toList()
//    if (resultMap.isEmpty())
//    throw IllegalStateException("List keys Emty!")
//    resultMap}
////val filterMapkey3  = { map: Map<String,Int>, j:Int ->
////    require(j >= 0)
//    { throw Exception(" not minus") }
//    val resultMap = map.filter { (key, value) ->
//        key.length < value && key.length > j
//    }.keys.toList()
//    if (resultMap.isEmpty())
//    throw IllegalStateException("List keys Emty!")
//    resultMap}

//Создай функцию расширения словаря из списка и множества,
// которая принимает все известные тебе типы (вспомни все что знаешь и под каждый тип создай аргумент)
// и возвращает строку.
// Функция должна распечатать все данные, которые тебе в ней доступны и вернуть конкатенацию всех данных которые ей доступны (порядок неважен).
// Конкатенация - это присоединение. Код должен быть отформатирован таким образом, чтобы легко читался.
//По аналогии с предыдущим заданием выполни трансформации.
fun Any.SetList(
    list: List<Any>,
    set: Set<Any>,
    map: Map<Any, Any>,
    number: Number,
    string: String,
    boolean: Boolean,
    char: Char
): String {


    val ListConcaten = list.joinToString(" , ")
    val setConcaten=set.joinToString(", ")
    val mapConcaten =map.flatMap { listOf("${it.key}=${it.value}") }.joinToString(", ")
    val numbConcaten = "$number"
    val stringConcaten = "$string"
    val booleanConcaten= "$boolean"
    val charConcaten= "$char"

    return  "List : $ListConcaten \nSet :$setConcaten \nMap : $mapConcaten \nNumber: $numbConcaten\nString: $stringConcaten\nBoolean : $booleanConcaten \n Char: $charConcaten"}

val anyAnonymContacten :(List<Any>, Set<Any>, Map<Any, Any>, Number, String, Boolean, Char) -> String = fun(
    list, set, map, number, str, boolean, char
): String {val ListConcaten = list.joinToString(" , ")
    val setConcaten=set.joinToString(", ")
    val mapConcaten =map.flatMap { listOf("${it.key}=${it.value}") }.joinToString(", ")
    val numbConcaten = "$number"
    val stringConcaten = "$str"
    val booleanConcaten= "$boolean"
    val charConcaten= "$char"

    return  "List : $ListConcaten \nSet :$setConcaten \nMap : $mapConcaten \nNumber: $numbConcaten\nString: $stringConcaten\nBoolean : $booleanConcaten \n Char: $charConcaten"}

val anyConcantionType ={
        list: List<Any>,
        set: Set<Any>,
        //map: Map<String, Any>,
        number: Number,
        str: String,
        boolean: Boolean,
        char: Char ->
    val ListConcaten = list.joinToString(" , ")
    val setConcaten=set.joinToString(", ")
    //val mapConcaten =map.flatMap { listOf("${it.key}=${it.value}") }.joinToString(", ")
    val numbConcaten = "$number"
    val stringConcaten = "$str"
    val booleanConcaten= "$boolean"
    val charConcaten= "$char"
    "List : $ListConcaten \nSet :$setConcaten  \nNumber: $numbConcaten\nString: $stringConcaten\nBoolean : $booleanConcaten \n Char: $charConcaten"}


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



//    val testMap = mapOf(
//        "Hello" to 4,
//        "World" to 3,
//        "Kotlin" to 2,
//        "Map Test" to 5,
//        "TestingMaps" to 7
//    )
//    val zeroMap = mapOf<String, Int>()
//
//
//    val result1 = testMap.keysLength(8)
//    println("keysLength result: $result1")
//
//    val result2 = anonymusFunc(testMap, 4)
//    println("anonymusFunc result: $result2")
//
//    val result3 = keyFunction3(testMap, 2)
//    println("keyFunction3 result: $result3")
// println("\n")



    val listtest = listOf(11,55,23,"Kotlin")
    val setTest = setOf("Hello", " Wrold,", "Home", "Work")
    val mapTest = mapOf("Age " to 18, "Name" to " Boris", "Country"  to "Japan") as Map <Any,Any>
    val numberTest = 1465
    val strTest = " Test string Example"
    val booleanTest= true
    val charTest = 'W'

    val resulAny= Any().SetList (listtest,setTest,mapTest,numberTest,strTest,booleanTest,charTest)
    println("Concation all type : $resulAny")
    println("\n")

    val resultAnyAnonymContacten =anyAnonymContacten(listtest,setTest,mapTest,numberTest,strTest,booleanTest,charTest)
    println("Contaction 2 anonymus $resultAnyAnonymContacten")
    println("\n")

    val resultAnyConcantionType = anyConcantionType(listtest,setTest,numberTest,strTest,booleanTest,charTest)
    println("Concation 3 Lamda $resultAnyConcantionType")

}


