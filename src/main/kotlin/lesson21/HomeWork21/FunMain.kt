package lesson21.HomeWork21

/*Требуется описать класс, интерфейс или функцию и реализовать предложенную логику в коде.

Создайте функцию toMap<K, V>(keys: List<K>, values: List<V>): Map<K, V>, которая будет создавать карту из списков ключей и значений.
Если ключей или значений больше, то оставшиеся ключи или значения не записываем в словарь.


Напишите функцию getMiddleElement<T>(list: List<T>): T?, которая будет возвращать средний элемент списка, если он существует.


Напишите класс ListHolder, который будет хранить список элементов типа T и иметь метод для добавления и получения всех элементов.

Создайте интерфейс Mapper<T, R>, который будет определять метод для преобразования элементов типа T в элементы типа R.

Создай класс PhrasesToListOfStrings и имплементируй интефрейс Mapper с типами String и List<String>.
 Метод преобразования должен разбивать входящую строку по символу пробела и возвращать список из полученных слов.
Добавь к интерфейсу Mapper ещё один метод, который будет преобразовывать список элементов типа T в список элементов типа R.
 Реализуй этот метод в классе PhrasesToListOfStrings с аналогичной механикой.


Напишите интерфейс Validator<T>, который будет проверять значение типа T на соответствие определенным условиям и
возвращать булево значение (успешная или неуспешная проверка).


Создай класс StringValidator и имплементируй интерфейс Validator с типом String?. Реализуй проверку, что строка не является null,
 не пустая и не состоит из одних пробелов.


Создай класс OddValidator и имплементируй интерфейс Validator типизированный по Int. Реализуй проверку, что число чётное.


Создай класс ListValidator
с дженериком, ограниченным типом Number
имплементируй интерфейс Validator
типизированный по типу List с nullable типом дженерика класса
Реализуй проверку:
что ни один элемент списка не является null
Ни один элемент приведённый к типу Double не равен 0.0
*/


fun <K, V> toMap(keys: List<K>, values: List<V>): Map<K, V> {
    val map = mutableMapOf<K, V>()


    val size = when {
        keys.size <= values.size -> keys.size
        else -> values.size
    }

    for (i in 0 until size) {
        map[keys[i]] = values[i]
    }

    return map.toMap()
}
/*Напишите функцию getMiddleElement<T>(list: List<T>): T?,
которая будет возвращать средний элемент списка, если он существует.*/

fun <T>getMiddleElement(list: List<T>): T? {
    val middleElement:Int = list.size / 2
    return when {
        list.isNotEmpty() -> list[middleElement]
        else -> null

    }

}
fun main() {

    val list1 = listOf(1, 2, 3)
    val middleEven = getMiddleElement(list1)
    println(middleEven)

    val emptyList = emptyList<Int>()
    val middleEmpty = getMiddleElement(emptyList)
    println(middleEmpty)




    println("\n*****************StringValidator*************\n")
        val stringValid = StringValidator()
        val oddValid = OddValidator()

        val validString = "Hello"
        val emtyString2= ""
        println(stringValid.boolean(validString))
        println(stringValid.boolean(emtyString2))


        val numberA = 6
        val numberB = 7
        println(oddValid.boolean(numberA))
        println(oddValid.boolean(numberB))



    println("\n*******Listvalid********\n")
    val validList = ListValidator<Int>()

    val  validList2 = listOf(1,2,3)
    val  validList0 = listOf(0,1,2)
    val validListNull = listOf(null,0,1)

    println(validList.boolean(validList2))
    println(validList.boolean(validList0))
    println(validList.boolean(validListNull))

    }






