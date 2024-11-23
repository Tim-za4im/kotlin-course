package lesson24.Homework24

//Задание 1. Воспроизвести фрагменты кода, которые могут привести к возникновению исключений:
//NullPointerException  1
//ArrayIndexOutOfBoundsException 2
//ClassCastException 3
//NumberFormatException 4
//IllegalArgumentException 5
//IllegalStateException
//OutOfMemoryError
//StackOverflowError
//
//Задание 2. Оберни все вызовы из предыдущего задания в блок try-catch и создай для каждого типа ошибки свой catch блок
//
//Задание 3. Оберни все вызовы из предыдущего задания в блок try-catch с одним блоком catch для любого типа исключений. Внутри блока catch, используя when, напиши для каждого исключения вывод в консоль специфического сообщения, подходящего под каждый из типов.
//
//Задание 4. Создай свой тип исключения в отдельном файле, наследуемый от AssertionError и принимающий текст. Выброси это исключение в main
//
//Задание 5. Создай свой тип исключения в отдельном файле, наследуемый от RuntimeException и принимающий ArrayIndexOutOfBoundsException тип в качестве аргумента. Напиши код, который спровоцирует выброс ArrayIndexOutOfBoundsException, перехвати его с помощью try-catch и в блоке catch выведи сообщение в консоль и сделай выброс своего типа исключения.
fun testZero (a: Int){
    require(a >=0){ "Only plus"}
}


fun infinityArray() {
    val list = mutableListOf<String>()
    while (true) {
        list.add("sdasdasdasdasdasdqwdfqwdqwqwdqdqwdqwdqdwwq")
    }
}
fun infiniteRecursion(){
    infiniteRecursion()}


fun main() {

    try {
        val nullableString: String? = null
        val length: Int = nullableString!!.length

        val array = arrayOf(1, 2, 3)
        println(array[5])

        val i = " Hello World"
        val errorClass: Int = i as Int


        val numberFormat = "kotnlin"
        val errorNumberFormat = numberFormat.toInt()

        testZero(-3)

        val list = mutableListOf<Int>()
        list.remove(list[0])


        infiniteRecursion()

        infinityArray()


    } catch (e: Throwable) {
        when (e) {
            is NullPointerException ->{ println("NullPointerException:попытка вызова метода на null объекте ")}
            is ArrayIndexOutOfBoundsException ->{ println("ArrayIndexOutOfBoundsException индекс массива выходит за пределы.")}
            is ClassCastException -> {println("ClassCastException  невозможно привести объект к требуемому типу")}
            is NumberFormatException -> {println(" NumberFormatException  неверный формат числа при преобразовании строки")}
            is IllegalArgumentException ->{ println("IllegalArgumentException аргумент не удовлетворяет требованиям")}
            is IllegalStateException -> {println("IllegalStateException некорректное состояние объекта")}
            is StackOverflowError ->{ println("Ошибка StackOverflowError переполнение стека")}
            is OutOfMemoryError ->{ println("OutOfMemoryError доступное место в памяти")}
            else -> {println("unknown erorr")
        }}}

try {
    throw ErorrMy("My exceptions 606")
} catch (e:ErorrMy){ println("Catch my type $e")
}

    try {
        val myArrayErorrs= arrayOf(6,4,8,3)
        println(myArrayErorrs[6])}
    catch (e:ArrayIndexOutOfBoundsException){ println(" Перехват исключения")
        throw MyErorrsArray(e)
    }

}




