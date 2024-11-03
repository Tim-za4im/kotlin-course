package lesson18.homeWork18

import kotlin.math.sin

class Triangle2(
    val sideA :Double,
    val sideB: Double,
    val corner: Double
): Shape() {

    override fun area(): Double {
        val angle = Math.toRadians(corner)
        return   0.5 * sideA * sideB * sin(angle)

    }
}