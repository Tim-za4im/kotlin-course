package lesson20.HomeWork20.task5

import lesson20.HomeWork20.Openable
import lesson20.HomeWork20.Powerable
import lesson20.HomeWork20.Programmable
import lesson20.HomeWork20.TemperatureRegulatable

abstract  class TemperOpenoverride (
    override val maxTemperature: Int
) : Powerable, TemperatureRegulatable, Openable, Programmable
{

    protected var isPoweredOn = false
    protected var isOpen = false
    protected var currentTemperature = 0

    override fun powerOn() {
        isPoweredOn = true
        println("Устройство включено")
    }

    override fun powerOff() {
        isPoweredOn = false
        currentTemperature = 0
        println("Устройство выключено")
    }

    override fun setTemperature(temp: Int) {
        if (isPoweredOn) {
            if (temp <= maxTemperature) {
                currentTemperature = temp
                println("Температура установлена на $temp градусов")
            } else {
                println("Ошибка: Превышена максимальная температура ($maxTemperature градусов)")
            }
        } else {
            println("Ошибка: Невозможно установить температуру, так как устройство выключено")
        }
    }

    override fun open() {
        isOpen = true
        println("Устройство открыто")
    }

    override fun close() {
        isOpen = false
        println("Устройство закрыто")
    }

    override fun programAction(action: String) {
        if (isPoweredOn) {
            println("Программируем действие: $action")
        } else {
            println("Ошибка: Невозможно выполнить действие, так как устройство выключено")
        }

    }
    override fun execute(){
        println("Выполнения действия")
    }
}
