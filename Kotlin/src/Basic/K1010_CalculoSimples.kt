package Basic

class PecaComprada(var codigo: Int, var quantidade: Int, var valor: Double)

fun main(args: Array<String>) {
    val peca1: PecaComprada = preenchePeca()
    val peca2: PecaComprada = preenchePeca()

    val valoraPagar = calculoSimples(peca1)+ calculoSimples(peca2)

    println("VALOR A PAGAR: R$ ${"%.2f".format(valoraPagar)}")
}

private fun calculoSimples(pecaComprada: PecaComprada):Double {
    return pecaComprada.quantidade * pecaComprada.valor
}

private fun preenchePeca(): PecaComprada {
    val peca: PecaComprada = PecaComprada(
        codigo = 0,
        quantidade = 0,
        valor = 0.0
    )
    val entradaString = readLine()?.split(" ") ?: arrayListOf()
    peca.codigo = entradaString[0].toInt()
    peca.quantidade = entradaString[1].toInt()
    peca.valor = entradaString[2].toDouble()

    return peca
}