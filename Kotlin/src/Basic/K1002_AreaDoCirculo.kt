package Basic

fun main(args: Array<String>) {
    var raio: Double?
    raio = readLine()?.toDoubleOrNull()
    if (raio != null) {
        var area = areaCirculo(raio)

        println("A=${"%.4f".format(area)}")
    }
}

fun areaCirculo(raio: Double): Double {
    var areaCirculo = (raio * raio) * 3.14159

    return areaCirculo
}