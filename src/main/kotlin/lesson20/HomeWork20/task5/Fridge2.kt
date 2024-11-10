package lesson20.HomeWork20.task5

import lesson20.HomeWork20.ControllTemperature

class Fridge2(override val maxTemperature: Int) :TemperOpenoverride(5) {
    override fun programAction(action: String) {
        super.programAction("Режим охлаждения - $action")
    }}

