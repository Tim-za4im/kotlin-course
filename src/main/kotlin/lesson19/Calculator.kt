package lesson19

class Calculator(customOperations: List<Operations>) {

    private val operations = customOperations + listOf(
        SumOperations(),
        MultiplicationOperations(),
        DiffOperations(),
        DivOperations(),
        DivReminderOperations()
    )

    fun operate(expression: String): String {
        return getExecutor(expression).operate(expression)
    }

    private fun getExecutor(expression: String): Operations {
        return operations.find { it.checkOperator(expression) } ?: throw
        Exception("Не найден исполнитель")
    }
}

private class SumOperations : Operations("+") {

    override fun operate(expression: String): String {
        return splitOperandsToDouble(expression).sum().toString()
    }
}

private class MultiplicationOperations : Operations("*") {

    override fun operate(expression: String): String {
        val operands = splitOperandsToDouble(expression)
        val result = operands[0] * operands[1]
        return result.toString()
    }
}

private class DiffOperations : Operations("-") {

    override fun operate(expression: String): String {
        val operands = splitOperandsToDouble(expression)
        val result = operands[0] - operands[1]
        return result.toString()
    }
}

private class DivOperations : Operations("/") {

    override fun operate(expression: String): String {
        val operands = splitOperandsToDouble(expression)
        if (operands[1] == 0.0) throw IllegalArgumentException("Нельзя делить на ноль")
        val result = operands[0] / operands[1]
        return result.toString()
    }
}

private class DivReminderOperations : Operations("%") {

    override fun operate(expression: String): String {
        val operands = splitOperandsToDouble(expression)
        val result = operands[0] % operands[1]
        return result.toString()
    }
}
