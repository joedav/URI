package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"

	bee1010 "github.com/joelysondavid/bee-golang/bee-1010/bee-1010"
	p "github.com/joelysondavid/bee-golang/bee-1010/bee-1010"
)

func main() {
	scanner := bufio.NewScanner(os.Stdin)

	scanner.Scan()
	peca1str := scanner.Text()
	scanner.Scan()
	peca2str := scanner.Text()

	peca1Items := strings.Split(peca1str, " ")
	peca2Items := strings.Split(peca2str, " ")

	if len(peca1Items) != 3 || len(peca2Items) != 3 {
		return
	}

	peca1Quantidade, _ := strconv.Atoi(peca1Items[1])
	peca1Valor, _ := strconv.ParseFloat(peca1Items[2], 64)

	peca2Quantidade, _ := strconv.Atoi(peca2Items[1])
	peca2Valor, _ := strconv.ParseFloat(peca2Items[2], 64)

	// resultado := (peca1Valor * float64(peca1Quantidade)) + (peca2Valor * float64(peca2Quantidade))

	pecas := []p.Peca{
		p.Peca{
			Codigo:     1,
			Quantidade: peca1Quantidade,
			Valor:      peca1Valor,
		},
		p.Peca{
			Codigo:     2,
			Quantidade: peca2Quantidade,
			Valor:      peca2Valor,
		},
	}

	resultado := bee1010.CalculoSimples(pecas)

	fmt.Printf("VALOR A PAGAR: R$ %.2f\n", resultado)
}
