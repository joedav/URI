package Basic

fun main() {
    idadeEmDias()
}

fun idadeEmDias() {
    val idadeEmDias = readLine()?.toIntOrNull() ?: return

    val qtdAnos = calculaAnos(idadeEmDias)
    val qtdMeses = calculaMeses(idadeEmDias)
    val qtdDias = calculaDias(idadeEmDias)

    println("$qtdAnos ano(s)")
    println("$qtdMeses mes(es)")
    println("$qtdDias dia(s)")
}

fun calculaAnos(idadaEmDias: Int): Int = idadaEmDias / 365

fun calculaMeses(idadaEmDias: Int): Int {
    val diasRestantesDeAnos = idadaEmDias % 365
    return diasRestantesDeAnos / 30
}

fun calculaDias(idadaEmDias: Int): Int {
    return (idadaEmDias % 365) % 30
}
