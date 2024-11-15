package lesson21.HomeWork21

interface Mapper<T,R>
{
    fun map (change :T):R

    fun map2TinR (changes: List<T>):List<R>
}


//Создай класс PhrasesToListOfStrings и имплементируй интефрейс Mapper с типами String и List<String>.
//Метод преобразования должен разбивать входящую строку по символу пробела и возвращать список из полученных слов.
//Добавь к интерфейсу Mapper ещё один метод, который будет преобразовывать список элементов типа T в список элементов типа R.
//Реализуй этот метод в классе PhrasesToListOfStrings с аналогичной механикой.