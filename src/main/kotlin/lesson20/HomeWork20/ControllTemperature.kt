package lesson20.HomeWork20

abstract class ControllTemperature (
       val maxTemp : Int) : DevicePrograble (), TemperatureRegulatable,Openable
{
    override fun setTemperature(temp: Int) {
        when {
            temp <= maxTemperature-> println("температура настроена на $temp градусов")
            else -> println(" Температура превышает максиму возможностей")
        }
    }

    override fun open() {
        println("Открыто")
    }

    override fun close() {
        println("Закрыто")
    }
}