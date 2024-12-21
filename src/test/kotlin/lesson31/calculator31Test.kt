package lesson31

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class calculator31Test{
    @Test
    fun plus(){
        val calku31= calculator31()
        val resukt =calku31.plus31(2,3)
        Assertions.assertEquals(resukt,5)

    }
}