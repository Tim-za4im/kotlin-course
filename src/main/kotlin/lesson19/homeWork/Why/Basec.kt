package lesson19.homeWork.Why
//Почемучка
//Нужно скопировать код к себе и постараться ответить на все “почему” в
//комментариях и заданным образом доработать класс ChildrenClass (BaseClass доработке не подлежит)
abstract class BaseClass(
   // объясни, почему это поле доступно в main() для чтения из класса ChildrenClass:
   private val privateVal: String, //наследуется в класс ChildrenClass поэтуму доступны для только для чтения
   // объясни, почему это поле недоступно в main() :
   protected val protectedVal: String,// protected это внутри этого класса наследования
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
   protected open fun getProtectedClass() = ProtectedClass() //  модификатор доступа protected class ProtectedClass только внутри класса

   protected open fun verifyPublicField(value: String): Boolean {
       return value.length < 3
   }

   private fun privatePrint() {
       println("Печать из класса BaseClass")
   }

   // объясни, почему эта функция не может быть публичной или protected
   private fun getPrivateClass() = PrivateClass()// модификатор доступа у  PrivateClass написан  private class

   protected class ProtectedClass

   private class PrivateClass
}



