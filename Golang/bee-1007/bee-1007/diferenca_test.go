package bee1007_test

import (
	"testing"

	bee1007 "github.com/joelysondavid/bee-golang/bee-1007/bee-1007"
)

func TestDiferen(t *testing.T) {
	t.Run("DIFERENCA = -26", func(t *testing.T) {
		const (
			valorA = 5
			valorB = 6
			valorC = 7
			valorD = 8
		)
		esperado := -26
		resultado := bee1007.Diferenca(valorA, valorB, valorC, valorD)

		if resultado != esperado {
			t.Errorf("Resultado diferente do esperado! resultado: %d esperado: %d", resultado, esperado)
		}
	})

	t.Run("DIFERENCA = -56", func(t *testing.T) {
		const (
			valorA = 0
			valorB = 0
			valorC = 7
			valorD = 8
		)
		esperado := -56
		resultado := bee1007.Diferenca(valorA, valorB, valorC, valorD)

		if resultado != esperado {
			t.Errorf("Resultado diferente do esperado! resultado: %d esperado: %d", resultado, esperado)
		}
	})

	t.Run("DIFERENCA = 86", func(t *testing.T) {
		const (
			valorA = 5
			valorB = 6
			valorC = -7
			valorD = 8
		)
		esperado := 86
		resultado := bee1007.Diferenca(valorA, valorB, valorC, valorD)

		if resultado != esperado {
			t.Errorf("Resultado diferente do esperado! resultado: %d esperado: %d", resultado, esperado)
		}
	})
}
