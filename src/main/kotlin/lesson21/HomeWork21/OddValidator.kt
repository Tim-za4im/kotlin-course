package lesson21.HomeWork21

import lesson21.HomeWork21.Validator.Validator

class OddValidator : Validator<Int> {
    override fun boolean(value: Int) = value % 2 == 0
}
