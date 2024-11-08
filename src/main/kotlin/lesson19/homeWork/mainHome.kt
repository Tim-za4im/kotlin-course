package lesson19.homeWork

/*Игровой автомат

Опиши схематически класс игрового автомата, правильно расставив объявление полей (val или var) и методов (аргументы и возвращаемые значения), включая модификаторы доступа (private для приватных)

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
выплатить выигрыш

Почемучка
Нужно скопировать код к себе и постараться ответить на все “почему” в комментариях и заданным образом доработать класс ChildrenClass (BaseClass доработке не подлежит)
*/

/*Почемучка
Нужно скопировать код к себе и постараться ответить на все “почему” в комментариях и заданным образом доработать класс ChildrenClass (BaseClass доработке не подлежит)
abstract class BaseClass(
   // объясни, почему это поле доступно в main() для чтения из класса ChildrenClass
   private val privateVal: String,
   // объясни, почему это поле недоступно в main()
   protected val protectedVal: String,
   val publicVal: String
) {
 var publicField = "измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
       "Доработай ChildrenClass таким образом, чтобы это получилось"
       set(value) {
           if (verifyPublicField(value)) {
               field = value
           }
       }
   protected var protectedField = "измени меня из функции main() через сеттер в наследнике"
   private var privateField = "добавь сеттер чтобы изменить меня из main()"

   fun getAll(): String {
       return mapOf(
           "privateVal" to privateVal,
           "protectedVal" to protectedVal,
           "publicVal" to publicVal,
           "publicField" to publicField,
           "protectedField" to protectedField,
           "privateField" to privateField,
       ).map { "${it.key}: ${it.value}" }
           .joinToString("\n")
   }

   fun printText() {
       privatePrint()
   }

   // объясни, почему эта функция не может быть публичной
   protected open fun getProtectedClass() = ProtectedClass()

   protected open fun verifyPublicField(value: String): Boolean {
       return value.length < 3
   }

   private fun privatePrint() {
       println("Печать из класса BaseClass")
   }

   // объясни, почему эта функция не может быть публичной или protected
   private fun getPrivateClass() = PrivateClass()

   protected class ProtectedClass

   private class PrivateClass
}

class ChildrenClass(
   val privateVal: String,
   protectedVal: String,
   // объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
   publicVal: String
) : BaseClass(privateVal, protectedVal, privateVal) {

   // объясни, почему в main() доступна функция getAll() хотя её здесь нет

   // проверь, что выводится на печать при вызове функции printText()
   // и объясни, почему не происходит переопределение метода privatePrint()
   private fun privatePrint() {
       println("Печать из класса ChildrenClass")
   }
}
*/