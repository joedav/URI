package Basic

fun main(args: Array<String>) {
    val value1 = readLine()?.toDoubleOrNull() ?: -1.0
    val value2 = readLine()?.toDoubleOrNull() ?: -1.0

    if (value1 in 0.0..10.0 && value2 in 0.0..10.0) {
        val result = media1(value1, value2)


        println("MEDIA = ${result}")
    }
}

fun media1(number1: Double, number2: Double): String {
    val result = (((number1 * 3.5) + (number2 * 7.5))) / 11

    return String.format("%.5f", result)
}