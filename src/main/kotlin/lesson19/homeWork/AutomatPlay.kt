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
    val model :String,
   private var automatIsOn: Boolean =false,
    private var  osLoad : Boolean=false,
    private val gameList : List<String>,
    val joystick : Boolean,
    private var balanceMoney: Int,
    var masterAutomatPlay: String,
    private var  supportNumber : String,
    )


{
    fun onAutomat (){
        automatIsOn=true
        loadingOS()
    }



    fun offAutomat (){
        offOS ()
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




    fun startGame (game:String){
    return if (gameList.contains(game)) {
        println("Start Gme")
    }else
        { println("No game")
  }}

 fun paySession(pay: Int) {
    if (pay > 0) {
        balanceMoney += pay
    } else {
        println("No money - no honey")

    }
}

    fun openSafe(money:Int){}


    protected fun payWins (money: Int){
        openSafe(money)
    }
}
