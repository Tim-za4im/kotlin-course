package lesson17

open class Venocels2 (
    val maxWeight2 : Int,
    val passengerSize : Int,
    val vpnNumver : String
){

    open fun startStep () {
        println("Start transoportn type")
    }

    open fun stopStep () {
        println(" Stope transpor type")
    }


    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )

    val ordinalNumbers2 = listOf(
        "первый", "второй", "третий", "четвертый", "пятый",
        "шестой", "седьмой", "восьмой", "девятый", "десятый",
        "одиннадцатый", "двенадцатый", "тринадцатый", "четырнадцатый", "пятнадцатый",
        "шестнадцатый", "семнадцатый", "восемнадцатый", "девятнадцатый", "двадцатый"
    )



}
