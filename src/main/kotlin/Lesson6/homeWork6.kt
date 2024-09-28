package Lesson6

import com.sun.source.tree.ImportTree
import kotlin.math.E

//В каждом задании также нужно валидировать входящие данные, если это имеет смысл.
//Задание 1: "Определение Сезона"
//Контекст: Напишите функцию, которая на основе номера месяца возвращает сезон года.
//Задание 2: "Расчет Возраста Питомца"
//Контекст: Создайте функцию, которая преобразует возраст собаки в "человеческие" годы. До 2 лет каждый год собаки равен 10.5 человеческим годам, после - каждый год равен 4 человеческим годам.
//Задание 3: "Определение Вида Транспорта"
//Контекст: Напишите функцию, которая определяет, какой вид транспорта лучше использовать, исходя из длины маршрута. Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".
/*Задание 4: "Расчет Бонусных Баллов"
Контекст: Клиенты интернет-магазина получают бонусные баллы за покупки. Напишите функцию, которая принимает сумму покупки и возвращает количество бонусных баллов: 2 балла за каждые 100 рублей при сумме покупки до 1000 рублей и 5 баллов за каждые 100 рублей при сумме свыше этого.
Задание 5: "Определение Типа Документа"
Контекст: В системе хранения документов каждый файл имеет расширение. Напишите функцию, которая на основе расширения файла возвращает его тип: "Текстовый документ", "Изображение", "Таблица" или "Неизвестный тип".
Задание 6: "Конвертация Температуры"
Контекст: Создайте функцию, которая конвертирует температуру из градусов Цельсия в Фаренгейты и наоборот в зависимости от указанной единицы измерения (C/F). Единицу измерения нужно передать вторым аргументом функции. Несколько аргументов передаются через запятую. Возвращать нужно строку.
Подсказка: для генерации строки из числа и буквы можно использовать шалон “$result F” для фаренгейта или “$result C” для цельсия
Задание 7: "Подбор Одежды по Погоде"
Контекст: Напишите функцию, которая на основе температуры воздуха рекомендует тип одежды: "куртка и шапка" при температуре ниже 0, "ветровка" от 0 до 15 градусов и "футболка и шорты" при температуре выше 15. При температурах ниже -30 и выше +35 рекомендуйте не выходить из дома.
Задание 8: "Выбор Фильма по Возрасту"
Контекст: Кинотеатр предлагает фильмы разных возрастных категорий. Напишите функцию, которая принимает возраст зрителя и возвращает доступные для него категории фильмов: "детские", "подростковые", "18+".
*/

fun main() {

    println(definitionSeason(2))
    println(ageDog(5))
    println(typeTransport(7))
    println(transoport(2))
    println(sumBonus(1500))
   println(checkType("txt"))
    println(checkType("exe"))
    println("30 градусов в Фаренгете:${convertTempere(25.0, null)}")
    println("85 градусов в Фаренгете:${convertTempere(null, 85.0)}")
    println(selectionClothesWeather(17))
    println(ageCinema(5))
}



fun definitionSeason(month: Int): String {
   return when (month) {
       1, 2, 12 -> {"Зима" }
       3, 4, 5 -> {"Весна" }
       6, 7, 8 -> { "Лето" }
       9, 10, 11 -> {"Осень"}
       else -> {"Нета цифра"}
   }
}


fun ageDog (age: Int ): Double {
    var humanAge: Double
    if (age <= 2) {
        humanAge = age * 10.5
    } else {
        humanAge = 2 * 10.5 + (age - 2) * 4
    }
    return humanAge
}

fun typeTransport(miles:Int) : String {
    return if (miles < 1) {
        "Пешком"
    } else (if (miles < 5) {
        "Велосипед"
    }else if (miles > 5) {
        "Автотранспорт"
    } else null)!!
}


fun transoport (km :Int ) : String{

   return when  {
       km  < 0 -> "Дома сиди"
       km < 1 -> "Пешком"
      km  in 1..5 -> "Велосипед"
          else -> "Автотранспорт"
    }
}


fun sumBonus (bonus : Int) : Int {
    if (bonus < 0) throw Exception ("Ошибка")
    val dif=bonus /100
    return when {
        bonus <= 1000 -> { dif * 2 }
        else -> { dif * 5 }

    }
}

fun selectionClothesWeather(tempurature: Int): String {
        return when {
            tempurature <= -30 -> "рекомендуйте не выходить из дома"
            tempurature in -29..0 -> "куртка и шапка"
            tempurature in 1..15 -> "ветровка"
            tempurature in 16..35 -> "футболка и шорты"
            35 < tempurature -> "рекомендуйте не выходить из дома"

            else ->
                "нет данных"
        }
    }


    fun ageCinema(age: Int)  {
        return when (age) {
            in 0..6 ->
                println("детские")


            in 6..18 -> {
                println("детские")
                println("подростковые")
            }

            else ->{
                println("детские")
                println("18+")
                println ("подростковые")}
        }
    }


fun checkType(doc: String): String {
    return when (doc) {
     ".xlsc", ".xls" -> "Таблица"
     ".gif", "bmp", "jpeg" -> "Изображение"
    "txt", " doc", "rtf" -> " Текстовый документ"
    else -> "Неизвестный тип"
     }
}
fun convertTempere (celci: Double?, farengeit: Double?) {
    if (farengeit == null && celci != null)
        (celci * 9.0 / 5.0) + 32.0
    else if (celci == null && farengeit != null)
        (farengeit - 32.0) * 5.0 / 9.0
    else Exception("Нету данных")
}































