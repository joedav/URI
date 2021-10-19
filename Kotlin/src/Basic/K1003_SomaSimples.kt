package Basic

fun main(args: Array<String>) {
    var value1 = readLine()?.toIntOrNull()
    var value2 = readLine()?.toIntOrNull()

    if (value1 == null || value2 == null) return

    val result = simpleSum(value1,value2)

    println("SOMA = $result")
}

fun simpleSum(number1: Int, number2: Int) = number1 + number2