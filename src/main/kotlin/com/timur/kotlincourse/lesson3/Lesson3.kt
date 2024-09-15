package com.timur.kotlincourse.lesson3

import com.sun.jdi.Value




val HackatonName: String = "Hackathon Survival" //Название мероприятия
var dateHackatonName:  String = "10 октября 2024"//Дата проведения
var placeHackatonName: String = "Стадион Зенит"//Место проведения
private const val detailetBudget: Int =100000 //Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
var numbersMembers: Int =10 //Количество участников
var durationHackaton: Long =3*60*60 //Длительность хакатона
private  val informationSuppliers: String = "Список контактов и соглашения поставщиков"//Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
val statusHackaton: String = "Начался" //Текущее состояние хакатона (статус)
val listSponsors : String ="Газпром,Лукойл,Роснефит"//Список спонсоров
val budget: Int = 1000 //Бюджет мероприятия
var signalInterneLevel : String ="0,1,2,3,4" //Текущий уровень доступа к интернету
private var informationEquipment : String = ""//Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
val nubersTeam: Int=5//Количество команд
var listTasks: String= ""//Перечень задач
const val evacuationPlan : String = ""//План эвакуации
val listAvailableEquipment : String= ""//Список доступного оборудования
var listFree : String= ""//Список свободного оборудования
lateinit var scheduleParticipants: String//График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
const val PLANFILS : String= ""//План мероприятий на случай сбоев
var listExpertsJury : String= ""//Список экспертов и жюри
private val privacyPolicy : String= ""//Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.
 const val POLITICCONFIDENTIALITY : String= "" //Политика конфиденциальности
private var privateFidbacl : String= "" //Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
var roomTemperature : Int=23 //Текущая температура в помещении
val reportInterneConection : String by lazy {""} //Мониторинг и анализ производительности сетевого оборудования и интернет-соединения.
var lightingLevel : String= "" //Уровень освещения
var eventLog : String= "" //Лог событий мероприятия
val accessMedicalCare : String= "" //Доступность медицинской помощи
const val INCLUDINGEVUCATIONPLANS : String= "" //Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций
var registretionNumbersEvent :String= "" //Регистрационный номер мероприятия
val maxSoundLevel : Int=95//Максимально допустимый уровень шума в помещении хакатона.
var soundCheckLevel : Int=0 //Индикатор превышения уровня шума в помещениях
 get() = field
 set(value) {
         if (value> maxSoundLevel)field+=value
 }
var formatEvent : String=""  //Формат мероприятия (зависит от геополитической обстановки)
var freePlaceRelax: Int=5 //Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля.
 get() = field
 set(value) {
  if (value>0) field += value
 }
val planCommunicationPress : String = "" //План взаимодействия с прессой
 private var detailInfoProectTeams : String= "" //Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.
 lateinit var listAllowed : String //Статус получения всех необходимых разрешений
 val accessResources : String by lazy { "" +
         "" } //Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)
val listPartner : String="" //Список партнеров мероприятия

val reportMedia : String by lazy { "" +
        "" } //Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
var prizeSystem : Int =0 //План распределения призов
 get() = field
 set(value) {
              if ( value<=1 )
               field+=value
                else field =2
                  if (value>=3) field+=value

 }
private const val contactEmergencyServices : String = ""//Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.
var specialConditions : Int=0 //Особые условия для участников с ограниченными возможностями
 get()=field
 set(value) {
  if (value >=10) field+=50
 }
lateinit var moodParticipants : String //Общее настроение участников (определяется опросами)
val planHacatonDetailed :String by lazy { "" } //Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия.
lateinit var nameSpecialGuest : String //Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.
val maxMembers :Int=150 //Максимальное количество людей, которое может вместить место проведения.
val standartTimeWorkTeam : Long = 0 //Стандартное количество часов, отведенное каждой команде для работы над проектом.
var roomTemperatur : Int=23 //Текущая температура в помещении




















