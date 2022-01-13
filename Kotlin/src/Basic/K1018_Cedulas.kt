package Basic

fun main(args: Array<String>) {
    cedulas()
}

fun cedulas() {
    val valor: Int? = readLine()?.toIntOrNull()
    if (valor == null || valor < 0 || valor > 1000000) return
    val cedulas: Array<Double?> = arrayOf(100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0)

    val notas: List<Pair<Int, Double>> = calculaNotas(valorInformado = valor, cedulasDisponiveis = cedulas)
    if (notas.isEmpty()) return

    println(valor)
    notas.forEach { cedula ->
        println("${cedula.first} nota(s) de R$ %.2f".format(cedula.second))
    }
}

fun calculaNotas(valorInformado: Int, cedulasDisponiveis: Array<Double?>): List<Pair<Int, Double>> {
    val valoresCedulas: MutableList<Pair<Int, Double>> = mutableListOf()
    var valorRestante = valorInformado.toDouble()
    for (valorCedula in cedulasDisponiveis) {
        val qtdCedulas = (valorRestante / valorCedula!!).toInt()
        val valor = valorCedula
        if (valorRestante % valorCedula >= 0) {
            valorRestante %= valorCedula
        }
        valoresCedulas.add(qtdCedulas to valor)
    }
    return valoresCedulas
}
