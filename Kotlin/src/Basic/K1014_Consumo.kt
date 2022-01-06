package Basic

/**
 * Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).

 * Entrada
 * O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km),
 * e um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.

 * Saída
 * Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l".
 */

fun main(args: Array<String>) {
    consumo()
}

fun consumo() {
    val distanciaKm: Int? = readLine()?.toIntOrNull()
    val combustivelGasto: Double? = readLine()?.toDoubleOrNull()

    if (distanciaKm != null && combustivelGasto != null) {
        val consumoTotal: Double = calculaConsumo(distanciaKm, combustivelGasto)
        println("%.3f km/l".format(consumoTotal))
    }
}

fun calculaConsumo(distancia: Int, combustivelGasto: Double): Double {
    return (distancia / combustivelGasto)
}