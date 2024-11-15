package lesson21.HomeWork21.PhrasesToListOfStrings

import lesson21.HomeWork21.Mapper

/*Создай класс PhrasesToListOfStrings и имплементируй интефрейс Mapper с типами String и List<String>
Метод преобразования должен разбивать входящую строку по символу пробела и возвращать список из полученных слов.
*/
class PhrasesToListOfStrings :Mapper<String, List<String>> {
    override fun map(change: String) = change.split(" ")


    override fun map2TinR(changes: List<String>): List<List<String>> {
       //
        // return changes.map{it.split(" ")}

        return  changes.map { it.split(" ") }
    }
fun main () {

    val word = listOf("Hello world", "from Kotlin!")
    val mapper = PhrasesToListOfStrings()
    val words = mapper.map2TinR(word)
    println(words)

}}
