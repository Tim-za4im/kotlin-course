package lesson21.HomeWork21.ListHolder
//Напишите функцию getMiddleElement<T>(list: List<T>): T?, которая будет возвращать средний элемент списка, если он существует.
class ListHolder<T>() {
    private val elements: MutableList<T> = mutableListOf()
    fun add(element : T){
        elements.add(element)
    }
    fun getAll() : List<T>{
        return elements.toList()
    }

}