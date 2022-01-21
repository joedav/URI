package Basic

/**
 * Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

 * Entrada
 * O arquivo de entrada contém um valor inteiro N.

 * Saída
 * Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
 */

fun main(args: Array<String>) {
    conversaoDeTempo()
}

fun conversaoDeTempo() {
    val duracaoEmSegundos: Int = readLine()?.toIntOrNull() ?: return

    val valorExpressoHHmmss: String = converteValorEmHHmmss(duracaoEmSegundos)
    println(valorExpressoHHmmss)
}

fun calculaHoras(valorEmSegundos: Int): Boolean = valorEmSegundos > 3600
fun calculaMinutos(valorEmSegundos: Int): Boolean = valorEmSegundos > 60

fun converteValorEmHHmmss(valorEmSegundos: Int): String {
    val horas: Int = if (calculaHoras(valorEmSegundos)) obtemHoras(valorEmSegundos) else 0
    val minutos: Int = if (calculaMinutos(valorEmSegundos)) obtemMinutos(valorEmSegundos) else 0
    val segundos: Int = valorEmSegundos % 60

    return "$horas:$minutos:$segundos"
}

fun obtemHoras(valorEmSegundos: Int): Int {
    return valorEmSegundos / 3600
}

fun obtemMinutos(valorEmSegundos: Int): Int {
    val minutosRestantes = minutosRestantesDasHoras(valorEmSegundos)
    return minutosRestantes / 60
}

private fun minutosRestantesDasHoras(valorEmSegundos: Int) = valorEmSegundos % 3600