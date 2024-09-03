package main

import (
	"fmt"

	bee1009 "github.com/joelysondavid/bee-golang/bee-1009/bee-1009"
)

func main() {
	var (
		nomeVendedor                            string
		salarioFixo, totalVendas, totalAReceber float64
		comissao                                = 0.15
	)

	fmt.Scan(&nomeVendedor)
	fmt.Scan(&salarioFixo)
	fmt.Scan(&totalVendas)

	// totalAReceber = salarioFixo + (totalVendas * float64(comissao))
	totalAReceber = bee1009.SalarioComBonus(salarioFixo, totalVendas, comissao)

	fmt.Printf("TOTAL = R$ %.2f\n", totalAReceber)
}
