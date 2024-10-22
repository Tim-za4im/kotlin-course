package lesson14

fun main () {

//Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время выполнения теста.

    val midleAveragTime = mapOf(
        "ТестА1" to 40,
        "ТестБ2" to 50, "ТестВ3" to 55
    )
    //for (entry in midleAveragTime.entries)
    val tesTime = midleAveragTime.values.sum()
    val avarage = tesTime.toDouble() / midleAveragTime.size
    println("Cреднее время выполнения теста %.2f".format(avarage))

    //Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения - строка с метаданными.
    // Выведите список всех тестовых методов.

    val taskMap2 = mapOf(
        "Стринг" to "В строку",
        " Формат" to "Форматирует значение",
        " getOf" to "Добавляет значение "
    )
    println(taskMap2.keys.joinToString("\n"))

    //В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат
    val mutableMapA = mutableMapOf(
        "ТестА1" to 40,
        "ТестБ2" to 50,
        "ТестВ3" to 55
    )
    mutableMapA["ТестГ4"] = 60
    println(mutableMapA)


//Посчитайте количество успешных тестов в словаре с результатами.
    val mutableMapCount = mutableMapOf(
        1 to "True", 2 to "Fail",
        3 to "True", 4 to "True",
        5 to "Fail",
        6 to "True", 7 to "Fail",
        8 to "True",
        9 to "True", 10 to "True"
    )
    println(mutableMapCount.count { it.value == "True" })

    //Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен.
    val mapBug = mutableMapOf(
        "Error1" to "Fix",
        "Error2" to "Unfix",
        "Error3" to "Fix",
        "Error4" to "Unfix"
    )
    mapBug.remove("Error3")
    println(mapBug)

    //Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа),
// выведите сообщение о странице и статусе её проверки.


    val mapWebTest = mapOf(
        "www.google.com" to true,
        "www.mail.ru" to true,
        "www.yahoo.com" to false
    )

    mapWebTest.forEach { (url, status) ->
        println(" cтраница $url статус проверки $status")
    }

    //Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.

    val mapService = mapOf("МакДак" to 50, "KFC" to 45, "Шаверма " to 30)
    val specifiedThreshold = 35
    println(mapService.filterValues { it > specifiedThreshold})
    println(mapService.filterValues { it > 30 })

//В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в строке).
//Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    val mapTestApi = mapOf(
        "EndpointA" to "Tested",
        "EndpointC" to "Tested",
        "EndpointB" to "Tested",
        "EndpointD" to "Error"
    )

    val status = mapTestApi["EndpointF"] ?:  "Endpoint не был протестирован"
    println("Cтатус для ответа  EndpointF: $status")
    val EndpointW = statusEndpoint("EndpointW", mapTestApi)
    println("Cтатус  ответа EndpointW $EndpointW")


    //Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации),
// получите значение для "browserType". Ответ не может быть null.

    val mapTestEnvironment = mapOf(
        "browserType" to "Opera",
        "login" to "password",
        "Sign in" to "Login"
    )
    val browserType = mapTestEnvironment.getValue("browserType")
    println("$browserType")

    //Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, чтобы добавить новую версию.
    val orginalMap = mapOf(
        "Alpha" to 1.0,
        "Beta" to 1.1,
        "TestQa" to 1.5,
    )
    val releaseMap = orginalMap.toMutableMap()
    releaseMap["Release"] = 2.0
    println(releaseMap)

    //Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства),
    //получите настройки для конкретной модели или верните настройки по умолчанию.
    val mapMobile = mutableMapOf(
        "Nokia" to 2.0,
        "Samsung" to 1.5,
        "LG" to 3.0
    )

    val defaultSettings = "defaultSettings"
    mapMobile["LG"] = 1.0
    val settings = mapMobile.getOrElse("LG") { defaultSettings }
    println("Настройки для LG: $settings")

//Проверьте, содержит ли словарь с ошибками тестирования (код и описание) определенный код ошибки.

    val mapError = mapOf(
        404 to "Not Found",
        505 to " Error Server",
        502 to " Bad GateWay"
    )
    val checkCode = mapError.containsKey(404)
    println(checkCode)

//Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version",
    //а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped").
    //Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов.
    val mapTestId = mapOf(
        "Test1_Version1.5" to "Passed",
        "Test2_Version2.0" to "Skipped",
        "Test3_Version1.7" to "Failed",
        "Test4_Version2.0" to "Passed",
        "Test5_Version2.2" to "Skipped"
    )
    val checkVersion = "2.0"
    val filterVersion = mapTestId.filterKeys { it.contains(checkVersion) }
    println(" версии тестов $checkVersion : $filterVersion")


//У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования.
// Проверьте, есть ли модули с неудачным тестированием.

    val testModule = mapOf(
        "Modul1" to "Test",
        "Modul2" to "Fail",
        "Modul3" to "Test",
        "Modul4" to "Fail",
        "Modul5" to "Test",
        "Modul6" to "Fail"
    )
    val modulFail = testModule.filter { it.value == "Fail" }.isNotEmpty()
    println(" Есть неудачные модули : $modulFail")
//Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    val mutableMapChange = mutableMapOf(
        1 to "a",
        2 to "t",
        4 to "b",
        3 to "c"
    )
    val newMutable = mutableMapOf(
        6 to "Q",
        5 to "E",
        7 to "H",
        8 to "W"
    )
    mutableMapChange.putAll(newMutable)
    println(mutableMapChange)

    //Объедините два неизменяемых словаря с данными о багах.

    val mapBugA = mapOf(
        "BugA" to "Texture Down",
        "BugB" to " Animation Stop",
        "BugC" to "Crash Memory"
    )


    val mapBugB = mapOf(
        "BugD" to " sound crash",
        "BugR" to "Freez NPC"
    )

    val mutableMapBugA = mapBugA.toMutableMap()
    mutableMapBugA.putAll(mapBugB)
    println(mutableMapBugA)

    //Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.

    val mapClear = mutableMapOf(
        "BugA" to " Down",
        "BugB" to "Stop",
        "BugC" to "Crash ",
        "BugD" to "sound ",
        "BugR" to "Freez"
    )
    mapClear.clear()
    println(mapClear)


    //Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”)
    val autoTestSkiped = mapOf(
        "Test1_Version1.5" to "Passed",
        "Test2_Version2.0" to "Skipped",
        "Test3_Version1.7" to "Failed",
        "Test4_Version2.0" to "Passed",
        "Test5_Version2.2" to "Skipped"
    )
    val caseSkipped = autoTestSkiped.filterNot { it.value == "Skipped" }
    println("Oтчет по автоматизированному тестированию : $caseSkipped")


//Удалите из словаря с конфигурациями тестирования набор устаревших конфигураций.

    val removiMap = mutableMapOf(
        "Test1_1.5" to "old",
        "Test2_2.0" to "old",
        "Test3_1.7" to "new",
        "Test4_2.1" to "new",
        "Test5_2.2" to "new"
    )
    val oldConfig = listOf("Test1_1.5", "Test2_2.0")

    oldConfig.forEach { removiMap.remove(it) }
    println(removiMap)

    //Создайте отчет о тестировании,
// преобразовав словарь с результатами тестирования (ключ — идентификатор теста, значение — результат)
// в список строк формата "Test ID: результат"

    val reportTest = mapOf(
        "Test1" to "Passed",
        "Test2" to "Skipped",
        "Test3" to "Failed",
        "Test4" to "Passed",
        "Test5" to "Skipped"

    )
    val reportID = reportTest.map { (test, result) -> "Test ID : $test ,  $result результат" }.joinToString("\n")
    println(reportID)


    //Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
    val mutableMapLastTest = mutableMapOf(
        "Test1" to "Passed",
        "Test2" to "Skipped",
        "Test3" to "Failed",
        "Test4" to "Passed",
        "Test5" to "Skipped"
    )
    val mapArchive = mutableMapLastTest.toMap()

    //Преобразуйте словарь, содержащий ID теста и данные о времени выполнения тестов, заменив идентификаторы тестов на их названия
    //(название можно получить вызвав фейковый метод, например getNameById(id: String))
val mutableMapId = mutableMapOf(
  "T1" to 10,
   "T2" to 20,
    "T3" to 30,
   "T4" to 40,
  "T5" to 50)

val changeID = mutableMapId.mapKeys{ getNameById(it.key) }
println(" Преобразование словаря : ")
changeID.forEach{(nameTest, time) ->
    println("$nameTest: $time")
}
    //Для словаря с оценками производительности различных версий приложения увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.

    val map10 = mapOf(
        "Test1" to 10,
        " Test2" to 20,
        "Test3" to 30
    )

    val plus10 = map10.mapValues { it.value * 1.1 }
    println(plus10)


    //Проверьте, пуст ли словарь с ошибками компиляции тестов.
    val mapErrorTesting = mapOf<String, Int>()
    when {
        mapErrorTesting.isEmpty() ->
            println("Словарь с ошибками пуст")

        else ->
            println("Словарь с ошибками не пуст")
    }

    val mapEmtuResult = mapOf(
        "Test1" to 10,
        " Test2" to 20,
        "Test3" to 30
    )
    when {
        mapErrorTesting.isNotEmpty() ->
            println("Словарь Не пуст")

        else ->
            println("Словарь пуст")
    }
//Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
    val autoTestResult = mapOf(
        "Test1" to true,
        " Test2" to false,
        "Test3" to true
    )

    when {
        autoTestResult.containsValue(false) ->
            println("Все тесты прошли не успешно ")

        else ->
            println("Все тесты прошли успешно")
    }


    //Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой
    val oneErrorMap = mapOf(
        "Modul1" to "Test",
        "Modul2" to "Fail",
        "Modul3" to "Test",
        "Modul4" to "Fail",
        "Modul5" to "Test",
        "Modul6" to "Fail")

    val errorCheck = oneErrorMap.any{it.value =="Fail"}
    println("В словаре есть ошибки : $errorCheck")


    //Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.
    val optionalMapFilter = mapOf(
        " QA optional" to false,
        "TestingManual" to true,
        "TestFirst" to true,
        "Test optional" to false
    )
    val filterMapA = optionalMapFilter.filterValues { it == false }
    optionalMapFilter.filterKeys {  it.contains("optional") }
println(filterMapA)

}
fun statusEndpoint (endpoint : String, apiTest: Map<String, String>): String{
    return apiTest[endpoint]?:"Endpoint $endpoint не был протестирован"
}
fun getNameById(id: String): String {
    return "Test $id"//Фейковая функция, возвращающая название теста
}












