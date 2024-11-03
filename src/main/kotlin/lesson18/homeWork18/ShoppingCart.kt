package lesson18.homeWork18

class ShoppingCart {
    val item : MutableMap<Int, Int> = mutableMapOf()

    fun addInCart(itemId :Int) {
        item[itemId] = (item[itemId] ?: 0) + 1

    }
    fun  addInCart (itemId: Int, amount : Int){
        item[itemId] = (item[itemId] ?: 0 ) + amount
    }
    fun addInCart (itemMap: Map<Int, Int>){
        for ((itemId, amount )in itemMap){
            addInCart(itemId, amount)
    }
    }
    fun  addInCart (itemId2: List<Int>){
        for (itenId in itemId2){
            addInCart(itenId)
        }
    }
    fun totalsum () : Int{
        return item.values.sum()
    }

    override fun toString(): String {
        var cartConten = " Корзина товаров:"
        for ((id , value ) in  item){
            cartConten +=" номер товара $id, общее колличество :$value"
        }
        cartConten+="итоговое количество артикулов ${item.size}"
        cartConten+=" Общее колличество ${totalsum()}"

        return cartConten
    }

}



/*Задания для отработки перегрузки методов
Класс “Корзина товаров”: содержит поле словаря из ID товаров и их количества.
Базовый метод addToCart(itemId) добавляет одну единицу товара к уже существующим в корзине.
Выполнить перегрузку addToCart который:
Принимает два аргумента (itemId и количество amount)
Принимает словарь из id и количества и добавляет всё в корзину
Принимает список из id (добавляет по одной единице).
Учесть, что если товар уже есть в корзине, нужно увеличить его количество, если нет - добавить.
Попробуй создать корзину и положить в неё товар разными способами, потом распечатать корзину в консоль.
Переопредели у корзины метод toString для красивого форматирования содержимого таблицы,
включая итоговое количество артикулов и общее количество всего товара в корзине.
*/

