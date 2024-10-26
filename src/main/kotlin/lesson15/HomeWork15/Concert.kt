package lesson15.HomeWork15

class Concert(
    val group : String,
    val locationVenue: String,
    val costTicket: Int,
    val capacity :Int=100
) {
    private var soldTickets: Int=0

    fun info (){
        println( "Концерт группы $group, выступают  на сцене $locationVenue, " +
                "стоймость билета $costTicket, Внимание колличество мест в зале ограничено, всего мест $capacity ")
    }
    fun ticketSale (){
        if (soldTickets<capacity) {
            soldTickets++
            println("Продано билетов $soldTickets")}

          else {println("Нету билетов")

    }
}}

// Концерт Создайте класс, который будет представлять концерт.
//У него должны быть свойства “группа”, “место проведения”, “стоимость”, “вместимость зала”. Также приватное поле “проданные билеты”.
//Добавьте метод, который выводит информацию о  и метод “купить билет”, который увеличивает количество проданных билетов на один.
