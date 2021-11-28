package Basic
/*
* Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
* */
fun main(args: Array<String>) {
    val valueA: Int = readLine()!!.toInt()
    val valueB: Int = readLine()!!.toInt()
    val valueC: Int = readLine()!!.toInt()
    val valueD: Int = readLine()!!.toInt()

    val diff = difference(valueA, valueB, valueC, valueD)

    println("DIFERENCA = $diff")
}

fun difference(number1: Int, number2: Int, number3: Int, number4: Int): Int {
    return (number1 * number2) - (number3 * number4)
}