package lesson31

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class SimpleTestTest {
    lateinit var list31: MutableList<String>


    @BeforeEach
    fun setup() {
        list31 = mutableListOf("Hello", "world")

    }

    @Test
    fun forTest() {
        list31.add("Kotlin")
        Assertions.assertEquals( "Kotlin", list31[2])
    }
}