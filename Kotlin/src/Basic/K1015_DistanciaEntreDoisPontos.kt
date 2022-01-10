package Basic

fun main(args: Array<String>) {
    distanciaEntreDoisPontos()
}

fun distanciaEntreDoisPontos() {
    val ponto1 = lerPonto()
    val ponto2 = lerPonto()

    if (verificaPontos(ponto1, ponto2)) {
        val distancia: Double = calculaDistanciaEntreDoisPontos(ponto1, ponto2)
        println("%.4f".format(distancia))
    }
}

fun calculaDistanciaEntreDoisPontos(ponto1: Ponto, ponto2: Ponto): Double {
    return Math.sqrt(Math.pow(ponto2.x!! - ponto1.x!!, 2.0) + Math.pow(ponto2.y!! - ponto1.y!!, 2.0))
}

fun lerPonto(): Ponto {
    val linhaPonto = readLine()?.split(" ")
    val x: Double? = linhaPonto?.get(0)?.toDoubleOrNull()
    val y: Double? = linhaPonto?.get(1)?.toDoubleOrNull()
    return Ponto(x, y)
}

fun verificaPontos(ponto1: Ponto, ponto2: Ponto): Boolean {
    val valoresPontosValidos =
        verificaValorPonto(ponto1.x) &&
                verificaValorPonto(ponto1.y) &&
                verificaValorPonto(ponto2.x) &&
                verificaValorPonto(ponto2.y)
    return valoresPontosValidos
}

fun verificaValorPonto(x: Double?): Boolean = x != null


class Ponto(val x: Double?, val y: Double?)