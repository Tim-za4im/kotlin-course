package lesson20.HomeWork20.task5

fun main() {

println("\n ***** Холодильни****")
    val fridge = Fridge2(5)
    fridge.powerOn()
    fridge.setTemperature(4)
    fridge.programAction("супер охлаждение")
    fridge.open()
    fridge.close()
    fridge.powerOff()


    println("\n**** стиральная машина*****")
    val washingMachine = WashMachine2()
    washingMachine.powerOn()
    washingMachine.setTemperature(60)
    washingMachine.programAction("деликатная стирка")
    washingMachine.powerOff()

    println("\n***Чайник*****")
    val kettle = Kettle()
    kettle.powerOn()
    kettle.setTemperature(100)
    kettle.programAction("кипячение воды")
    kettle.powerOff()

    println("\n***Духовкa***")
    val oven = Oven2()
    oven.powerOn()
    oven.setTemperature(200)
    oven.programAction("выпекание хлеба")
    oven.powerOff()

}