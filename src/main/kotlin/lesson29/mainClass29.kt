package lesson29

import java.time.*
import java.time.format.DateTimeFormatter

fun main() {

    val instant = Instant.now()
    println(instant.toEpochMilli())


    val dateTimeNow = LocalDate.now()

    val birthday = LocalDate.of(1983, 10, 2)

    println(dateTimeNow)
    println(birthday)


    val localTimeNow = LocalTime.now()

    val endOfTheMyWorkingDay = LocalTime.of(18, 0, 0)


    val localDateTime = LocalDateTime.now()

    val alarmClock = LocalDateTime.of(2024, 4, 1, 9, 0, 0)


    val vaticanCurrentTime = ZonedDateTime.now(ZoneId.of("Europe/Vatican"))

    val mobileWorldCongress = ZonedDateTime.of(2024, 2, 26, 10, 0, 0, 0, ZoneId.of("Europe/Madrid"))


    val birthDayInDubai = OffsetDateTime.of(birthday.atTime(19, 0), ZoneOffset.of("+09:00"))

    val vaticanCurrentTimeInstant = vaticanCurrentTime.toInstant()

    val birthdayInstant = birthday.atTime(19, 0).toInstant(ZoneOffset.of("+09:00"))

    val instantToZonedDateTime = instant.atZone(ZoneId.systemDefault())

    val instantToOffsetDateTime = instant.atOffset(ZoneOffset.of("-02:00"))

    LocalDate.now().plusYears(1)

    LocalDateTime.now().plusSeconds(1)

    LocalDate.now().minusYears(1)

    Period.between(birthday, LocalDate.now())

    Duration.between(alarmClock, LocalDateTime.now())

    alarmClock.isAfter(localDateTime)

    alarmClock.isBefore(localDateTime)

    alarmClock.isEqual(localDateTime)


    val nanoSeconds = Duration.ofNanos(200)

    println(nanoSeconds.dividedBy(4).toNanos())

    println(nanoSeconds.plus(Duration.ofSeconds(2)).toNanos())

    val seconds = Duration.ofSeconds(45)

    println(seconds.minusMinutes(1).seconds)

    val period = Period.of(2, 4, 10)

    println(period.minusMonths(13).toTotalMonths())

    val periodFromConferenceToBirthday = Period.between(mobileWorldCongress.toLocalDate(), birthday)

    println("${periodFromConferenceToBirthday.years} лет ${periodFromConferenceToBirthday.months} месяцев ${periodFromConferenceToBirthday.days} дней")

    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS ZZZ")

    val formattedDate = vaticanCurrentTime.format(formatter)

    println("Текущая дата и время с миллисекундами и часовым поясом: $formattedDate")

    val isoFormatter = DateTimeFormatter.ISO_DATE_TIME

//    val isoFormattedDate = birthdayInDubai.format(isoFormatter)
//
//    println(isoFormattedDate)

    val prettyFormatter = DateTimeFormatter.ofPattern("'год' yyyy', месяц' MM', день' dd")

    val prettyFormattedDate = dateTimeNow.format(prettyFormatter)

    println(prettyFormattedDate)



    try {

        println(
            "При форматировании с часовым поясом помни, что в LocalDateTime его нет и будет ошибка ${
                localDateTime.format(
                    formatter
                )
            }"
        )

    } catch (e: Throwable) {

        e.printStackTrace()

    }

    try {

        println("При форматировании LocalDate помни, что нет полей времени и будет ошибка ${birthday.format(formatter)}")

    } catch (e: Throwable) {

        e.printStackTrace()

    }

    val parsedDate = LocalDate.parse(prettyFormattedDate, prettyFormatter)

    println(parsedDate)


    val currentTime = Instant.now()
    val myTime = Instant.ofEpochSecond(121212121)
    println(myTime)
    val dayKnow = LocalDate.of(2024, 9, 1)
    val dayTwo = LocalDate.of(2025, 5, 31)
    val betweeens = Period.between(dayKnow, dayTwo)
    val day3 = Period.of(2, 4, 3)
    println(dayTwo.plus(day3))
    val calendar = ZonedDateTime.of(2024, 12, 16, 10, 0, 0, 0, ZoneId.of("Europe/Moscow"))
    println(calendar)
    println(day3.multipliedBy(2))



    /*fun formatAnyDate(temporal: Temporal) {
        when (temporal) {
            is LocalDate -> temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
            is LocalTime -> temporal.format(DateTimeFormatter.ofPattern("HH:mm:ss"))
            is LocalDateTime -> temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
            is ZonedDateTime -> temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ZZZ"))
            is OffsetDateTime -> temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ZZZ"))
            else -> temporal.toString()
        }.also { println(it) }
    }

    fun formatAnyDateByIso(temporal: Temporal) {
        when (temporal) {
            is LocalDate -> temporal.format(DateTimeFormatter.ISO_LOCAL_DATE)
            is LocalTime -> temporal.format(DateTimeFormatter.ISO_DATE_TIME)
            is LocalDateTime -> temporal.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
            is ZonedDateTime -> temporal.format(DateTimeFormatter.ISO_ZONED_DATE_TIME)
            is OffsetDateTime -> temporal.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
            else -> temporal.toString()
        }.also { println(it) }
    }


    6.

    private val boomerFromDate = LocalDate.of(1945, 12, 31)
    private val boomerEndDate = LocalDate.of(1965, 1, 1)
    private val zoomerStartDate = LocalDate.of(1996, 12, 31)
    private val zoomerEndDate = LocalDate.of(2013, 1, 1)

    fun identifyGeneration(date: LocalDate) {
        when {
            date.isAfter(boomerFromDate) && date.isBefore(boomerEndDate) -> "Бумер"
            date.isAfter(zoomerStartDate) && date.isBefore(zoomerEndDate) -> "Зумер"
            else -> "Не определено"
        }.also { println(it) }
    }

    */
}