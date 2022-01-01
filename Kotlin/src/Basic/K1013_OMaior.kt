package Basic

import kotlin.math.abs

fun main(args: Array<String>) {
    val maiorDe3Numeros = oMaiorDe3Numeros()
    println("$maiorDe3Numeros eh o maior")
}

fun oMaiorDe3Numeros(): Int {
    val valores = readLine()?.split(" ")
    return if (valores != null && valores.size == 3) {
        val a: Int = valores[0].toInt()
        val b: Int = valores[1].toInt()
        val c: Int = valores[2].toInt()

        var maior = (a + b + abs(a - b)) / 2
        maior = ((maior + c) + abs(maior - c)) / 2

        maior
    } else Int.MIN_VALUE
}