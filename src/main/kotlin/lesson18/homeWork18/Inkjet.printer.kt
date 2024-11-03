package lesson18.homeWork18

import lesson18.Background
import lesson18.Colors

class Inkjet : Printer() {
    val textColors = listOf(Colors.RED,Colors.GREEN,Colors.BLUE, Colors.YELLOW)
    val  backroundColoros = listOf(Background.WHITE, Background.CYAN,Background.PURPLE)

    override fun colorTheme(index: Int): Pair<String, String?> {
        val  textTone = textColors[index % textColors.size]
        val bgTone = backroundColoros[index % backroundColoros.size]
        return textTone to bgTone
    }
}