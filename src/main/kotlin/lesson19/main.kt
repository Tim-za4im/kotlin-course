package lesson19

import lesson19.homeWork.Why.BaseClass


class Account ( private  var balance : Double){


    fun deposit (amount : Double){

        if (amount >0){
            balance+=amount
        }
    }
    fun getBalamce ( ): Double{
        return  balance
    }

}


//"измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
//"Доработай ChildrenClass таким образом, чтобы это получилось"









