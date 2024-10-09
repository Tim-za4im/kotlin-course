package Lesson11

fun main(){




val pair : Pair<Int, String > = 1 to "a"
val pair2 = Pair(2, "qa")
    println(pair.first)
    println(pair.second)

    val emtyMap: Map<String, String> = mapOf()
val captals = mapOf("Russia" to "Mosscow" , "France " to  " Paris")
    val a1= "Россия" to "Mosscow"
    val a2 = "France" to " Paris"
    val capitalis1 = mapOf(a1,a2)

    val letter = mapOf(1 to "a" , 2 to "b" , 3 to "c")

val mutableCapital = mutableMapOf("Rissua" to " Moscow", "France" to "Paris")
    val capitals2 = capitalis1["Россия"]
    println(capitals2)
    mutableCapital["Германия"] = " <Berlin"
mutableCapital.remove("France")
     val myMap = mapOf<Int, String>()
    val myMap2 = mapOf(1 to "a",2 to "b" )
    val mymap3 = mutableMapOf(1 to "a")
    mymap3 [31]= "asd"






















}