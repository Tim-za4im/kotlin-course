package lessopackage
fun Double.format(): String {
    return "%,.2f".format(this)
}

fun String.wordCounter(): Int {
    return split(" ").size
}

fun <T> T.createList(n: Int): List<T> {
    return (0 until n).map {
        println("it: $it")
        println("this: $this")
        this
    }
}

fun main() {
    var num: Double = 58.12345
    println("%,.2f".format(num))
    println(num.format())

    var str = "aaa bbb ccc ddd"
    println(str.split(" ").size)
    println(str.wordCounter())

    var num2 = "aaa"
    val list = listOf(num2)
    val list3 = listOf(num2, num2, num2)
    println(num2.createList(8))
}