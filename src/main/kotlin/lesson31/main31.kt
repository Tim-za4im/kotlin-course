package lesson31

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import lesson19.Student
import java.time.OffsetDateTime

data class Address(
    val street: String,
    val city: String,
    val postalCode: Int
)

data class User(
    val id: Int,
    val name: String,
    val isActive: Boolean,
    val address: Address
)
data class University(
    val name: String,
    val foundationYear: Int,
    val isPublic: Boolean,
    val faculties: List<Faculty>
)

data class Faculty(
    val name: String,
    val dean: String,
    val establishedYear: Int,
    val students: List<Student>
)

data class Student(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val major: String?,
)
fun main() {}


//
//    val address = Address("Baker Street", "London", 221)
//    val user = User(1, "Sherlock Holmes", true, address)
//
//    val gson = Gson() // Создаём экземпляр Gson
//    val json = gson.toJson(user) // Сериализация объекта
//    println("JSON: $json")
//
//    val user1: User = gson.fromJson(json, User::class.java) // Десериализация JSON в объект
//    println("User: $user1")
//    val gson2 = GsonBuilder()
//        .setPrettyPrinting() // Для красивого форматирования JSON
//        .serializeNulls() // Включить null-поля в JSON
//        .create()

//    val student1 = Student("John", "Doe", 20, "Computer Science", OffsetDateTime.now())
//    val student2 = Student("Jane", "Doe", 19, null, OffsetDateTime.now())
//
//    val faculty = Faculty("Engineering", "Dr. Smith", 1965, listOf(student1, student2))
//
//    val university = University("Tech University", 1905, true, listOf(faculty))
















//
//
//
//
//}
//
//
//class calculator31(){
//    fun plus31(a:Int,b:Int)=a+b
//}
//class SimpleTest {
//
//
//    private lateinit var testList: MutableList<String>
//
//    @BeforeEach
//    fun setUp() {
//        // Инициализация перед каждым тестом
//        testList = mutableListOf("one", "two", "three")
//        println("Список инициализирован перед тестом")
//    }
//
//    @AfterEach
//    fun tearDown() {
//        // Очистка после каждого теста
//        testList.clear()
//        println("Список очищен после теста")
//    }
//
//    @Test
//    fun testAddElement() {
//        // Добавляем элемент и проверяем размер списка
//        testList.add("four")
//        assertEquals(4, testList.size, "Размер списка должен быть 4")
//    }
//
//    @Test
//    fun testRemoveElement() {
//        // Удаляем элемент и проверяем размер списка
//        testList.remove("one")
//        assertEquals(2, testList.size, "Размер списка должен быть 2")
//    }
//}