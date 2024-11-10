package lesson20.HomeWork20

abstract class RobotVacuumCleaner(
    var onIt: Boolean = false,
    var direction: String = " вперед"
) :

    Powerable,
    Programmable,
    LightEmitting,
    BatteryOperated,
    Rechargeable, AutomaticShutdown,
    Movable, Timable, Cleanable {


    override fun powerOn() {
        onIt = true
        println("Включилось")
    }

    override fun powerOff() {
        onIt = false
        println("Выключислось")
    }

    override fun programAction(action: String) {
        println(" Программирование действий $action")
    }

    override fun execute() {
        println("Выполнения действия")
    }

    override fun emitLight() {
        println("Робот включил подсветку")
    }

    override fun move(direction: String, distance: Int) {
        println(" робот двигается $direction на $distance m")
    }

    override fun clean() {
        when {
            onIt -> println(" Робот убирается")
            else -> println(" Робот выключен")
        }
    }

    override fun startMonitoring() {
        println(" Робот начинет выключатся автоматически")
    }



    override fun getCapacity(): Double {
        return  100.0
    }

    override fun replaceBattery() {
        println("Замените Батеарею")

    }

    override fun getChargeLevel(): Double {
        return 80.0
    }

    override fun recharge() {
        println("Робот заряжается")
    }
    abstract fun cleanerPlanned(time: String)
}
