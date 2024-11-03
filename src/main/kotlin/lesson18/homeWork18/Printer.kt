package lesson18.homeWork18

import lesson18.Background
import lesson18.printColored

abstract class Printer {
    abstract fun colorTheme(index : Int): Pair<String, String?>
    fun print(text:String){
        val words = text.split(" ")
        for ( index in words.indices) {
            val word =words[index]
            val colorWords= colorTheme(index)
            printWordlnColor(word, colorWords.first, colorWords.second)
        }
    }
    protected fun printWordlnColor (word: String,textColor:String, backColor : String?){
        val bg = backColor?: Background.WHITE
        printColored(word,textColor,bg)
    }
}



/*Создай абстрактный принтер, который имеет абстрактный метод печати, принимающий в качестве аргумента строку.
Создай классы наследники: лазерный и струйный
Лазерный принтер должен разбивать фразу на слова по пробелу и выводить каждое слово отдельно чёрными буквами на белом фоне (хорошо работает на тёмной теме)
Струйный принтер должен разбивать фразу на слова по пробелу и выводить каждое слово отдельно цветными буквами на цветном фоне.
Слова должны быть разноцветны. Можно сделать список пар с цветом текста и фона
и проходить циклически по этому списку при выводе текста. Проверить работу на длинном тексте.
Подумать, как бы вынести в protected метод базового класса общую для обоих классов логику и избавиться от дублирования кода.*/