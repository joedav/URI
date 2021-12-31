package Basic


fun main(args: Array<String>) {
    calculaAreas()
}

fun calculaAreas() {
    val valores: Valores? = lerValores()
    if (valores != null) {
        val (a: Double, b: Double, c: Double) = valores
        val areaTriangulo: Double = calculaAreaTriangulo(a, c)
        val areaCirculo: Double = calculaAreaCirculo(c)
        val areaTrapezio: Double = calculaAreaTrapezio(a, b, c)
        val areaQuadrado: Double = calculaAreaQuadrado(b)
        val areaRetangulo: Double = calculaAreaRetangulo(a, b)

        println("TRIANGULO: %.3f".format(areaTriangulo))
        println("CIRCULO: %.3f".format(areaCirculo))
        println("TRAPEZIO: %.3f".format(areaTrapezio))
        println("QUADRADO: %.3f".format(areaQuadrado))
        println("RETANGULO: %.3f".format(areaRetangulo))
    }
}

private fun calculaAreaTriangulo(base: Double, altura: Double): Double = (base * altura) / 2

private fun calculaAreaCirculo(raio: Double): Double {
    val PI: Double = 3.14159
    return (raio * raio) * PI
}

fun calculaAreaTrapezio(base1: Double, base2: Double, altura: Double): Double {
    return ((base1 + base2) * altura) / 2
}

fun calculaAreaQuadrado(lado: Double): Double {
    return lado * lado
}

fun calculaAreaRetangulo(base: Double, altura: Double): Double {
    return base * altura
}

private fun lerValores(): Valores? {
    val valores = readLine()?.split(" ")
    return if (valores?.size == 3) {
        val valorA = valores[0].toDouble()
        val valorB = valores[1].toDouble()
        val valorC = valores[2].toDouble()
        Valores(valorA, valorB, valorC)
    } else {
        null
    }
}

private fun readDouble() = readLine()?.toDoubleOrNull() ?: -1.0

private data class Valores(val valorA: Double, val valorB: Double, val valorC: Double)
