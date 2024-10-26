package lesson15.HomeWork15

class emotion ( val type :String,
                val  intensity :Int
){

    fun express() {
        when  (intensity){
         in 0..2-> " Слабая эмоция "
         in 3 ..8 -> "Средня эмоция "
          in 9..10 ->  " Силтная эмоция "
        else  -> "нет таких эмоций"
    }
}
}



//реальноk56сти: Эмоция Создайте класс Emotion, который представляет эмоцию.
//У него должно быть свойство type (String) и intensity (Int). Добавьте метод express(),
//который выводит описание эмоции в зависимости от её типа и интенсивности.