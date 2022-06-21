package Basic

import java.util.*

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
    val valor = readLine()?.toDoubleOrNull() ?: return
    notasEMoedas(valor)
}

private fun notasEMoedas(valorRecebido: Double) {
    var valor = valorRecebido
    val notas: List<Double> = listOf(100.00, 50.00, 20.00, 10.00, 5.00, 2.00)
    var moedas: List<Double> = listOf(1.00, 0.50, 0.25, 0.10, 0.05, 0.01)


    println("NOTAS:")
    valor = exibeNotas(notas, valor)


    println("MOEDAS:")
    exibeMoedas(moedas, valor)
}

private fun exibeNotas(notas: List<Double>, valorRecebido: Double): Double {
    var valor = valorRecebido
    notas.forEach { nota ->
        if (valor >= nota) {
            val qtdNota: Int = Math.floor(valor / nota).toInt()
            valor = String.format(Locale.ENGLISH, "%.2f", (valor % nota)).toDouble()
            mostraResultado(qtdNota, nota, "nota")
        } else {
            mostraResultado(0, nota, "nota")
        }
    }
    return valor
}

private fun exibeMoedas(moedas: List<Double>, valorRecebido: Double) {
    var valor = valorRecebido
    moedas.forEach { moeda ->
        if (valor >= moeda) {
            val qtdMoeda = Math.floor(valor / moeda).toInt()
            valor = String.format(Locale.ENGLISH, "%.2f", valor % moeda).toDouble()
            mostraResultado(qtdMoeda, moeda, "moeda")
        } else {
            mostraResultado(0, moeda, "moeda")
        }
    }
}

private fun mostraResultado(qtdNota: Int, valor: Double, tipo: String) {
    println("$qtdNota $tipo(s) de R$ ${String.format("%.2f", valor)}")
}

//fun main() {
//    notasEMoedas(576.73)
//    println("======")
//    notasEMoedas(4.0)
//    println("======")
//    notasEMoedas(91.01)
//    println("======")
//    notasEMoedas(276.82)
//}