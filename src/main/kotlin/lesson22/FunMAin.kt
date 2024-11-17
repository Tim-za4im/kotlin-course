package lesson22

import lesson22.HomeWork.extensions.*

fun main() {

    val numbersArray = arrayOf(1, 4, 5, 7, 8, 9, 11)
    println("Чётные: ${numbersArray.numberCount().first}\nНечётные: ${numbersArray.numberCount().second}\n")


    val exampleW = 'W'
    exampleW.resultNumbers(5, 7, true)


    val listWords: MutableList<String?> = mutableListOf("Hello", "world", "Kotlin")
    val newWordsA = listWords.addLikst("Home work Just do it", 2)
    println("Добавления слова : ${listWords.joinToString()}\n Добавленное слово : $newWordsA\n")

    val countMapA: Map<String, List<String>?> = mapOf(
        "A" to listOf("Hello", "World", " Kotlin"),
        "B" to null,
        "C" to listOf("HomeWork")
    )
    println("${countMapA.countElements()}\n")


    val numberPlus: Long? = 548L
    val numberMinus: Long? = -234L
    val numberNull: Long? = null

    println(numberPlus.positivOrNegativ())
    println(numberMinus.positivOrNegativ())
    println("${numberNull.positivOrNegativ()}\n")


    val pairA = Pair(1, "Hello")
    val pairB = Pair("World", 2)
    val pairC = Pair(null, "Kotlin")
    val pairD = Pair(1, null)

    println(pairA.revert())
    println(pairB.revert())
    println(pairC.revert())
    println("${pairD.revert()}\n")


    val numbA = 10
    val numbB = 15.0
    val numbC = 12.5F
    val deviation = 1.5
    println(numbA.within(numbB, deviation))
    println(numbB.within(numbC, deviation))
    println(numbC.within(numbA, deviation))
    println("${numbA.within(numbC, deviation)}\n")

    val textA = " Hello world, Kotlin!"
    val amount = 2
    val encrypt = textA.encrypt(amount)
    val decrypt = encrypt.decrypt(amount)
    println(" text $textA")
    println(" Enctypt $encrypt")
    println("Decrypt $decrypt\n")


    val usersTwitters = listOf("гротеск", "Асахи Кобэ","Avocado1", "комната")
    val word = "пидмаркоз"
    println("Гитлеh".Hitler(usersTwitters,word))

}
//    val result = "String with spaces".removeSpaces()
//    println(result)
//
//   // val s: List<Int?> = listOf(1, null)
//    //s.isElementsNullOrEmpty()
//
//
//
//    val refult = " String woith spaces".removeSpaces()
//    println(refult)
//
//    val h = listOf(1 , null)
//    h.isElementsNullOrEmpty()

//    println( " sadasdasd".funA("sadasdasd" , 2))
//  //  listOf(1,2).funB
//  //  val num :Map<String, Int> = mapOf("sadasdasd" to 1, "ghfdhg" to 2)
//    var ter : Double=58.78979
//    println("%,.2f.".format(ter))
//    println(ter.format())
//}
//
//fun String.funA(a: String, b: kotlin.Int) :Boolean{
//    return true
//}
//
//fun List<Int>.funC( c: String?) {
//
//}
//
//fun  <K,V> Map<K,V>.funD(d:K,e:V):Boolean{
//    return true
//
//}
//
//fun Double?.funF(f: Double,r:String?):Double{
//    return 0.0
//}
//
//fun <T> Set<T>.funX(x :T): List<T>{
//    return listOf()
//}
//fun Double.format() : String{
//    return  " %,.2f".format(this)
//}
//
//val result = "String with spaces".removeSpaces()println(result)
//println(   "sdsfd".funA("sdfsdf", 1)  )
//listOf(1,2,).funB(null) val  num: Map<String, Int> = mapOf("sadfsd" to 1, "gfhf" to 2)
//num.funC<String,Any>("dfs", true)
//
//var num2 = null
//// println(num2.funD(0.2, "hjdfs")) num2.funD(0.3, "sdf")
//
//println(setOf("sdfs", "fghf").funE("dsdf"))
/*Тренируемся составлять сигнатуру функции расширяющей класс. Можешь проявить свою творческую жилку и в коде функции что-нибудь сделать с входящими данными, чтобы вернуть итоговый результат или распечатать его, если нет возвращаемого типа.
Определите функцию-расширение для массива чисел, которая не принимает аргументов и возвращает пару из чисел.
Напишите функцию-расширение для класса символа, допускающего null, которая принимает три аргумента: два типа число и один булево, и ничего не возвращает.
Создайте функцию-расширение для класса изменяемого списка элементов с дженериком, которая принимает два аргумента: один типа дженерик, допускающий null, и другой типа число, и возвращает значение типа дженерик, допускающий null.
Реализуйте функцию-расширение для класса словаря допускающего null с ключами дженериком и значениями типа список из такого же дженерика, которая принимает один аргумент типа число и возвращает словарь допускающий null с ключами типа строка и значениями типа дженерика допускающего null.
Определите функцию-расширение для класса длинного числа, допускающее null, которая не принимает аргументов и возвращает строку.

Сконструируй объекты, позволяющие вызвать определённые выше функции и вызови их.



Задача 3: Переворот элементов пары
Реализуйте метод расширения revert для класса Pair, который меняет местами первый и второй элементы пары. Метод должен возвращать новую пару с перевернутыми элементами. Протестируйте эту функцию на различных парах значений, в том числе null.
Задача 4: Проверка допустимого отклонения числа
Реализуйте метод расширения within для класса Number, который проверяет, что текущее число отклоняется от эталонного не более допустимого значения. Метод принимает два параметра: other — число для сравнения и deviation — максимально допустимое отклонение. Метод должен возвращать true, если разница между текущим числом и числом для сравнения не превышает заданное отклонение. Протестируйте функцию на разных типах чисел. Для получения отклонения, у разницы чисел нужно вызвать свойство absoluteValue.
Задача 5: Кодер-декодер строк
Реализуйте для класса String два метода расширения: encrypt и decrypt. Метод encrypt должен сдвигать каждый символ исходной строки на заданное число позиций вперед по таблице Unicode, а метод decrypt — на то же число позиций назад. Оба метода принимают один параметр base типа Int, который определяет величину сдвига. Протестируйте вашу реализацию, убедившись, что после шифрования и последующей расшифровки строка возвращается к исходному состоянию.
Сдвиг по таблице Unicode реализуется простым прибавлением или вычитанием размера сдвига к char символу.

Задача 6: Собери пидмаркоз!

Многие уже знают любимую игру в Твиттере - собирание разных слов из букв через ответы (но мы то знаем что слово только одно, но не будем его называть). Напиши метод расширения строки, который будет принимать список имён пользователей и выводить в консоли эту строку побуквенно в столбик: имя автора и букву под ним. Если сможешь повторить оригинальный шаблон вывода ответов с помощью похожих ASCII символов, будет очень круто. Вот ссылка на референс:
*/