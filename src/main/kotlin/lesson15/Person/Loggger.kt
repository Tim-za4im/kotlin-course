package lesson15.Person

import javax.annotation.processing.Messager

object Loggger {

    private  var data =0
fun loggger ( messager2: String) {
    println( "Loggger : $messager2 $data")
}
fun setData(data: Int){
            this.data=data
}

}