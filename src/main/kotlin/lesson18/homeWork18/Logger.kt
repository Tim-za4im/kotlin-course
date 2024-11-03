package lesson18.homeWork18

import lesson18.Background
import lesson18.Colors
import java.lang.Exception

class Logger {
    fun log(mesage : String){
        println("INFO $mesage")
    }


    fun log (level: String, mesage: String){
        when(level.uppercase()){
            " WARNING" -> println("${Colors.YELLOW} WARNING $mesage ${Colors.RESET}")
            "ERROR" -> println("${Colors.WHITE}${Background.RED} ERROR $mesage${Background.RESET}")
            else -> log(mesage)
        }
    }

    fun log (mesagess: List<String>){
        for ( mesage in mesagess ){
            log(mesage)
        }
    }

    fun log( exception: Exception){
        log("ERROR ${exception.message}")
    }
}



/*Класс “Логгер”: представляет из себя инструмент для вывода информации в консоль с разным префиксами уровня логирования (INFO, WARNING, ERROR, DEBUG)
Базовый метод log(message) выводит в консоль сообщение message с префиксом INFO:
Выполнить перегрузку метода log, который:
Принимает уровень логирования и сообщение.
Выводит сообщения типа WARNING жёлтым цветом, а ERROR белым цветом на красном фоне.
Принимает список сообщений и все их выводит с уровнем INFO
Принимает объект типа Exception и выводит его поле message с префиксом уровня ERROR
Попробуй создать логгер и добавить в него сообщения разными способами. Проверь вывод в консоли.
*/