package lesson20.HomeWork20.task5

class WashMachine2 :  TemperOpenoverride (maxTemperature = 90) {
    override fun programAction(action: String) {
        super.programAction("Режим стирки - $action")
    }}