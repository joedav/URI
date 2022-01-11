package Basic

fun main(args: Array<String>) {
    distancia()
}

fun distancia() {
    val distanciaEmKm: Int? = readLine()?.toIntOrNull()
    val distanciaValida: Boolean = distanciaEmKm != null && distanciaEmKm > 0
    if (distanciaValida) {
        val minutos = distanciaEmKm!! * 2
        println("$minutos minutos")
    }
}