package lesson18.homeWork18

import lesson18.Colors
import lesson18.printColored

class Cat: Animal () {
    override fun makeSound() {
        printColored("Meow", Colors.PURPLE)
    }
}
