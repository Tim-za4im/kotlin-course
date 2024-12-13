package lesson28.homework

import jdk.internal.org.jline.utils.Colors.J
import jdk.internal.org.jline.utils.Colors.s
import java.io.File

fun main() {


    val fileTest = File("scr/main/kotlin/TestCreat/fileTest.txt")

    val directoryTest = File("scr/main/kotlin/TestCreat/directory")


    //fileTest.parentFile.mkdirs()

    fileTest.createNewFile()

    if (fileTest.exists()) {

        println("Файл существует")

    } else {

        println("Файл не найден")

    }
    fileTest.writeText("Hello,Kotlin!")
    println(fileTest)

   val directory2Test = File("task2/testDir")
    if (!directory2Test.exists()){
        directory2Test.mkdirs()
        println("Create Directory")
    } else{
        if (directory2Test.isDirectory){
            println("путь ${directory2Test.absolutePath}")}
        else{
            println("$directory2Test не является директорий")
    }
    }

val task3 = File("task3/structure")
    task3.mkdirs()
    val myDir = File(task3,"myDir")
    myDir.mkdirs()
    val  subDir1 = File(myDir," subDir1")
    subDir1.mkdirs()
    val  subDir2 = File(myDir," subDir2")
    subDir2.mkdirs()
if (listOf(myDir,subDir2,subDir1).all{it.exists()&&it.isDirectory}){
    println("Директория создана и эементы есть")
}else
{
    println("Директория не создана")
}
    val task4 = File("task4/temp")
    task4.mkdirs()

    (1..6).forEach{j -> val i =task4.resolve("$j")
        i.mkdirs()
        val fileA="File A $j.txt"
        val newA=File(i,fileA)
        newA.createNewFile()
    }
 task4.deleteRecursively()
if (task4.exists()){
    println("Error deleted")
}else {
    println("Delelet compled")
}


    val task5 = File("task5/config/config.txt")
    task5.parentFile.mkdirs()
    task5.createNewFile()
    task5.writeText("Hello=value 1, Kotlin=value 2,World=value 3")
    val task5line = task5.readText().split(",")
    for (task5line in task5line){
        val value=task5line.split("=")
            .getOrNull(1)
        value?.let{ println(it) }
    }



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




}