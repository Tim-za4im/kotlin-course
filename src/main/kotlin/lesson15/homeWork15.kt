package lesson15

class  pesron(
    val name: String,
    val age : Int = 0

)
object Logger {

    fun log(message: String) {
        println("Log: $message")
    }
}