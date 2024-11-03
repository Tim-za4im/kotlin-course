package lesson18.homeWork18

class Circle2 (
   var pi:Double,
    val r : Double)
: Shape () {
    override fun area(): Double {
        return pi * (r * r)
    }
}
//val s = pi * (r * r)
//println(s)