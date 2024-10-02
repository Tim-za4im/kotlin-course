package Lesson9
fun main() {

val casualDay: String = "2 октября, в этот осенний день "
val happyBirthday =
     when {
    casualDay.startsWith("2 октября,") -> {
        casualDay +  "Поздравляем нашего дорогого учителя С ДНЁМ РОЖДЕНИЯ! Большое спасибо за помощь в обучении нас! Желаем сил и терпения, ещё больше успешного успеха! Вы навсегда останетесь в нашей памяти  "
    }
    else -> ""
}
println(happyBirthday)
}