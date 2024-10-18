package lesson13

fun filter(collection: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in collection) {
        if (i in 7..17) result.add(i)
    }
    return result
}
//val numbers = listOf(-1, 2, -3, 4, -5)
//val positiveNumbers = numbers.filter { it > 0 }
//println(positiveNumbers)
//val sumOfNumbers = numbers.sum()
//println(sumOfNumbers)
//val averageOfNumbers = numbers.average()
//println(averageOfNumbers)
//val distinctNumbers = listOf(1, 2, 2, 3, 3, 3, 4).distinct()
//println(distinctNumbers)
//println(numbers.size)
//val numbers = listOf(1, 2, 3)val associatedNumbers = numbers.associateBy { it * 2 }
//println(associatedNumbers) // Prints: {2=1, 4=2, 6=3}
//val numbers = listOf(1, 2, 3)val associatedNumbers = numbers.associate { it to "$it" }
//println(associatedNumbers) // Prints: {1=1, 2=2, 3=3}
//val numbers = listOf(1, 2, 3)val associatedNumbers = numbers.associateWith { "$it" }
//println(associatedNumbers) // Prints: {1=1, 2=2, 3=3}