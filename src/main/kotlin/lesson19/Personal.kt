package lesson19

open class Person(private val name: String, protected val age: Int) {



    fun greet(){
        println("Приветб меня зовут $name")

    }

    protected fun getName():String{
     return name
    }

    private fun secret () {
        println("Это секреткый метод")
    }
}

/*class Student(name: String, age: Int, val studentId: Int) : Person(name, age) {

    // Публичный метод
    fun study() {
        // Используем защищённый метод getName() из родительского класса
        println("${getName()} учится.")
    }

    fun showAge() {
        // Обращаемся к защищённому полю age из родительского класса
        println("Мне $age лет.")
    }

    fun tryAccessSecret() {
        // Попытка вызвать приватный метод secret() из родительского класса
        // secret() // Ошибка компиляции: метод secret() недоступен
    }
}

*/