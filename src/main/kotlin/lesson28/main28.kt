package lesson28

import java.awt.SystemColor.text
import java.io.File

fun main() {


    val file = File("path/to/your/file.txt")

    val directory = File("path/to/your/directory")

    file.parentFile.mkdirs()

    file.createNewFile()

    if (file.exists()) {

        println("Файл существует")

    } else {

        println("Файл не найден")

    }

    val isNewFileCreated: Boolean = file.createNewFile()

    if (isNewFileCreated) {

        println("Файл был создан")

    } else {

        println("Файл уже существует")

    }

    file.writeText("Hello, world!")
    val text = file.readText()

    println(text)

    (1..5).forEach{file.parentFile.resolve("$it").mkdirs()}

    val files = directory.listFiles()

    files?.forEach { file ->

        println(file.name)

    }

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

   // }

    file.walk().filter { it.isFile }

        .associate { it.name to it.readLines() }

        .filterValues { data ->

            data.any {it.contains("text")}

        }

    println(file.absoluteFile)

    val t: String = file.parent

    val k: File = file.parentFile


println(file.parent)

    println(file.parentFile)


    val baseDir = File("path/to")

    val file1 = File("path/to/nested/file.txt")

    val relative = file1.toRelativeString(baseDir)

    println(file1.toRelativeString(baseDir))

    val baseDir2 = File("path2/to")

    val file3 = baseDir2.resolve(relative)

    file3.parentFile.mkdirs()

    file3.createNewFile()


fun examl1 ( path : String) {
    File(path).apply {
        if (path.endsWith("/")) {
            mkdirs()
        } else {
            parentFile.mkdirs()
            createNewFile()
        }
    }}}
    //fun writeMap(map : Map<String,Int>,path1:String){val dataString=map.map{"${it.key}=${it.valu}"}.joinToString("/n)
//    createFileOrDirectory(path1)
//    File(path1).writeText(dataString)
//}












