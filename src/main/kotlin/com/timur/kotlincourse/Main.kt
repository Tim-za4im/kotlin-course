package com.timur.com.timur.kotlincourse

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

   soundIntensity ( startIntesity = null, standartCoffient )
    soundIntensity (startIntesity = 4.3, standartCoffient )

}
val standartCoffient : Double = 0.5

  fun soundIntensity ( startIntesity: Double? , standartCoffient:Double=0.5 ) {
      val  intensity : Double = (startIntesity ?: 0.0) * standartCoffient

      println(intensity)
  }