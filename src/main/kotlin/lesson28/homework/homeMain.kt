package lesson28.homework

import jdk.internal.org.jline.utils.Colors.J
import jdk.internal.org.jline.utils.Colors.s
import lesson26.homeWrok26.task6
import java.io.File


fun main() {


    val fileTest = File("task1/example.txt")

    val directoryTest = File("scr/main/kotlin/TestCreat/directory")


    fileTest.parentFile.mkdirs()

    fileTest.createNewFile()

    if (fileTest.exists()) {

        println("Файл существует")

    } else {

        println("Файл не найден")

    }
    fileTest.writeText("Hello,Kotlin!")
    println(fileTest)

    val directory2Test = File("task2/testDir")
    if (!directory2Test.exists()) {
        directory2Test.mkdirs()
        println("Create Directory")
    } else {
        if (directory2Test.isDirectory) {
            println("путь ${directory2Test.absolutePath}")
        } else {
            println("$directory2Test не является директорий")
        }
    }

    val task3 = File("task3/structure")
    task3.mkdirs()
    val myDir = File(task3, "myDir")
    myDir.mkdirs()
    val subDir1 = File(myDir, " subDir1")
    subDir1.mkdirs()
    val subDir2 = File(myDir, " subDir2")
    subDir2.mkdirs()
    if (listOf(myDir, subDir2, subDir1).all { it.exists() && it.isDirectory }) {
        println("Директория создана и эементы есть")
    } else {
        println("Директория не создана")
    }
    val task4 = File("task4/temp")
    task4.mkdirs()

    (1..6).forEach { j ->
        val i = task4.resolve("$j")
        i.mkdirs()
        val fileA = "File A $j.txt"
        val newA = File(i, fileA)
        newA.createNewFile()
    }
    task4.deleteRecursively()
    if (task4.exists()) {
        println("Error deleted")
    } else {
        println("Delelet compled")
    }


    val task5 = File("task5/config/config.txt")
    task5.parentFile.mkdirs()
    task5.createNewFile()
    task5.writeText("Hello=value 1, Kotlin=value 2,World=value 3")
    val task5line = task5.readText().split(",")
    for (task5line in task5line) {
        val value = task5line.split("=")
            .getOrNull(1)
        value?.let { println(it) }
    }
    fun task6(direct:File){
        println("Direct ${direct.absolutePath}")
        direct.walk().forEach { data->
            if(data.isDirectory){
                println("direct path${data.absolutePath}")
        }else{
            println("file${data.absolutePath}")
            }}

    }

    val task6Direction =File("scr")
    task6(task6Direction)
println("\n")

    val task7 = File("task9/docs")
    val read7 = "task9/docs/readme.md"
    val newDirectt = task7

    if (!newDirectt.exists()) {
        newDirectt.mkdirs()
        println("Директория создана: $task7")
    }

    val file77 = File(read7).apply {
        if (!exists()) {
            createNewFile()
            writeText("This is a README file.")
            println("Файл readme.md создан и заполнен текстом.")
        } else {
            println("Файл readme.md уже существует.")
        }
    }


//    val task7 =File("task9/docs")
//    val read7 = ("task9/docs/readme.md")
//    val newDirectt = (task7)
//    if (!newDirectt.exists()) {
//        newDirectt.mkdirs()
//        println("Директоррия есть $task7")
//    }
//    val file77 = File(read7).apply {
//    if (!exists()) {
//        createNewFile()
//        writeText("This is a README file.")
//        println("README file есть")
//    }else{
//        println("README file не существует")}}


    val task8 = File("task10")
    val file8 = File("task10/data/1/4/prod/data14.mysql")
    val file8A = File("task10/data/2/3/prod/data14.mysql")
    val file8B = File("task10/data/5/2/prod/data14.mysql")

    val allFilesList = listOf(file8,file8A,file8B)


    allFilesList.forEach { all->
        all.parentFile.mkdirs()
        println("File created ${all.absolutePath}")
    }
    val task10Backup = File("task10/backup")
task10Backup.mkdirs()
    allFilesList.forEach { sourceFile ->
        if (sourceFile.exists()){
        val pathCopy: File = sourceFile.relativeTo(task8)
        val targetFile = File(task10Backup, pathCopy.path)

        targetFile.parentFile.mkdirs()
        sourceFile.copyTo(targetFile, overwrite = true)
        println("File copied: ${sourceFile.absolutePath} -> ${targetFile.absolutePath}")
    } else{
            println("File do not exist ${sourceFile.absolutePath}")
    }}}








//workspace/task10/data/2/3/prod/data23.mysql
//workspace/task10/data/5/2/prod/data52.mysql
//Создайте директорию workspace/task10/backup












//
//        println(file.name)
//
//    }
//
//    if (file.delete()) {
//
//        println("Файл удален")
//
//    } else {
//
//        println("Не удалось удалить файл")
//
//    }
//
//    if (file.deleteRecursively()) {
//
//        println("Директория и всё её содержимое удалено")
//
//    } else {
//
//        println("Не удалось удалить директорию")
//
//     }




