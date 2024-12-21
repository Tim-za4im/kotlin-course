package lesson30.homeWork30

import lesson15.Person.Sun.mass
import kotlin.math.E


enum class TestStatus {
    PASS,
    BROKEN,
    FAILURE
}

enum class HouseType(val houseType2: String) {
    ROOM0("Комната"),
    ROOM1("Однушка"),
    ROOOM2("Двушка"),
    ROOM3("Трёшка"),
    PANTHOUSE("ПэнтХаус"), ;
}

enum class PlaneSystem(
    val distanceSun: Double,
    val mass: Double
) {
    MERCURY(0.39, 3.285e23),
    VENUS(0.72, 4.867e24),
    EARTH(1.00, 5.972e24),
    MARS(1.52, 6.417e23),
    JUPITER(5.20, 1.898e27),
    SATURN(9.58, 5.683e26),
    URANUS(19.22, 8.681e25),
    NEPTUNE(30.05, 1.024e26), ;
}

fun housePrintLong() {
    HouseType.entries
        .sortedBy { it.name.length }
        .forEach { println(it.houseType2) }
}

fun testTask3(j: () -> Unit): TestStatus {
    return try {
        j()
        TestStatus.PASS
    } catch (e: AssertionError) {
        TestStatus.FAILURE
    } catch (e: Exception) {
        TestStatus.BROKEN
    }
}

fun planetFilter(planetFun: (PlaneSystem) -> Boolean): PlaneSystem {
    return PlaneSystem.entries.firstOrNull(planetFun) ?: throw Exception("нет подходящей условиям")
}

fun main() {

    val task3A = testTask3 { println("Hello World!") }
    println(task3A)
    println("\n")
    val task3B = testTask3 { throw AssertionError("Fail") }
    println(task3B)
    println("\n")
    val task3C = testTask3 { throw IllegalArgumentException("Wrong enter!") }
    println(task3C)
    println("\n")

    val massPlanet = planetFilter { i ->
        i.mass == PlaneSystem.values().maxOf { it.mass }
    }
println(massPlanet)
}