package exercicio

import (
	"fmt"
	"strconv"
)

func Media1() {
	var a, b float64

	_, err := fmt.Scan(&a)
	if err != nil {
		panic(err)
	}
	_, err = fmt.Scan(&b)
	if err != nil {
		panic(err)
	}

	if !(valoresPermitidos(a) && valoresPermitidos(b)) {
		panic("Os valores devem estar entre 0 e 10")
	}

	// sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5
	// (A soma dos pesos portanto é 11)
	media := FnMedia1(a, b)
	fmt.Printf("MEDIA = %.5f\n", media)
}

func FnMedia1(a float64, b float64) float64 {
	pesoA, pesoB := 3.5, 7.5
	media := ((a * pesoA) + (b * pesoB)) / 11
	strMedia := fmt.Sprintf("%.5f", media)
	media, err := strconv.ParseFloat(strMedia, 64)
	if err != nil {
		panic(err)
	}
	return media
}

func valoresPermitidos(x float64) bool {
	return x >= 0.0 && x <= 10.0
}
