package Basic

fun main(args: Array<String>) {
    val numberA = readLine()?.toDoubleOrNull() ?: -1.0
    val numberB = readLine()?.toDoubleOrNull() ?: -1.0
    val numberC = readLine()?.toDoubleOrNull() ?: -1.0

    if (!isValidNumbers (numberA, numberB, numberC)) return

    val media = media2(numberA, numberB, numberC)

    println("MEDIA = ${"%.1f".format(media)}")
}

private fun media2(number1: Double, number2: Double, number3: Double): Double {
    val value1 = weightCalculate(number1, 2.0)
    val value2 = weightCalculate(number2, 3.0)
    val value3 = weightCalculate(number3, 5.0)
    return (value1 + value2 + value3) / 10
}

private fun weightCalculate(value: Double, weight: Double): Double {
    return value * weight
}

private fun isValidNumbers(number1: Double, number2: Double, number3: Double): Boolean {
    return isValidNumber(number1) && isValidNumber(number2) && isValidNumber(number3)
}

private fun isValidNumber(number: Double): Boolean {
    return ((number > 0) && (number < 100))
}