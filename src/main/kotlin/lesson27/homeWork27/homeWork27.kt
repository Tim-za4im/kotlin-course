package lesson27.homeWork27

import kotlin.math.E

/*Задание 1. Функция высшего порядка.

Создайте функцию timeTracker, которая принимает другую функцию в качестве аргумента и измеряет время её выполнения.
 Функция timeTracker должна возвращать затраченное время в миллисекундах.
 Для измерения времени используйте System.currentTimeMillis() до и после выполнения переданной функции.

Для проверки результата можно выполнить в ней например такой ресурсоёмкий код:

val myFunction = {
    val list = List(10000000) { (0..10000).random() }
    list.sorted()
}



Задания для работы со scope функциями

Давайте создадим два класса,
которые будут использоваться в заданиях для демонстрации работы scope функций с преобразованием объектов
 и инициализацией или обновлением полей.
 Классы будут представлять собой Person и Employee, где Employee может быть создан на основе данных класса Person.

Классы для демонстрации

class Person(val name: String, val age: Int) {
    var email: String = ""
}

class Employee(val name: String, val age: Int, val position: String) {
    var email: String = ""
    var department: String = "General"
}


Задание 2: Использование apply для инициализации объекта Employee
Создайте объект Employee и используйте apply для инициализации его полей email и department.

Задание 3: Использование also для логирования
Создайте функцию, принимающую объект Person и выводящую информацию об объекте в консоль в красивом, отформатированном виде.
Создайте объект Person и используйте also для печати данных в консоль с помощью метода который только что создали.
Задание 4: Использование with для преобразование Person в Employee
Создайте объект класса Person. Используйте функцию with, чтобы создать из этого объекта Employee, указав дополнительно должность. Возвращаемым значением должен быть новый объект Employee.
Задание 5: Использование run для преобразования и инициализации Employee
Создайте объект класса Person. Используйте функцию run, чтобы инициализировать объект Employee, добавить ему email и department с помощью apply, вернуть инициализированный объект.
Задание 6: Использование let для безопасного преобразования Person в Employee
Создайте функцию, которая принимает объект класса Person?, который может быть null. В функции используйте функцию let для создания Employee, только если объект Person не null. В противном случае возвращается null


*/



fun timeTracker (func :() -> Unit): Long {
    val startCout = System.currentTimeMillis()
    func()
    val endCout =System.currentTimeMillis()
    return endCout - startCout
}
fun logPerson(person: Person){
    println("Name ${person.name}\n Age${person.age}\nEmail ${person.email}")
}

fun objectPerson (person: Person?):Employee?{
    return person?.let {
        Employee(it.name,it.age,"Security")
            .also{ employee -> employee.email=it.email }
    }
}
fun main() {
    val myFunction = {
        val list = List(10000000) { (0..10000).random() }
        list.sorted()
    }
    val timeList = timeTracker{myFunction()}
    println("Time work $timeList")
    println("\n")


val person = Person("Bob",18)
    val employee=person.let {
        Employee(it.name,it.age,"Junior\n")
    }.also { it.email="kotlin@gmail\n" }

println(employee)
    println("\n")

    val personA = Person("Jack",35)
    val examplRun = personA.run {
        Employee(name,age,"Master\n").apply {
        email= "${name}Master@gmail\n"
        department="X\n"}

    }

    println(examplRun)
    println("\n")

    val personApply = Person("John",44)
    val employeeApply = Employee(
        personApply.name,personApply.age, "Lead\n"
    ).apply {email= "${person.name}@gmail.com\n"
    department="TestGroup\n"}

    val employeeWith = with(personApply){
        Employee(name,age,"Director")
    }


    println(employeeApply)
    println("\n")

    println("Name ${employeeWith.name}")
    println("Age ${employeeWith.age}")
    println("Position ${employeeWith.position}")
    println("\n")


val personAlso= Person("Timur",33)
    personAlso.also { logPerson(it) }
    println("\n")

val person6: Person?=Person("Nick",23)
    val personNull: Person?=null


    val employeeNull = objectPerson(person6)
    if (employeeNull!=null){
        println(employeeNull)}
    else
    {
        println("Person is null")}


}