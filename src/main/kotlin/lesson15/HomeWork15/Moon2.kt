package lesson15.HomeWork15

object Moon2 {var isVisible: Boolean =true


    fun  showPhase(day : Int){

        val phase = when (day) {

            in 1..6 -> "New Moon"
            in 7..13 -> "Rise Moon"
            14 -> "Full Moon"
            in 15..21 -> "Down Moon"
            in 22..28 -> "Last moon"
            else -> "нету фазы"
        }
        if (isVisible) {
            println("Луну видно в  ночь $day  а значит фаза луны $phase")
        } else {
            println(" Луна не видна")
        }

    }
}





//Природное явление: Луна Создайте объект Moon, который будет представлять Луну.
//Добавьте свойства isVisible (Boolean), чтобы отображать, видна ли Луна в данный момент, и phase (String),
//чтобы отображать текущую фазу Луны (например, "Full Moon", "New Moon"). Добавьте метод showPhase(), который выводит текущую фазу Луны.