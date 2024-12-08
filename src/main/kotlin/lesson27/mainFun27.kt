package lesson27

fun main() {

    val listExp = mutableListOf(1,5,4,6)

    println(listExp.size)
    listExp.add(45)
    println(listExp.size)
}

fun <T, R> combineAndTransform(

    collection1: Collection<T>,

    collection2: Collection<T>,

    transform: (T, T) -> R

): List<R> {

    val size = minOf(collection1.size, collection2.size)

    val result = mutableListOf<R>()



    for (i in 0 until size) {

        val element1 = collection1.elementAt(i)

        val element2 = collection2.elementAt(i)

        result.add(transform(element1, element2))

    }



    return result

}
//   val list = mutableListOf(1, 2, 3, 4)

//    list.add(6)
//    println(list)

//   val list1 = list.toList()

val list2 = with(mutableListOf(1, 2, 3, 4)) {
    add(6)
    println(this)
    toList()
}.size

//    val sb = StringBuilder()
//    sb.append("fbkadjbgk")
//    sb.append("SGKANSGOI")
//    sb.append("askjadgj")
//
//    val strLength = sb.length

val sb = StringBuilder().run {
    append("fbkadjbgk", "adkgjdbgu")
    append("SGKANSGOI")
    append("askjadgj")
    length
}

//    val list = arrayListOf<String>()
//    list.add("мама")
//    list.add("мыла")
//    list.add("раму")

//val list = arrayListOf<String>().also {
//    it.add("мама")
//    it.add("мыла")
//    it.add("раму")
//}
//
//val string: String? = "aisjgbadgojn"
//string?.length
//
//println(string?.length)
//println(string?.isEmpty())
//println(string?.uppercase())
//
//string?.let {
//    println(it.length)
//    println(it.isEmpty())
//    println(it.uppercase())
//}
/*val list = mutableListOf(1, 2, 3)



println(list.size)

list.add(3)

println(list.size)

Александр Молокович
01:06:46
with(list) {

    println(size)

    add(4)

    println(size)

}


list.add(5)

val result = list.sum()

Александр Молокович
01:12:35
val result = list.run {

    add(5)

    sum()

}

val s = File("example.txt").inputStream()

val content = s.readBytes()

println(content)

s.close()

File("example.txt").inputStream().use {

    val content = it.readBytes()

    println(content.size)

}
val list = mutableListOf<Int>().apply {

    add(1)

    add(2)

}


val str: String? = "Hello"

str?.let {

    println(it.length)  // Выполняется только если str не null
*/
