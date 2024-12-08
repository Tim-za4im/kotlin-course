package lesson27.homeWork27

class Employee(val name: String, val age: Int, val position: String) {
    var email: String = ""
    var department: String = "General"


    override fun toString(): String {
        return "Employee(name = $name , age = $age, position = $position,email = $email,department = $department)" }
}