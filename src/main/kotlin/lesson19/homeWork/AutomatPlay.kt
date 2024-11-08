package lesson19.homeWork
/*Опиши схематически класс игрового автомата, правильно расставив объявление полей (val или var) и
методов (аргументы и возвращаемые значения), включая модификаторы доступа (private для приватных)

Поля:
цвет
модель
включен
ОС загружена
список доступных игр
наличие джойстика
баланс вырученных средств
владелец
телефон поддержки.

Методы:
включить
выключить
загрузить ОС
завершить работу ОС
показать список игр
включить игру
оплатить игровой сеанс
открыть сейф и выдать наличные
выплатить выигрыш*/
class AutomatPlay (
    val color: String,
    var model :String,
    var automatIsOn: Boolean =false,
    var  osLoad : Boolean=false,
    private val gameList : List<String>,
    var joystick : Boolean,
    private var balanceMoney: Int,
    val masterAutomatPlay: String,
    val supportNumber : String,
    )


{
    fun onAutomat (){
        automatIsOn=true
    }



    fun offAutomat (){
        automatIsOn=false
    }


    private fun loadingOS(){
        osLoad=true
    }



    private fun offOS (){
        osLoad=false
    }


    fun showGameLIst ():List<String> {
        return gameList
    }


//

    fun startGame (game:String){
    return if (gameList.contains(game)) {
        println("Start Gme")
    }else
        { println("No game")
  }}

private fun paySession(pay: Int) {
    if (pay > 0) {
        balanceMoney += pay
    } else {
        println("No money - no honey")

    }
}

    private fun openSafe(money:Int){
        if (money<=balanceMoney){
            balanceMoney-=money
        }
        else println("no")
    }

    fun payWins (money: Int){
        openSafe(money)
    }
}
