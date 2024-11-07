package lesson19


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











fun main() {



}

