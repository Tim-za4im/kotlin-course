package lesson15.Person

class Car2(
    val market : String,
    val type : Int

) {

    companion object{
        val mapkCars = listOf("Bmw" , "lada" , "Mersedes")
    }


    fun myCAar(){
    println(" My car $market , $type")

}
}