package lesson21

class BoxAny(private val item: Any) {
    fun getItem(): Any {
        return item
    }
}

class Box<T>(private val item: T) {

    fun getItem(): T {

        return item

    }

}


fun <T> printItem(item: T) {

    println("Элемент: $item")

}
//printItem("Hello")    // Элемент: H
//printItem(123)         // Элемент:

//printItem(3.14)        // Элемент:

fun <T: Number> sum(a: T, b: T): Double {

    return a.toDouble() + b.toDouble()

}
fun main() {
    val appleBoxAny = BoxAny("Apple")
    val intBoxAny = BoxAny(42)

    println("В коробке: ${appleBoxAny.getItem()}") // В коробке: Apple
    println("В коробке: ${intBoxAny.getItem()}")   // В коробке: 42
    println(sum(5, 10))        // 15.0

    println(sum(3.5, 2.5))     // 6.0

}




