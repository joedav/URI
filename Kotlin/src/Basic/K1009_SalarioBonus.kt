package Basic

/*
* Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.

Entrada
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.

Saída
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
* */

fun main(args: Array<String>) {
    salaryWithBonus()
}

private fun salaryWithBonus() {
    val sallerName: String = readLine()!!
    val fixedSellerSalary: Double = readLine()!!.toDouble()
    val totalSalesMade: Double = readLine()!!.toDouble()

    val salaryWithBonus: Double = fixedSellerSalary + calculateBonus(totalSalesMade, 15)
    println("TOTAL = R$ ${"%.2f".format(salaryWithBonus)}")
}

private fun calculateBonus(totalSalesMade: Double, percent: Int): Double {
    return totalSalesMade * (percent / 100.0)
}