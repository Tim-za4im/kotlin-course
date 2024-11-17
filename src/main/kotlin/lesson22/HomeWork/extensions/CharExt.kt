package lesson22.HomeWork.extensions

fun Char.resultNumbers(a: Int,b:Int,flag: Boolean) {
    if (this!=null){
        val resultt = if (flag) { a + b}
        else{a-b}

    println("Рузультат положительный : $this\n$a, $b \n$flag = $resultt")}
    else println(" Результат отрицательный, невозможно сделать\n")
}