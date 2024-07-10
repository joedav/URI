package main

import "fmt"

func main() {
	var (
		number1, number2, x int
	)

	fmt.Scan(&number1)
	fmt.Scan(&number2)

	x = number1 + number2

	fmt.Println("X =", x)
}
