package lesson18.homeWork18

import lesson18.Colors
import lesson18.printColored

class Bird : Animal () {
    override fun makeSound() {
        printColored("Tweet" , Colors.RED)
    }
}