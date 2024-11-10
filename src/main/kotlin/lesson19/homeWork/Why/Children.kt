package lesson19.homeWork.Why
class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле : в классе Base  нету ограничений, оббявлен как  public
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {

    override fun verifyPublicField (value: String) : Boolean{
        return true
    }
    fun changePrivateField(value: String) {
        protectedField = value
    }


    }
    // объясни, почему в main() доступна функция getAll() хотя её здесь нет : от класса Base наследована

    // проверь, что выводится на печать при вызове функции printText()
    // и объясни, почему не происходит переопределение метода privatePrint() : она толтко для класс Base из-за модификатора  private

    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

fun main () {

val kidsClass = ChildrenClass(
    "privateVal1",
    "protectedVal2",
    "publicVal3"
)

    kidsClass.publicField= "Антонио Бандераса"
    println(kidsClass.publicField)

    kidsClass.changeProtectedField("Изменения ")
    kidsClass.changeProtectedField("Новые иизменения")
    kidsClass.printText()

    println(kidsClass.getAll())
}



