package main

import (
	"fmt"
)

func main() {
	const PI = 3.14159

	var raio float64

	fmt.Scan(&raio)

	var resultado = (raio * raio) * PI

	fmt.Printf("A=%.4f\n", resultado)
}
