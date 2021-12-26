package Basic

import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {
    val raio = readLine()?.toDouble() ?: -1.0
    if (raio > -1) {
        val valorEsfera = calculaEsfera(raio)
        println("VOLUME = ${"%.3f".format(valorEsfera)}")
    }
}

fun calculaEsfera(raio: Double): Double {
    val PI = 3.14159
    return (4.0 / 3.0) * PI * (raio.pow(3.0))
}