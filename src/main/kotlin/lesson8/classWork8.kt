package lesson8

//val simpleString = "Это простая строка"
//
//val firstName = "Иван"
//val lastName = "Иванов"
//val fullName = "$firstName $lastName"
//
//val age = 30
//val greeting = "Привет! Меня зовут $fullName, и мне $age лет."
//
//
//val person = Person("Алексей", 25)
//val introduction = "Меня зовут $person.name, и мне ${person.age} лет."
//
//val details = "Здесь находятся ${getDetails()}"
//
//val x = 10
//val y = 20
//val resultString = "Результат сложения x и y равен ${x + y}"
//println(resultString)
//
//al subString = originalString.substring(7)
//val subString2 = originalString.substring(3, 6)
//val replacedString = originalString.replace("fun", "awesome")
//val words = originalString.split(" ")
//
//al subString = originalString.substring(7)
//val subString2 = originalString.substring(3, 6)
//val replacedString = originalString.replace("fun", "awesome")
//val words = originalString.split(" ")
//
//Александр Молокович 22:01
//val length = "Hello".length
//val length = "Hello".length
//val upper = "hello".uppercase()
//val lower = "HELLO".lowercase()
//val trimmed = "  hello  ".trim()
//val trimmed = "  hello  ".trim()
//val starts = "Kotlin".startsWith("Kot")
//
//Александр Молокович  кому  Все 22:06
//val ends = "Kotlin".endsWith("lin")
//val contains = "Hello".contains("ell")
//val empty = "".isNullOrEmpty()
//val blank = "  ".isNullOrBlank()val repeat = "ab".repeat(3)
//val letter = originalString[5]
//val indexOfChar = "Kotlin".indexOf('t')
//val indexOfWord = "Kotlin is the best language".indexOf("best")val backReverse = "niltoK".reversed()
//val multiLineString = """
//    Первая строка
//    Вторая строка
//    Третья строка
//""".trimIndent()val name = "Алексей"
//val city = "Москва"
//val age = 32
//val friendsCount = 1052
//val rating = 4.948
//val balance = 2534.75856
//val text = """
//   Имя: %s
//   Город: %s
//   Возраст: %d
//   Количество друзей: %,d
//   Рейтинг пользователя: %.1f
//   Баланс счета: $%,.2f
//""".trimIndent()
//println(text.format(name, city, age, friendsCount, rating, balance))
//
//
//Правила Проверки и Преобразования:
//Если фраза начинается с "ошибка":
//Преобразование: Замените "ошибка" на "небольшое недоразумение".
//Если фраза заканчивается на "важно":
//Преобразование: Добавьте в конец фразы "…но не критично".
//Если фраза содержит слово "проблема":
//Преобразование: Замените "проблема" на "неожиданность".
//Если индекс слова "срочно" находится в промежутке от 0 до 10:
//Преобразование: Замените "срочно" на "когда-нибудь".
//Если строка пустая:
//Преобразование: Верните "Кажется, кто-то забыл что-то сказать".
//Примеры Тестовых Фраз:
//"Ошибка в системе вызвала панику."
//"Для завершения проекта важно."
//"Обнаружена проблема с сетью."
//"Срочно нужно обновить данные!
// "Kotlin: The Fun Way to Learn Programming"

//    val mumb = 123-456-789
//    val replaced = mumb.replace{123456,'x'}
//    println (mumb)
//un multiplyTable(first: Int, second: Int) {
//    val formatLength = (first * second).toString().length + 1
//    print(" ".repeat(formatLength))
//
//    val xRange = getRange(first)
//    val yRange = getRange(second)
//    val formatter = "%${formatLength}s"
//    for (i in xRange) {
//        print(formatter.format("$i"))
//    }
//    println()
//    for (i in yRange) {
//        print(formatter.format("$i"))
//        for (j in xRange) {
//            print(formatter.format("${i * j}"))
//        }
//        println()
//    }
//}
//
//private fun getRange(size: Int): IntProgression {
//    return when {
//        size > 0 -> 1..size//
//        size < 0 -> -1 downTo size
//        else -> throw IllegalArgumentException("Неверное значение size")
//    }
//}
//Функция для преобразования градусов в радианы
import kotlin.math.*

//fun toRadians(degrees: Double): Double {
//    return degrees * Math.PI / 180
//}

//fun main() {
//    // Константы
//    val g = 9.8 // ускорение свободного падения, м/с^2100
//
//    // Ввод данных пользователем
//    print("Введите высоту обрыва (H): ")
//    val H = readLine()?.toDoubleOrNull() ?: return
//
//    print("Введите начальную скорость (V): ")
//    val V = readLine()?.toDoubleOrNull() ?: return
//
//    print("Введите угол броска (α) в градусах: ")
//    val alpha = readLine()?.toDoubleOrNull() ?: return
//
//    print("Введите время (t): ")
//    val t = readLine()?.toDoubleOrNull() ?: return
//
//    // Преобразование угла в радианы
//    val alphaRad = toRadians(alpha)
//
//    // Вычисление координаты x(t) - расстояние до края обрыва
//    val x = V * t * cos(alphaRad)
//
//    // Вычисление координаты y(t) - высота от дна обрыва
//    val y = H + V * t * sin(alphaRad) - g * t * t / 2
//
//    // Проверка, упал ли камень на дно обрыва
//    val yFinal = if (y < 0) 0.0 else y
//
//    val roundedX = String.format("%.2f" , x)
//    val roundedY = String.format("%.2f" , yFinal)
//
//
//    // Вывод результатов
//    println("Положение камня в момент времени t = $t:")
//    println("Расстояние до края обрыва x(t): $roundedX м")
//    println("Высота от дна обрыва y(t): $roundedY м")
//
//    // Вычисление времени полета (время, когда камень достигнет дна)
//    val T = (V * sin(alphaRad) + sqrt(V * V * sin(alphaRad) * sin(alphaRad) + 2 * g * H)) / g
//    val roundedT = String.format("%.2f" , T)
//    println("Время полета камня до дна обрыва T: $roundedT с")
//}


//import kotlin.math.sqrt
//
//fun main() {
//    // Константа
//    val g = 9.8 // ускорение свободного падения, м/с^2
//
//    // Ввод данных пользователем
//    print("Введите высоту H (в метрах): ")
//    val H = readLine()?.toDoubleOrNull() ?: return
//
//    print("Введите скорость U (в м/с): ")
//    val U = readLine()?.toDoubleOrNull() ?: return
//
//    // Вычисление времени T, за которое бомба достигнет земли
//    val T = sqrt(2 * H / g)
//
//    // Вычисление подлетного расстояния S
//    val S = U * T
//
//    // Вывод результатов
//    println("Время падения бомбы T: %.2f с".format(T))
//    println("Подлетное расстояние S до объекта: %.2f м".format(S))
//}
//import  kotlin.math.sqrt
//
//fun main() {
//    // Константа
//    val g = 9.8 // ускорение свободного падения, м/с^2
//
//    // Основной цикл программы
//    while (true) {
//        // Ввод данных пользователем
//        print("Введите высоту H (в метрах, или 'exit' для выхода): ")
//        val heightInput = readLine()
//        if (heightInput.equals("exit", ignoreCase = true)) break // Проверка на выход
//
//        val H = heightInput?.toDoubleOrNull()
//        if (H == null) {
//            println("Некорректный ввод высоты. Попробуйте еще раз.")
//            continue
//        }
//
//        print("Введите скорость U (в м/с, или 'exit' для выхода): ")
//        val speedInput = readLine()
//        if (speedInput.equals("exit", ignoreCase = true)) break // Проверка на выход
//
//        val U = speedInput?.toDoubleOrNull()
//        if (U == null) {
//            println("Некорректный ввод скорости. Попробуйте еще раз.")
//            continue
//        }
//
//        // Вычисление времени T, за которое бомба достигнет земли
//        val T = sqrt(2 * H / g)
//
//        // Вычисление подлетного расстояния S
//        val S = U * T
//
//        // Вывод результатов
//        println("Время падения бомбы T: %.2f с".format(T))
//        println("Подлетное расстояние S до объекта: %.2f м".format(S))
//        println() // Пустая строка для лучшей читаемости
//    }
//
//    println("Выход из программы.")
//}

import kotlin.math.*

//fun main() {
//    // Ввод данных пользователем
//    print("Введите скорость V (в м/с): ")
//    val V = readLine()?.toDoubleOrNull() ?: return
//    print("Введите время t (в секундах): ")
//    val t = readLine()?.toDoubleOrNull() ?: return
//
//    // Вычисление пути S1 (при равномерном движении)
//    val S1 = V * t
//
//    // Вычисление ускорения // (при равнозамедленном движении)
//    val a = V / t
//
//    // Вычисление пути S2 (при равнозамедленном движении)
//    val S2 = (a * t * t) / 2
//
//    // Общий путь S
//    val S = S1 + S2
//
//    // Сравнительный путь S3
//    val S3 = (3 * V * t) / 2
//
//    // Вывод результатов
//    println("Путь S, пройденный поездом: %.2f м".format(S))
//    println("Сравнительный путь S (3Vt / 2): %.2f м".format(S3))
//}
fun main() {
    // Константы
    val G = 6.672e-11 // гравитационная постоянная (м^3/(кг*с^2))
    val M = 5.96e24 // масса Земли (кг)
    val R = 6.37e6 // радиус Земли (м)

    // Ввод высоты h
    print("Введите высоту h над поверхностью Земли (в метрах): ")
    val h = readLine()?.toDoubleOrNull() ?: return

    // Вычисление ускорения свободного падения g
    val g = G * M / ((R + h) * (R + h))

    // Вывод результата
    println("Ускорение свободного падения g на высоте $h м: %.6f м/с²".format(g))
}