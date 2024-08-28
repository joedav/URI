package main

import (
	"fmt"

	bee1007 "github.com/joelysondavid/bee-golang/bee-1007/bee-1007"
)

func main() {
	var (
		valorA, valorB, valorC, valorD int
	)

	fmt.Scan(&valorA)
	fmt.Scan(&valorB)
	fmt.Scan(&valorC)
	fmt.Scan(&valorD)

	resultado := bee1007.Diferenca(valorA, valorB, valorC, valorD)

	fmt.Printf("DIFERENCA = %d\n", resultado)
}
