package Lesson5



fun main(){
    println(soundIntensity(20.0))
    println(sumPrice (150))
    println(meteodata("765 давление"))
}


fun soundIntensity ( startIntesity: Double? , standartCoffient:Double=0.5 ) {
    val standartCoffient: Double = 0.5
    soundIntensity(startIntesity = null, standartCoffient)
    soundIntensity(startIntesity = 12.7, standartCoffient)
    val intensity: Double = (startIntesity ?: 0.0) * standartCoffient
    println(intensity)
}


fun sumPrice( num: Int?) {
    val insurance = 0.5 //страховка
    val sumInsurance = (num ?: 50) * insurance / 100 // вычисление стомойсти страховки
    var fullPrice = (num ?: 50) + sumInsurance //Полная стоймойсть
    println(fullPrice)
}

    fun meteodata ( atmosferData: String?) {
       val atmosferData = (atmosferData ?: throw Exception ("Все метео данные"))
    }
//val standartCoffient : Double = 0.5 // Коэффицент затухания, ide выдает ошибку в строке Unresolved reference, поэтому обьявил переменную заранее
//soundIntensity ( startIntesity = null, standartCoffient )
//soundIntensity (startIntesity = 12.7, standartCoffient)

//Контекст: Клиент оплачивает доставку груза. К стоимости доставки добавляется страховка на груз,
//которая составляет 0,5% от его стоимости. В случае, если стоимость не указана, то берётся стандартная стоимость в $50
//Задача: Рассчитать полную стоимость доставки.
////Вы проводите метеорологические измерения. Одним из важных показателей является атмосферное давление,
// которое должно быть зафиксировано. Лаборант приносит вам набор показателей, но по пути может что-нибудь потерять.
// Задача - сообщить об ошибке в случае отсутствия показаний атмосферного давления.

//    var fullPrice : Double //Полная цена с учетом скидки
//    sumPrice(90)
//    sumPrice(null)