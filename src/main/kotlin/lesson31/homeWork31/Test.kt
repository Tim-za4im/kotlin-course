package lesson31.homeWork31
//Создай реализацию представленного ниже интерфейса с пустыми методами.
// Создай тестовый класс для твоей реализации. Для каждого метода напиши набор юнит тестов,
// которые будут покрывать те требования к методу, что перечислены в документации к методу интерфейса.
// После написания тестов к методу напиши его реализацию и выполни тесты.
// Если тесты найдут ошибку - исправь. В этом упражнении старайся придерживаться подхода Test Driven Development - сначала тесты, потом реализация.
//Обратите внимание при сравнении двух дробных float значений:
// рассчётное значение может быть 1.10038 вместо 1.1 - это особенность расчёта значений с плавающей точкой.
// Чтобы такие значения сравнить нужно использовать проверку на равенство с дельтой,
// которая передаётся третьим аргументом в assertEquals, достаточно значения 0.01

//interface Testinterface CerealStorage {
//  val containerCapacity: Float
////    /*
//     // Объём одного контейнера
//     // @throws IllegalArgumentException если значение отрицательное при инициализации
//
//
//
//    /*
//     * Совокупный объём хранилища
//     * @throws IllegalArgumentException если значение меньше, чем [containerCapacity] при инициализации
//     */
//    val storageCapacity: Float
//
//    /*
//     * @param cereal крупа для добавления в контейнер
//     * @param amount количество добавляемой крупы
//     * @return количество оставшейся крупы если контейнер заполнился
//     * @throws IllegalArgumentException если передано отрицательное значение
//     * @throws IllegalStateException если хранилище не позволяет разместить ещё один контейнер для новой крупы
//     */
//    fun addCereal(cereal: Cereal, amount: Float): Float
//
//    /*
//     * @param cereal крупа, которую нужно взять из контейнера
//     * @param amount количество крупы
//     * @return количество полученной крупы или остаток, если было меньше
//     * @throws IllegalArgumentException если передано отрицательное значение
//     */
//    fun getCereal(cereal: Cereal, amount: Float): Float
//
//    /*
//     * @param cereal уничтожает пустой контейнер
//     * @return true если контейнер уничтожен и false если контейнер не пуст
//     */
//    fun removeContainer(cereal: Cereal): Boolean
//
//    /*
//     * @param cereal крупа, количество которой нужно узнать
//     * @return количество крупы, которое хранится в контейнере
//     */
//    fun getAmount(cereal: Cereal): Float
//
//    /*
//     * @param cereal крупа, для которой нужно проверить доступное место в контейнере
//     * @return количество крупы, которое может вместить контейнер с учётом его текущей заполненности
//     */
//    fun getSpace(cereal: Cereal): Float
//
//    /*
//     * @return текстовое представление
//   //  */override fun toString(): String
//}

enum class Cereal(val local: String) {
    BUCKWHEAT("Гречка"),
    RICE("Рис"),
    MILLET("Пшено"),
    PEAS("Горох"),
    BULGUR("Булгур")
}

class CerealStorageImpl(
    override val containerCapacity: Float,
    override val storageCapacity: Float
) : CerealStorage {

    init {
        require(containerCapacity >= 0) { "Объём контейнера не может быть отрицательным" }
        require(storageCapacity >= containerCapacity) { "Совокупный объём хранилища не может быть меньше объёма одного контейнера" }
    }

    private val containers = mutableMapOf<Cereal, Float>()

    override fun addCereal(cereal: Cereal, amount: Float): Float {
        require(amount >= 0) { "Количество добавляемой крупы не может быть отрицательным" }

        var remaining = amount
        if (containers.containsKey(cereal)) {
            val currentAmount = containers[cereal]!!
            val availableSpace = containerCapacity - currentAmount
            if (remaining <= availableSpace) {
                containers[cereal] = currentAmount + remaining
                remaining = 0f
            } else {
                containers[cereal] = containerCapacity
                remaining -= availableSpace
            }
        } else {
            if (containers.size * containerCapacity + amount > storageCapacity) {
                throw IllegalStateException("Недостаточно места в хранилище для нового контейнера")
            }
            if (amount <= containerCapacity) {
                containers[cereal] = amount
                remaining = 0f
            } else {
                containers[cereal] = containerCapacity
                remaining -= containerCapacity
            }
        }
        return remaining
    }

    override fun getCereal(cereal: Cereal, amount: Float): Float {
        require(amount >= 0) { "Количество запрашиваемой крупы не может быть отрицательным" }

        if (!containers.containsKey(cereal)) {
            return 0f
        }

        val currentAmount = containers[cereal]!!
        if (currentAmount >= amount) {
            containers[cereal] = currentAmount - amount
            return amount
        } else {
            val actualAmount = currentAmount
            containers.remove(cereal)
            return actualAmount
        }
    }

    override fun removeContainer(cereal: Cereal): Boolean {
        if (containers.containsKey(cereal) && containers[cereal] == 0f) {
            containers.remove(cereal)
            return true
        }
        return false
    }

    override fun getAmount(cereal: Cereal): Float {
        return containers.getOrDefault(cereal, 0f)
    }

    override fun getSpace(cereal: Cereal): Float {
        if (containers.containsKey(cereal)) {
            val currentAmount = containers[cereal]!!
            return containerCapacity - currentAmount
        }
        return containerCapacity
    }

    override fun toString(): String {
        return containers.entries.joinToString(", ") { (cereal, amout) ->
            "${cereal.local}  $amout/$containerCapacity"
        }
    }
}

fun main() {
    val cerealStorage = CerealStorageImpl(10f, 50f)
    // Добавляем крупу в хранилище
    cerealStorage.addCereal(Cereal.BUCKWHEAT, 8f)
    cerealStorage.addCereal(Cereal.RICE, 5f)
    cerealStorage.addCereal(Cereal.PEAS, 10f)


    println("Состояние хранилища: $cerealStorage")
    println("\n")
    // Забираем немного крупы
    cerealStorage.getCereal(Cereal.BUCKWHEAT, 3f)
    println("После изъятия гречки: $cerealStorage")
    println("\n")
    // Пробуем удалить пустой контейнер
    cerealStorage.getCereal(Cereal.RICE, 5f) // Освобождаем контейнер
    val removed = cerealStorage.removeContainer(Cereal.RICE)
    println("Контейнер с рисом удалён: $removed")
    println("После удаления контейнера: $cerealStorage")
}

//Пример имплементации интерфейса с блоком инициализации класса

//class CerealStorageImpl(
//    override val containerCapacity: Float,
//    override val storageCapacity: Float
//) : CerealStorage {
//
//
//    // Блок инициализации класса. Выполняется сразу при создании объекта
//    init {
//        require(containerCapacity >= 0) {
//            "Ёмкость контейнера не может быть отрицательной"
//        }
//        require(storageCapacity >= containerCapacity) {
//            "Ёмкость хранилища не должна быть меньше ёмкости одного контейнера"
//        }
//    }
//
//    private val storage = mutableMapOf<Cereal, Float>()
//
//    // дальше будет переопределением методов интерфейса
//}
//
//{
//}