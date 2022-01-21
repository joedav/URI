package Basic

/*
* Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual
* o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1.
* A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
* Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido.
* Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
* */

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
