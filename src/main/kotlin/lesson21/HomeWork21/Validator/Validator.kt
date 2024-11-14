package lesson21.HomeWork21.Validator

interface Validator<Q> {
    fun boolean (value : Q) : Boolean
}