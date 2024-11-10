package lesson20.HomeWork20

abstract class DevicePrograble :OnOffDevice(),Programmable {
    override fun programAction(action: String){
        println(" Программирование действий $action")
    }
    override fun execute(){
        println("Выполнения действия")
    }
}