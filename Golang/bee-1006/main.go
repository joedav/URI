package main

import (
	"fmt"

	"github.com/joelysondavid/bee-golang/bee-1006/exercicio"
)

func main() {
	var (
		notaA, notaB, notaC float64
	)

	fmt.Scan(&notaA)
	fmt.Scan(&notaB)
	fmt.Scan(&notaC)
	resultado := exercicio.Media2(notaA, notaB, notaC)

	fmt.Printf("MEDIA = %.1f\n", resultado)
}
