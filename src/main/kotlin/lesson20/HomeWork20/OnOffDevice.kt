package lesson20.HomeWork20

abstract class OnOffDevice: Powerable {
    var isOn : Boolean = false

    override fun powerOn(){
        isOn = true
        println("Включилось")
    }
    override fun powerOff(){
        isOn= false
        println("Выключено")
    }

}