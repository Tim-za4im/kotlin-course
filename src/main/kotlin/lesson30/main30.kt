package lesson30

import java.time.DayOfWeek

//object NumsObject {
//
//    const val ONE = "ONE"
//    const val TWO = "TWO"
//    const val THREE = "THREE"
//}
//
//enum class Nums {
//    ONE,
//    TWO,
//    THREE
//}
//
//fun main() {
//    val t = Nums.ONE
//    println(Nums.ONE)
//    for (n in Nums.entries) {
//        println(n)
//    }
//
//    fun printNum(num: Nums) {
//        when (num) {
//            Nums.ONE -> println(1)
//        }
//    }
//    DayOfWeek.FRIDAY.printDayType()
//    DayOfWeek.FRIDAY.isWeekend
//
//
//
//    enum class DayOfWeek(val isWeekend: Boolean) {
//        MONDAY(false),
//        TUESDAY(false),
//        WEDNESDAY(false),
//        THURSDAY(false),
//        FRIDAY(false),
//        SATURDAY(true),
//        SUNDAY(true);
//
//        fun printDayType() {
//            if (isWeekend) println("$name is a weekend")
//            else println("$name is a weekday")
//        }
//    }
//
//}

//enum class SEASON(val fistMounthName23:String,isVolatileDuration:Boolean=false){
//    WINTER("December",true),
//    SPRING("april"),
//    SUMMER("june"),
//    AUTUMN("october"),;

//    fun printmount(){
//        println(" In $this fist mouth $fistMounthName23 season  ${if(isVolatileDuration)"c изменякемй" else "не изменяемой"} season")
//    }
//    companion object {
//        fun dettectSeason(fistMounthName23:String):SEASON{
//            SEASON.entries.filter{it.fistMounthName23==fistMounthName23 }.firstOrNull()?: throw IllegalArgumentException("")
//        }}
//    }
//}
//interface  HasValue{
//    val value:String
//}
//interface HasAction{
//    fun action()}
//enum class HomeDevaices(){
//    FRIDGE,
//    WASHER,TV,;



//enum class CoffeeType(val cost: Double,
//                      val coffeeBase: String,
//                      val recommendedSugar: Int,
//                      val hasMilk: Boolean = false) {
//    ESPRESSO(2.50, "Espresso", 0),
//    LATTE(3.00, "Latte", 2, true),
//    CAPPUCCINO(2.75, "Cappuccino", 1, true),
//    AMERICANO(2.25, "Americano", 0);
//
//    fun description() = "The $coffeeBase ${if (hasMilk) "with" else "without"} milk costs " +
//            "\$$cost and is best with $recommendedSugar spoons of sugar."
//}}}}}

















