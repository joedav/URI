package exercicio

import (
	"fmt"
)

func ProdutoSimples() {
	var num1, num2, prod int
	fmt.Scan(&num1)
	fmt.Scan(&num2)

	prod = ProdutoSimplesReturn(num1, num2)

	fmt.Println("PROD =", prod)
}

func ProdutoSimplesReturn(num1, num2 int) int {
	return num1 * num2
}
