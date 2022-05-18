class Calculator {

    fun parse(expression: String): Int {
        val (a, operator, b) = expression.split(" ").also { validateExpression(it) }
        return when (operator) {
            "*" -> a.toInt() * b.toInt()
            "/" -> a.toInt() / b.toInt()
            "+" -> a.toInt() + b.toInt()
            "-" -> a.toInt() - b.toInt()
            else -> throw IllegalArgumentException("Invalid operator")
        }
    }

    private fun validateExpression(expression: List<String>): List<String> {
        if (expression.size == EXPRESSION_SIZE) {
            return expression
        }
        throw IllegalArgumentException("Invalid expression")
    }

    companion object {
        const val EXPRESSION_SIZE = 3
    }
}