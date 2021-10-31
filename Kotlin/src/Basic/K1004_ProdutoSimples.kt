package Basic

fun main(args: Array<String>) {
    val number1 = readLine()?.toIntOrNull()
    val number2 = readLine()?.toIntOrNull()

    if (number1 == null || number2 == null) return

    val result = simpleProduct(number1,number2)

    println("PROD = $result")
}

private fun simpleProduct(number1: Int, number2: Int): Int = number1 * number2