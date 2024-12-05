package lesson26.homeWrok26

import lesson15.Person.user2
import kotlin.math.min

//Задания на отработку синтаксиса
//Напишите функцию, которая принимает другую функцию без аргументов и возвращаемого значения.
//Создайте функцию, принимающую функцию с одним аргументом типа Int и возвращающую String.
//Реализуйте функцию, принимающую функцию расширения типа Int, принимающую String и возвращающую Boolean.
//Напишите функцию, которая принимает функцию с двумя аргументами типа Double и возвращает Boolean.
//Напишите функцию, которая принимает функцию с одним аргументом-дженериком T и возвращает List<T>.
//Создайте функцию, принимающую функцию с аргументом типа String и возвращающую другую функцию, принимающую Int и возвращающую Boolean.
//Напишите функцию, которая принимает список чисел, множество строк, функцию с аргументами типа
// List<Int> и Set<String> и возвращающую Map<String, Int>.
//Напишите функцию, возвращающую строку, принимающую число и функцию, принимающую число и возвращающую строку
//Напишите функцию, принимающую функцию, которая возвращает функцию без аргументов и возвращаемого значения.


fun task0 (func0 : ()->Unit){
    func0()
}

fun task1 (func1 : (Int) -> String, j : Int):String{
    return func1 (j)
}

fun task2 ( func3 : Int.() -> String):Boolean{
    val k =4.func3()
    return k.isNotEmpty() }

fun taksk3Double ( func4: (Double,Double) -> Boolean):Boolean{
    return func4(1.1,1.2)
}
fun <T>task4T(func4:(T) -> List<T>, value:T) :List<T>{
    return func4(value)
}

fun task5 (func6:(String)->(Int)->Boolean): (Int)->(Boolean){
    return func6("Kotlin")
}

fun task6 (numbers: List<Int>, strings7: Set<String>,
           func7: (List<Int>,Set<String>) -> Map<String, Int>) :Map<String,Int> {
    return func7(numbers,strings7)
}

fun task7 (j:Int, func7: (Int)-> String):String{
    return func7(j)
}

fun  task8 ( func8: () ->()-> Unit):()->Unit{return func8()}


//Задания на разработку кода
//Напишите функцию filterStrings, которая принимает список строк и функцию-фильтр,
// оставляющую только строки, удовлетворяющие условию (то-есть принимающая строку и возвращающая булево значение). Функция должна вернуть результат фильтрации исходного списка строк.
//Создайте функцию applyToNumbers, которая принимает список чисел и функцию,
// преобразующую каждое число в другое число (те-есть принимающая число и возвращающая число). Функция должна вернуть результат преобразования исходного списка чисел.
//Реализуйте функцию sumByCondition, которая принимает список чисел и функцию,
// определяющую условие для включения числа в сумму. Функция должна вернуть сумму чисел, прошедших проверку.
//Напишите функцию combineAndTransform, которая принимает две коллекции одного типа
// и функцию для их объединения и преобразования в одну коллекцию другого типа. Функция должна вернуть результат преобразования (коллекцию второго типа)
//
//⚡ Для последних четырёх заданий сделать минимум по две разные реализации лямбда функций и проверить работу на разных наборах данных
fun  filterStrings(list : List<String>, funcF: (String)->Boolean):List<String>{
    return list.filter(funcF)
}

val filterStringsAnonym = fun(strings : List<String>,funcF: (String)->Boolean):List<String>{
    return strings.filter(funcF)

    val filterStrings2: (List<String>,(String)->Boolean)->List<String> =
        {strings,funcF-> strings.filter(funcF)
    }}

val  filterStrings3 = { strings: List<String>, funcF: (String) -> Boolean ->
    strings.filter(funcF)}




fun applyToNumbers (numbers12: List<Int>, funcInt : (Int) -> Int ) : List<Int>{
    return numbers12.map(funcInt)
}

val applyToNumbersAnonys = fun(numbers: List<Int>, funcInt : (Int) -> Int ) : List<Int>{
    return numbers.map(funcInt)}

val applyToNumbers2 :(List<Int>,  (Int) -> Int ) -> List<Int> ={ numbers,funcInt->
    numbers.map(funcInt)}

val applyToNumbers3 = {numbers: List<Int>, funcInt : (Int) -> Int ->
    numbers.map(funcInt)}





fun sumByCondition ( listnumbers : List<Int>, func : (Int) ->Boolean) :Int{
    return listnumbers.filter(func).sum()
}

val sumByConditionAnonym = fun (listnumbers : List<Int>, func : (Int) ->Boolean) :Int{
    return listnumbers.filter(func).sum()}

val sumByCondition2 :(List<Int>, (Int) ->Boolean )-> Int = {listnumbers,func ->
    listnumbers.filter(func).sum()}

val sumByCondition3 = {listnumbers : List<Int>, func : (Int) ->Boolean ->
     listnumbers.filter(func).sum()}

//fun combineAndTransform(listA:List<Int>, listB:List<Int>,combine:(Int,Int)->Int,transform: (Int)->String):List<String>{ }


fun main() {

    val string1a = listOf("Kotlin", " Hello", "World", "Hi", "Test")
    val result1a = filterStrings(string1a){it.length > 4}
    val result1b =filterStrings(string1a){it.length < 5}
    println(result1a)
    println(result1b)
    println("\n")




    val numbers1a = listOf(1,2,5,6,78)
    val result2a = applyToNumbers(numbers1a){it * 2}
    val result2b =applyToNumbers(numbers1a){it + 2}
    println(result2a)
    println(result2b)
    println("\n")

    val result3a = sumByCondition(numbers1a){ it %2 == 0}
    val result3b = sumByCondition(numbers1a){ it < 10 }
    println(result3a)
    println(result3b)
    println("\n")
}