package lesson20.HomeWork20.task5

class Oven2 : TemperOpenoverride (250) {
    override fun programAction(action: String) {
        super.programAction("Режим выпекания - $action")
    }
}