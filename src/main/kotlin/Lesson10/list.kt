package Lesson10

fun main (){


    val emtyList = listOf<Int>()
    val listString = listOf("Hello" , "World" , " Kotlin")
    val mutableList= mutableListOf(1,2,3,4,5)
    mutableList.add(6)
    mutableList.add(7)
    mutableList.add(8)
    mutableList[2]=24 //8 задание
println(mutableList.toList())
    val mutableList2= mutableListOf("Hello" , "World" , " Kotlin")
    mutableList2.remove("World")
    val numbersList = listOf(1,2,3,4,5)
    for (i in numbersList){
        println(i)
    }
    println(numbersList[2])//Задание 7

    val oneList = listOf( 1,2,3)
    val twoList = listOf(4,5,6)
    val joinlist = mutableListOf<Int>()
    for( i in oneList){
        joinlist.add(i)}
    for (j in twoList){
        joinlist.add(j)}
        println(joinlist.toList())

val listNumbers = listOf(2,6,8,10,12,14)
    var minNumbers = listNumbers[0]
    var maxNumbers = listNumbers[0]
    for ( i in listNumbers){
        if (i<minNumbers){
            minNumbers=i
        }
        if (i > maxNumbers){
            maxNumbers=i
        }
    }
    println("Минимальный : $minNumbers")
    println("Максимальный : $maxNumbers")

    val listNumber10 = listOf(1,2,3,4,5,6,7,8,9,10)
    val numberEven = mutableListOf<Int>()

    for(i in listNumber10){
        if (i%2==0){
            numberEven.add(i)
        }
    }
    println(numberEven)


    }






















