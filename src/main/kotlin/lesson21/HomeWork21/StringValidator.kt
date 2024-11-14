package lesson21.HomeWork21

import lesson21.HomeWork21.Validator.Validator

class StringValidator : Validator<String?> {
    override fun boolean(value: String?): Boolean {
        return value != null && value.isNotEmpty()&&value.replace(" ", "").isNotEmpty()
    }

}