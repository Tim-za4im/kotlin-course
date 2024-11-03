package lesson18.homeWork18

import lesson18.Colors
import lesson18.printColored

class Dog : Animal () {
    override fun makeSound() {
printColored("Bark" ,Colors.GREEN)
    }
}