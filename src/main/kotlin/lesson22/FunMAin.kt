package lesson22

fun main() {
    val result = "String with spaces".removeSpaces()
    println(result)

   // val s: List<Int?> = listOf(1, null)
    //s.isElementsNullOrEmpty()



    val refult = " String woith spaces".removeSpaces()
    println(refult)

    val h = listOf(1 , null)
    h.isElementsNullOrEmpty()

    println( " sadasdasd".funA("sadasdasd" , 2))
  //  listOf(1,2).funB
  //  val num :Map<String, Int> = mapOf("sadasdasd" to 1, "ghfdhg" to 2)
    var ter : Double=58.78979
    println("%,.2f.".format(ter))
    println(ter.format())
}

fun String.funA(a: String, b: kotlin.Int) :Boolean{
    return true
}

fun List<Int>.funC( c: String?) {

}

fun  <K,V> Map<K,V>.funD(d:K,e:V):Boolean{
    return true

}

fun Double?.funF(f: Double,r:String?):Double{
    return 0.0
}

fun <T> Set<T>.funX(x :T): List<T>{
    return listOf()
}
fun Double.format() : String{
    return  " %,.2f".format(this)
}

