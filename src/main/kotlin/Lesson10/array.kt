package Lesson10

fun main () {
    val simpleeArray = arrayOf(1, 2, 3, 4, 5)
    val emtyArray =  Array  (10) {""}

    println(simpleeArray.toList())


    val doubleArray = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0)
    for (i in doubleArray.indices) {
        doubleArray[i] = 2.0 * i

    }
    println(doubleArray.toList())
    val arrayInt = arrayOf(1, 2, 3, 4, 5)
    for (j in arrayInt.indices) {
        arrayInt[j] = j * 3
    }
    println(arrayInt.toList())

    val arrayString = arrayOfNulls<String>(3)
    arrayString[0] = null
    arrayString[1] = "Массив с 0"
    arrayString[2] = "И 2 строками"

    println(arrayString.toList())


    val array1 = intArrayOf(1, 2, 3, 4, 5)
    val copyArray = IntArray(5)
    for (i in array1.indices) {
        copyArray[i] = array1[i]
    }
    println(copyArray.toList())


    val array7A = arrayOf(1, 2, 3, 4, 5)
    val array7B = arrayOf(6, 7, 8, 9, 10)
    val subtractionArray = IntArray(5)
    for (b in array7B.indices) {
        subtractionArray[b] = array7B[b] - array7A[b]
    }
    println(subtractionArray.toList())

    val array8 = arrayOf(2, 4, 5, 6, 8)
    var i = 0
    var no5 = -1
    while (i in array8.indices){
        if (array8[i] ==  5 ){
            no5=i
            break
        }
        i++
    }
    println(no5)
val array9 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for( i in array9.indices){
        if (i%2==0){ println("$i четное")}
        else{ println("$i нечетное")
    }
    }
    val array10 = arrayOf("массивы" ,"строки" ," сеты ","множество")
    val  findNeed = "сеты"
    val finale = findValues(array10, findNeed)
    when {
        finale != null -> println("Нашелся элемент : $finale")
        else-> println("Нету такого элемента")
    }


}


fun findValues (array: Array<String>, findString : String) : String?{
    for(i in array){
        if (i.contains(findString)){
            return i
        }
    }
    return null
}





//fun findElement (array: IntArray, value: Int): Int {
//    var foundIndex = -1
//
//    if (value == 5) {
//        for (i in array.indices) {
//            if (array[i] == value) {
//                foundIndex = i
//                break
//            }
//        }
//    }
//
//    return foundIndex
//}
//    val array = intArrayOf(1, 2, 3, 4, 5)
//    println(findElement(array, 5))




/*Задание 1: Создание и Инициализация Массива
Создайе массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
Задание 2: Создание Пустого Массива
Создате пустой массив строк размером 10 элементов.
Задание 3: Заполнение Массива в Цикле
Создайе массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
Задание 4: Изменение Элементов Массива
Создйте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
Задание 5: Работа с Nullable Элементами
Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
Задание 6: Копирование Массива
Созайте массив целых чисел и скопируйте его в новый массив в цикле.
Задание 7: Разница Двух Массивов
Создате два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.
Задание 8: Поиск Индекса Элемента
Созайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, возвращаем -1. Реши задачу через цикл while.
Задание 9: Перебор Массива
Создате массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
Задание 10: Поиск Значения в Массиве по вхождению
Создй функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()). Верни найденный элемент из функции в виде строки.
*/