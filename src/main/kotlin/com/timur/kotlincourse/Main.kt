package com.timur.com.timur.kotlincourse

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val standartCoffient : Double = 0.5 //ide выдает ошибку в 7 и 8 строке Unresolved reference, поэтому обьявил переменную заранее
    soundIntensity ( startIntesity = null, standartCoffient )
    soundIntensity (startIntesity = 12.7, standartCoffient )

}


  fun soundIntensity ( startIntesity: Double? , standartCoffient:Double=0.5 ) {
      val  intensity : Double = (startIntesity ?: 0.0) * standartCoffient

      println(intensity)
  }