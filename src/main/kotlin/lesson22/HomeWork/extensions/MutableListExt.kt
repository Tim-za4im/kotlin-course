package lesson22.HomeWork.extensions

fun <T>MutableList<T?>.addLikst(element :T?,index:Int):T?{
    if (index>size||index<0) return null
    add(index,element)
    return element
}