package lesson31.homeWork31

interface CerealStorage {

    val containerCapacity: Float
    val storageCapacity: Float

    fun addCereal(cereal: Cereal, amount: Float): Float
    fun getCereal(cereal: Cereal, amount: Float): Float
    fun removeContainer(cereal: Cereal): Boolean
    fun getAmount(cereal: Cereal): Float
    fun getSpace(cereal: Cereal): Float
    override fun toString(): String
}

