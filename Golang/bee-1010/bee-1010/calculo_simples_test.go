package bee1010_test

import (
	"testing"

	p "github.com/joelysondavid/bee-golang/bee-1010/bee-1010"
)

func TestCalculoSimples(t *testing.T) {
	t.Run("VALOR A PAGAR: R$ 15.50", func(t *testing.T) {
		pecas := []p.Peca{
			p.Peca{
				Codigo:     12,
				Quantidade: 1,
				Valor:      5.30,
			},
			p.Peca{
				Codigo:     16,
				Quantidade: 2,
				Valor:      5.10,
			},
		}

		esperado := 15.50
		resultado := p.CalculoSimples(pecas)

		if resultado != esperado {
			t.Errorf("Resultado diferente do esperado: resultado %f esperado %f\n", resultado, esperado)
		}
	})

	t.Run("VALOR A PAGAR: R$ 51.40", func(t *testing.T) {
		pecas := []p.Peca{
			p.Peca{
				Codigo:     13,
				Quantidade: 2,
				Valor:      15.30,
			},
			p.Peca{
				Codigo:     161,
				Quantidade: 4,
				Valor:      5.20,
			},
		}

		esperado := 51.40
		resultado := p.CalculoSimples(pecas)

		if resultado-esperado > 0.5 {
			t.Errorf("Resultado diferente do esperado: resultado %f esperado %f\n", resultado, esperado)
		}
	})

	t.Run("VALOR A PAGAR: R$ 30.20", func(t *testing.T) {
		pecas := []p.Peca{
			p.Peca{
				Codigo:     1,
				Quantidade: 1,
				Valor:      15.10,
			},
			p.Peca{
				Codigo:     2,
				Quantidade: 1,
				Valor:      15.10,
			},
		}

		esperado := 30.20
		resultado := p.CalculoSimples(pecas)

		if resultado != esperado {
			t.Errorf("Resultado diferente do esperado: resultado %f esperado %f\n", resultado, esperado)
		}
	})
}
