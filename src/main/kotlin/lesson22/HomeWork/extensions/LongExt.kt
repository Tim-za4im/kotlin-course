package lesson22.HomeWork.extensions

fun Long?.positivOrNegativ():String{
    return if (this!=null){
        if (this>=0) "Положительное число $this"
        else "Отрицательное число $this"
    }
    else " Число равно null"
}