package lesson17

import kotlin.Pair

abstract class Materials {

    private val materials = mutableListOf<String>()

    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterial(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}



open class BottonContainer () : Materials(){
    fun addBoottonEnd (material: String){
    val lastMaterials = extractMaterial().toMutableList()
    addMaterial(material)
        lastMaterials.forEach { addMaterial(it) }
    }
}
open class beginningContainer : Materials (){
    fun beginList (newMaterials: List<String>){
        val presentMaterials =extractMaterial()
                val maxSize = maxOf(newMaterials.size, presentMaterials.size)

for (i in 0 until maxSize){
    if (i <newMaterials.size ){
        addMaterial(newMaterials[i])
        if (i<presentMaterials.size){
            addMaterial(presentMaterials[i])
        }
    }
}


    }
}

open class Alphabetical : Materials(){
    fun typeAlphabetical(material: String){
        val lastMaterials = extractMaterial().toMutableList()
        lastMaterials.add(material)
        lastMaterials.sort()
        lastMaterials.forEach { addMaterial(it) }

    }
}

open class Pair:Materials(){
    fun pairKeyValu (pair: Map<String, String>) {
        val presentMaterials = extractMaterial().toMutableList()
        pair.forEach { (key, value) ->
            presentMaterials.add(0, key)
            }
            presentMaterials.forEach { addMaterial(it) }
    pair.forEach { ( value) ->
        addMaterial(value)
    }
}
}




//pair.keys.forEach { addMaterial(it) }
//presentMaterials.forEach { addMaterial(it) }
//pair.values.forEach { addMaterial(it) }


//Это класс контейнера. Он абстрактный, это означает, что нельзя создавать экземлпяр этого класса, он нужен только для того, чтобы быть основой для подклассов.
//
//Создай подклассы этого контейнера, которые будут добавлять строку material в какое-то определённое место.
//Первый класс должен вставлять строку на дно контейнера (должно появиться под индексом 0)
//Второй класс должен получать список строк и вставлять их в начало контейнера но поочерёдно с теми данными, которые уже есть.
// То-есть, наш список должен появиться в контейнере по индексам 0, 2, 4 и так далее.
//Третий класс должен добавлять элементы в список в алфавитном порядке. Если мы добавляем новый элемент в список,
// то он должен встать где-то между другими элементами и занять место в соответствии с сортировкой по алфавиту.
//Четвёртый класс должен принимать словарь из строк (ключи и значения).
// Каждая пара ключа и значения должна попадать в контейнер следующим образом - ключ в начало, значение в конец.