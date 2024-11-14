package lesson21.HomeWork21

import lesson21.HomeWork21.Validator.Validator

/*Создай класс ListValidator
с дженериком, ограниченным типом Number
имплементируй интерфейс Validator
типизированный по типу List с nullable типом дженерика класса
Реализуй проверку:
что ни один элемент списка не является null
Ни один элемент приведённый к типу Double не равен 0.0
*/

class ListValidator <T:Number>:Validator<List<T?>>{
    override fun boolean(value: List<T?>): Boolean {
        for (i in value) {
            if (i == null || i.toDouble() == 0.0) {
                return false
            }
        }
        return true
    }
}