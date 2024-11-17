package lesson22.HomeWork.extensions

fun <M,N>Pair<M?, N?>.revert(): Pair<N?,M?>{
    return Pair(second, first)
}