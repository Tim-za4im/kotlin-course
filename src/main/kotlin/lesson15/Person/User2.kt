package lesson15.Person

data class user2(val id2 : Int, val name2 : String)


fun main() {


    val newUser = user2(30,"Bob")
    val newuser3 = newUser.copy( name2 = "ALcice")


    println(newUser)
    println(newuser3)
}