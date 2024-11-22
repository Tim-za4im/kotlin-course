package lesson23.HomeWork

import lesson12.sum

/*Задача 1
Напишите функцию analyzeDataType, принимающую параметр типа Any. Функция должна определить тип
 аргумента и вывести соответствующее сообщение:
Для строки: "Это строка: [значение]".
Для целого числа: "Это целое число: [значение]".
Для списка: "Это список, количество элементов: [количество]".
Для карты: "Это карта, количество пар: [количество]".
Для остальных типов: "Неизвестный тип данных".
Используйте оператор is для проверки типов.
Задача 2
Создайте функцию safeCastToList,
принимающую параметр типа Any и возвращающую размер списка,
 если аргумент можно безопасно привести к типу List.
  В случае неудачного приведения функция должна возвращать -1.
Используйте as? для безопасного приведения типа.
Задача 3
Создайте функцию getStringLengthOrZero,
которая принимает параметр типа Any?
 и возвращает длину строки, если аргумент можно привести к типу String.
 В случае, если аргумент равен null или не является строкой,
 функция должна возвращать 0.
Задача 4
Создайте функцию, которая принимает параметр типа Any.
Функция гарантированно ожидает число (в виде числа или строки, например 4 или 4.2 или “4.2”)
и должна вернуть квадрат этого числа. Если придёт число, его нужно возвести в квадрат,
 если придёт строка, то его нужно преобразовать в число через функцию toDouble() и возвести в квадрат.
Задача 5
Напишите функцию sumIntOrDoubleValues, которая принимает список элементов типа Any
 и возвращает сумму всех целочисленных (Int) и вещественных (Double) значений в списке.
 Все остальные типы должны быть проигнорированы.
Задача 6
Создайте функцию tryCastToListAndPrint, которая принимает параметр типа Any и
 пытается привести его к типу List<*>. Если приведение успешно,
  функция должна напечатать все строки из списка, если элемент не является
   строкой то вывести предупреждение об этом. Если приведение неудачно,
   должно быть выведено сообщение об ошибке, не прерывая выполнение программы.
   return when (param5) {
    is String -> println(param5.toDouble() * param5.toDouble())
    is Int -> println(param5 * param5)
    else -> "invalid"

    fun squaring (i: Any) {

    return when (i) {
        is Number -> println(i.toDouble() * i.toDouble())
        is String -> println(i.toDouble() * i.toDouble())
        else -> println("Не строка и не числа а дермище какое-то ")
    }

}
*/
// Task 1
fun analyzeDataType (i : Any) {
    when (i){
        is String-> println("Это строка: $i")
        is Int -> println("Это целое число: $i")
        is List<*> -> println("Это список, количество элементов: ${i.size}")
        is Map <*,*,> -> println("Это карта, количество пар:${i.size}")
else -> println("Неизвестный тип данных")
    }

}




fun  safeCastToList (j : Any): Int {
   val q = j as? List<*>
return q?.size ?: -1



fun getStringLengthOrZero (c: Any?):Int{
    if ( c is String){
        return c.length }else{
        return 0 }}




fun squareAny (b :Any) : Double {
   return when(b){
       is Int->(b.toDouble())*(b.toDouble())
       is Double-> b*b
       is String-> {
           val bString=b.toDoubleOrNull() ?:0.0
           bString*bString
       }
       else-> 0.0
   }
}




fun sumIntOrDoubleValues (listD : List<Any>): Double{
    var summa :Double=0.0
    for (i in listD){
        when(i){
            is Int->summa+=i
            is Double->summa+=i
            else -> println( "not Int or Double $i")
        }
    }
    return summa
}


fun tryCastToListAndPrint ( m : Any?){
val simpleList = m as? List<*>
if(simpleList!=null){
    for (j in simpleList) {
        when (j) {
            is String -> println(j)
            else -> println("элемент не является строкой $j")
        }
    }
    } else{ println("Erorr!Значение  не является списком")
}


}
}




fun sumIntOrDoubleValuesAnyType2 (g: List<Any?>):Double {
    return g.map {
        when (it) {
            is Double -> it
            is Int -> it.toDouble()
            else -> 0.0
        }
    }.sum()
}




fun tryCastToListAndPrint2(h:Any){
    (h as? List<*>)?.forEach {
        val result = (it as? String)?: "НЕ ЯВЛЯЕТСЯ String $it"
        println(result)
    }?: println("Erorr : Значение не является списокм")
    }





























