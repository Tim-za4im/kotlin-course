package lesson19


class Student(name: String, age: Int, val studentId: Int) : Person(name, age) {

    // Публичный метод
    fun study() {
        // Используем защищённый метод getName() из родительского класса
        println("${getName()} учится.")
    }

    fun showAge() {
        // Обращаемся к защищённому полю age из родительского класса
        println("Мне $age лет.")
    }
}