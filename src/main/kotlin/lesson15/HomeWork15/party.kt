package lesson15.HomeWork15

class party ( val location :String, val attendees : Int){

    fun details( ){
        println(" Информацмя о месте проведения $location и колличество остей $attendees")
    }
}

/*Событие: Вечеринка Создайте класс Party, который описывает вечеринку.
 У него должны быть свойства location (String) и attendees (Int). Добавьте метод details(),
 который выводит информацию о месте проведения и количестве гостей*/