package lesson12

import java.awt.Image

/*Напишите сигнатуру функции, котораянепринимаетаргментовиневозвращаетзначния.1
Напишите сигнатуру функции, котораяпринимает два целых числа и возвращает их сумму.2
Напишите сигнатуру функции, котораяпринимаетстроку и ничего не возвращает.3
Напишите сигнатуру функции, котораяпринимает список целых чисел и возвращает среднее значение типа Double.4
Напишите сигнатуру функции, котораяпринимает nullable строку и возвращает её длину в виде nullable целого числа.5
Напишите сигнатуру функции, котораяне принимает аргументов и возвращает nullable вещественное число.6
Напишите сигнатуру функции, котораяпринимает nullable список целых чисел и не возвращает значения.7
Напишите сигнатуру функции, котораяпринимает целое число и возвращает nullable строку.8
Напишите сигнатуру функции, котораяне принимает аргументов и возвращает список nullable строк.9
Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение.


*/
fun mai(){


}

fun example1 () = Unit

fun exampe2 (a : Int, b : Int) :Int {
 return a+b
}

fun  example3 (string : String, b: String) {}


fun example4 (list: List<Int> ) : Double?{
    return null
}


fun  example5 (stringNull : String?): Int?{
return  stringNull?.length
}

fun example6 () : Int? {
    return null
}


 fun example7 (nullList :List<Int>?) {}


fun examle8 (int:Int) : String? {
return null
}

fun example9 ():List<String>?{
return null
}

fun example10( nullString2 : String?, nullInt: Int?): Boolean?{
return null
}
/*Напишите сигнатуру функции, которая не принимает аргументов и возвращает nullable вещественное число.
Напишите сигнатуру функции, кото/рая принимает nullable список целых чисел и не возвращает значения.7
Напишите сигнатуру функции, котораяпринимаетцелое чиловозврщает nllale стрку.8
Напишите сигнатуру функции, котораяне принимает аргументов и возвращает список nullable строк.9
Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение.10



Напиши рабочий код для следующих задач:
Задача 1:
Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.

Задача 2:
Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.

Задача 3:
Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
 Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.

Задача 4:
Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке.
 Если отрицательных чисел нет, функция должна вернуть null.

Задача 5:
Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку.
Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.

Сделай рефакторинг функции, через определение вспомогательных приватных функций. Требуется избавиться от дублирования кода и трудно воспринимаемых фрагментов.

Сначала сделай запуск функции и посмотри на результат её работы. Сделай запуск после рефакторинга и проверь, чтобы результат работы был аналогичным.

 */

fun multiplyByTwo ( i:Int):Int {
    return i*2
}
fun isEven( j: Int): Boolean {
    return j % 2 == 0
}

fun printNumbersUntil ( n : Int){
    if ( n < 1)
        return
    for (i in 1..n)
        println(i)
}
fun findFirstNegative (intList :List<Int>) : Int?{
   for (number in intList){
       if (number<0){
           break}}
    return null}

fun  processList( stringList : List<String>) {
            for (nullString3 in stringList) {
                if (nullString3 == null){
                return
            }
        }

        println()
    }


//Задача 5:
//Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку.
//Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
//
//Сделай рефакторинг функции, через определение вспомогательных приватных функций. Требуется избавиться от дублирования кода и трудно воспринимаемых фрагментов.
//
//Сначала сделай запуск функции и посмотри на результат её работы. Сделай запуск после рефакторинга и проверь, чтобы результат работы был аналогичным.