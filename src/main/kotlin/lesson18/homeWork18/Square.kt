package lesson18.homeWork18

class Square (
    val side : Int
): Shape(){
    override fun area(): Double = ((side * side).toDouble())
}
