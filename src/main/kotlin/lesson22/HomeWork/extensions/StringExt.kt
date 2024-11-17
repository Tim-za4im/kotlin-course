package lesson22.HomeWork.extensions
//Реализуйте для класса String два метода расширения: encrypt и decrypt.
//Метод encrypt должен сдвигать каждый символ исходной строки на заданное число позиций вперед по таблице Unicode,
//а метод decrypt — на то же число позиций назад. Оба метода принимают один параметр base типа Int,
//который определяет величину сдвига. Протестируйте вашу реализацию, убедившись, что после шифрования и последующей расшифровки строка возвращается к исходному состоянию.
//Сдвиг по таблице Unicode реализуется простым прибавлением или вычитанием размера сдвига к char символу.


fun String.encrypt(base: Int): String {
    return this.map { char ->
        ((char.toInt() + base).toChar())
    }.joinToString("")
}

fun String.decrypt(base: Int): String {
    return this.map { char ->
        ((char.toInt() - base).toChar())
    }.joinToString("")
}

fun String.Hitler(nickNames: List<String>, badWord: String) {


    for (i in badWord.indices) {
        when (i) {
            0 -> println("${nickNames[0]} \n ${badWord[i]}")
            1 -> println("${nickNames[1]} \n ${badWord[i]}")
            2 -> println("${nickNames[2]} \n ${badWord[i]}")
            3 -> println("${nickNames[3]} \n ${badWord[i]}")
            4 -> println("${nickNames[2]} \n ${badWord[i]}")
            5 -> println("${nickNames[3]} \n ${badWord[i]}")
            6 -> println("${nickNames[3]} \n ${badWord[i]}")
            7 -> println("${nickNames[2]} \n ${badWord[i]}")
            8 -> println("${nickNames[3]} \n ${badWord[i]}")
            else -> println("Всё")
        }
    }
}




//Многие уже знают любимую игру в Твиттере -
//собирание разных слов из букв через ответы (но мы то знаем что слово только одно, но не будем его называть).
//Напиши метод расширения строки, который будет принимать список имён пользователей
//и выводить в консоли эту строку побуквенно в столбик: имя автора и букву под ним.
//Если сможешь повторить оригинальный шаблон вывода ответов с помощью похожих ASCII символов, будет очень круто.
//Вот ссылка на референс:
