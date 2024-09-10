package bee1010

import "fmt"

type Peca struct {
	Codigo     int
	Quantidade int
	Valor      float64
}

func CalculoSimples(pecas []Peca) float64 {
	resultado := 0.0

	for _, peca := range pecas {
		fmt.Println(peca)
		resultado += peca.Valor * float64(peca.Quantidade)
	}

	return resultado
}
