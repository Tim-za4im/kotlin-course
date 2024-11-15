package lesson22


fun String.removeSpaces(): String {
    return replace(" ", "")
}
fun <T> List<T?>.isElementsNullOrEmpty(): Boolean {
    return this.all { it == null } || this.isEmpty()
}