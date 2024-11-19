package lesson23

fun main() {

//    val obj: Any = "Hello, world"
//    if (obj is String) {
//        println("Object tjis String")
//    }
//
//    if (obj !is Int) {
//        println("Obj this Int")
//    }
//    if (obj is String) {
//        // obj автоматически приведён к String
//
//        println(obj.toUpperCase()) // Метод toUpperCase() доступен, т.к. obj теперь String
//    }
//    val num: Any = 123
////   val str :String= num as String
////
////    println(str.toString())
//
//    val safeStr: String? = num as? String
//    println(safeStr)
//
//
//    val  t = if (num is String){
//        num as String
//    } else{
//        null}
////    println(safeStr)
//
//
//    val nullableStr: String? = "Kotlin"
//    val nonNullableStr: String = nullableStr as String
//
//println(nonNullableStr)
//
//    val mixedList: List<Any> = listOf("Kotlin", 42, 3.14, "Java", true)
//
//    for (item in mixedList) {
//        when (item) {
//            is String -> println("$item - строка длиной ${item.length}")
//            is Int -> println("$item - целое число")
//            is Double -> println("$item - вещественное число")
//            else -> println("Неизвестный тип")
//        }
//    }

    val j: Any = listOf("Hello", "World", "Kotlin")
    if ( j is List<*>){
        (j[0] as String).length

        val i : String? = null
        println( i as? String )

    }}



