package bee1009_test

import (
	"math"
	"testing"

	bee1009 "github.com/joelysondavid/bee-golang/bee-1009/bee-1009"
)

func TestSalarioComBonus(t *testing.T) {
	const comissao = 0.15
	t.Run("TOTAL = R$ 684.54", func(t *testing.T) {
		const (
			nomeVend    = "JOAO"
			salarioFixo = 500.00
			totalVendas = 1230.30
			esperado    = 684.54
		)

		resultado := bee1009.SalarioComBonus(salarioFixo, totalVendas, comissao)

		if math.Round(resultado) != math.Round(esperado) {
			t.Errorf("resultasdo deferente do esperado: resultado %f esperado %f\n", resultado, esperado)
		}
	})
	t.Run("TOTAL = R$ 700.00", func(t *testing.T) {
		const (
			nomeVend    = "PEDRO"
			salarioFixo = 700.00
			totalVendas = 0.00
			esperado    = 700.00
		)

		resultado := bee1009.SalarioComBonus(salarioFixo, totalVendas, comissao)

		if resultado != esperado {
			t.Errorf("resultasdo deferente do esperado: resultado %f esperado %f\n", resultado, esperado)
		}
	})
	t.Run("TOTAL = R$ 1884.58", func(t *testing.T) {
		const (
			nomeVend    = "MANGOJATA"
			salarioFixo = 1700.00
			totalVendas = 1230.50
			esperado    = 1884.58
		)

		resultado := bee1009.SalarioComBonus(salarioFixo, totalVendas, comissao)

		if math.Round(resultado) != math.Round(esperado) {
			t.Errorf("resultasdo deferente do esperado: resultado %f esperado %f\n", resultado, esperado)
		}
	})
}
