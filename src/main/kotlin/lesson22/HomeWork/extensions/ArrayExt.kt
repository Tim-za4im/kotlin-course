package lesson22.HomeWork.extensions

fun Array<Int>.numberCount():
        Pair<Int, Int> {
    var evensNumbers = 0
    var oddsNumber = 0
    this.forEach { if (it % 2 == 0) evensNumbers++ else oddsNumber++ }
return Pair(evensNumbers,oddsNumber)

}