package main

import (
	"fmt"
)

func main() {
	var (
		a, b, resultado int
	)

	fmt.Scan(&a)
	fmt.Scan(&b)

	resultado = a + b

	fmt.Printf("SOMA = %v\n", resultado)
}
