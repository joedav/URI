package main

import (
	"fmt"

	bee1008 "github.com/joelysondavid/bee-golang/bee-1008/bee-1008"
)

func main() {
	var (
		nrFuncionario, hrTrabalhadas int
		vlrHora, salario             float64
	)

	fmt.Scan(&nrFuncionario)
	fmt.Scan(&hrTrabalhadas)
	fmt.Scan(&vlrHora)

	salario = bee1008.Salario(vlrHora, hrTrabalhadas)

	fmt.Printf("NUMBER = %d\n", nrFuncionario)
	fmt.Printf("SALARY = U$ %.2f\n", salario)
}
