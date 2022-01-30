package Basic

/**
 * Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário.
 * A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
 * As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.
 * A seguir mostre a relação de notas necessárias.

 * Entrada
 * O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

 * Saída
 * Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

 * Obs: Utilize ponto (.) para separar a parte decimal.
 */

fun main(args: Array<String>) {
    notasEMoedas()
}

private fun notasEMoedas() {
    val notas: List<Double> = listOf(100.00, 50.00, 20.00, 10.00, 5.00, 2.00)
    var moedas: List<Double> = listOf(1.00, 0.50, 0.25, 0.10, 0.05, 0.01)

    val valor: Double = readLine()?.toDoubleOrNull() ?: return

    val qtdNotas = calculaNotas(valor, notas)
    val qtdMoedas = calculaMoedas(valor, moedas)

    println("NOTAS:")
    notas.forEachIndexed { indice, nota ->
        println("${qtdNotas[indice]} nota(s) de R$ ${"%.2f".format(nota).replace(",", ".")}")
    }
    println("MOEDAS:")
    moedas.forEachIndexed { indice, moeda ->
        println("${qtdMoedas[indice]} moeda(s) de R$ ${"%.2f".format(moeda).replace(",", ".")}")
    }
}

private fun calculaNotas(valor: Double, notas: List<Double>): List<Int> {
    val qtdNotas: MutableList<Int> = mutableListOf()
    var valorRestante: Double = valor

    notas.forEach { nota ->
        var qtd: Int = 0
        if (valorRestante % nota >= 0) {
            qtd = (valorRestante / nota).toInt()
            valorRestante %= nota
        }
        qtdNotas.add(qtd)
    }

    return qtdNotas
}

private fun calculaMoedas(valor: Double, moedas: List<Double>): List<Int> {
    val qtdMoedas: MutableList<Int> = mutableListOf()
    var valorRestante: Double = ((valor % 5.0) % 2.0)

    moedas.forEach { moeda ->
        var qtd = 0
        if (valorRestante % moeda >= 0) {
            qtd = (valorRestante / moeda).toInt()
            valorRestante %= moeda
        }
        qtdMoedas.add(qtd)
    }

    return qtdMoedas
}