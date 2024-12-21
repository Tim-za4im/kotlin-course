package lesson31.homeWork31

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File


//имя
//статус трудоустройства (булево)
//дата рождения (строка)
//должность CharacterTypes (enum из прошлого урока)
//список подчинённых с типом Emploee
//Создай небольшую иерархию из сотрудников где во главе CTO.
// Это значит что в объект сотрудника с должностью CTO в поле списка подчинённых должны попасть
// пара тим лидов, в списке подчинённых которых есть разработчики, дизайнеры и тестировщики.
// Чтобы было немного но и была вложенность.

//Сериализуй CTO в текст с настройкой prettyPrinting и текст запиши в файл в корне проекта.

//Прочитай текст из файла, десериализуй его в объект класса Employee и распечатай в консоль.

enum class CharacterTypes {
    CTO,
    UX_UI,
    GAME_DEV,
    TEAM_LEAD,
    QA
}
data class Employee(
    val name :String,
    val employmentStatus : Boolean,
    val bornDate:String,
    val positions: CharacterTypes,
    val listSubordinates : List<Employee> = listOf()
)
fun  hierarchies():Employee{

        val developers  = listOf(
            Employee(
        "Jack Sparrow",
        true,
        "19.1.1988",
        CharacterTypes.GAME_DEV
    ),
     Employee(
        "Brad Pitt",
        true,
        "29.10.1984",
        CharacterTypes.GAME_DEV
    ))
    val desighnUx = listOf( Employee(
        "Jenifer Lopez",
        true,
        "4.10.1990",
        CharacterTypes.UX_UI
    ),
    Employee(
        "Clint Estwood",
        true,
        "21.12.1989",
        CharacterTypes.UX_UI
    ))
    val qa = listOf( Employee(
        "Daiel Redclif",
        true,
        "27.9.1999",
        CharacterTypes.QA
    ),

    Employee(
        "Bobu Brown",
        true,
        "14.7.1998",
        CharacterTypes.QA
    ))
    val teamLead =  listOf(
        Employee(
            "Bob White",
            true,
            "11.4.1980",
            CharacterTypes.TEAM_LEAD,
            developers+desighnUx
        ),
        Employee(
            "John Gray",
            true,
            "28.7.1986",
            CharacterTypes.TEAM_LEAD,
            qa
        ))
     return Employee("Jack Black",
        true,
        "5.05.1970",
        CharacterTypes.CTO,teamLead)
}

   fun jsonFile (employee: Employee,name:String){
       val gson = GsonBuilder()
           .setPrettyPrinting()
           .create()// Создаём экземпляр Gson
    val json = gson.toJson(employee) // Сериализация объекта
    File(name).writeText(json)
   }

fun backJasonVal(nameFile: String): Employee{
    val gson=Gson()
    val json= File(nameFile)
        .readText()
    return gson.fromJson(json, Employee::class.java)

}

fun main() {
    val hierarchiesCTO = hierarchies()
    val testFile = "Employee.json"

    jsonFile(hierarchiesCTO,testFile)
    println("Иеархия сотрудников $testFile")

    val backJson = backJasonVal(testFile)
   println( "десериализуй в класс Employee: $backJson")

}
//val gson = Gson() // Создаём экземпляр Gson
//    val json = gson.toJson(user) // Сериализация объекта
//    println("JSON: $json")
//
//    val user1: User = gson.fromJson(json, User::class.java) // Десериализация JSON в объект
//    println("User: $user1")
//    val gson2 = GsonBuilder()
//        .setPrettyPrinting() // Для красивого форматирования JSON
//        .serializeNulls() // Включить null-поля в JSON
//        .create()



