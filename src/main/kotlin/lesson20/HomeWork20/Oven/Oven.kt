package lesson20.HomeWork20.Oven

import lesson20.HomeWork20.ControllTemperature

class Oven (workTemperaturr : Int, override val maxTemperature: Int) : ControllTemperature(workTemperaturr) {
}

fun main() {
    val oven = Oven(300, 400)
    oven.powerOn()
    oven.setTemperature(300)
    oven.programAction("Печь")
    oven.execute()
    oven.close()
    oven.powerOff()
}