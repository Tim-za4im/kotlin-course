package lesson22.HomeWork.extensions

fun <A, B> Map<A, List<B>?>.countElements() : Map<String,Int?>{
    return this.map { (key,values) ->key.toString()to values?.size}.toMap()
}






