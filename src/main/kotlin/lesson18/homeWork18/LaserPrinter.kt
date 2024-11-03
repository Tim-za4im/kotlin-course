package lesson18.homeWork18

import lesson18.Background
import lesson18.Colors

class LaserPrinter : Printer() {
    override fun colorTheme(index: Int): Pair<String, String?> {
        return Colors.BLACK to Background.WHITE
    }
}