package lesson29.homeWork29

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal


fun temporalTask4(temporal: Temporal) {
    when (temporal) {
        is LocalDate -> println("${temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))}")
        is LocalDateTime -> println("${temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))}")
        is ZonedDateTime -> println("${temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS ZZZ"))}")
        is OffsetDateTime -> println("${temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS ZZZ"))}")
        else -> println("Неправильный тип")
    }
}

fun temporalTask4Iso(temporal1: Temporal) {
    when (temporal1) {
        is LocalDate -> println("${temporal1.format(DateTimeFormatter.ISO_DATE)}")
        is LocalDateTime -> println("${temporal1.format(DateTimeFormatter.ISO_DATE_TIME)}")
        is ZonedDateTime -> println("${temporal1.format(DateTimeFormatter.ISO_ZONED_DATE_TIME)}")
        is OffsetDateTime -> println("${temporal1.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)}")
        else -> println("Неправильный тип")
    }
}

private val boomerDate = LocalDate.of(1945, 12, 31)
private val boomerDateEnd = LocalDate.of(1965, 1, 1)
private val zoomerDate = LocalDate.of(1996, 12, 31)
private val zoomerDateEnd = LocalDate.of(2013, 1, 1)

fun identifyGeneration(date: LocalDate):String {
   return when {
        date.isAfter(boomerDate) && date.isBefore(boomerDateEnd) -> "Бумер"
        date.isAfter(zoomerDate) && date.isBefore(zoomerDateEnd) -> "Зумер"
        else -> "Не определено"
    }.also { println(it) }
}

fun main() {
    val currenTimeA1 = Instant.now()
    val currentDateTimeA1 = LocalDate.now()
    println(currenTimeA1)
    println(currentDateTimeA1)
    val birthDay = LocalDate.of(1990, 6, 11)
    val periodAge = Period.between(birthDay, currentDateTimeA1).years
    println("$periodAge")

    println("\n")
    val LicalDate = LocalDate.of(2001, 9, 11)
    val alarmClock2 = LocalDateTime.of(2024, 4, 1, 9, 0, 0)
    val mobileWorldCongress2 = ZonedDateTime.of(2024, 2, 26, 10, 0, 0, 0, ZoneId.of("Europe/Madrid"))
    val birthDayInDubai2 = OffsetDateTime.of(birthDay.atTime(19, 0), ZoneOffset.of("+09:00"))
    temporalTask4(LicalDate)
    temporalTask4(alarmClock2)
    temporalTask4(mobileWorldCongress2)
    temporalTask4(birthDayInDubai2)
    println("\n")
    temporalTask4Iso(LicalDate)
    temporalTask4Iso(alarmClock2)
    temporalTask4Iso(mobileWorldCongress2)
    temporalTask4Iso(birthDayInDubai2)

    println("\n")

    val dateBorn = listOf(
        LocalDate.of(1970, 10, 11),
        LocalDate.of(1950, 1, 1),
        LocalDate.of(1947, 6, 15),
        LocalDate.of(1964, 2, 24),
        LocalDate.of(1997, 1, 1),
        LocalDate.of(2000, 6, 15),
        LocalDate.of(2005, 12, 29)
    )
    dateBorn.forEach { Test ->
        println("Дата $Test = поколение ${identifyGeneration(Test)}")
    }
    println("\n")


    val dataA7 = LocalDate.of(2023, 2, 25)
    val dataB7 = LocalDate.of(2024, 2, 25)
    val formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd")
    println(dataB7.plusDays(10).format(formatter3))
    println(dataA7.plusDays(10).format(formatter3))

}

