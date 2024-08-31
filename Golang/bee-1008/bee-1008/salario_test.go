package bee1008_test

import (
	"testing"

	bee1008 "github.com/joelysondavid/bee-golang/bee-1008/bee-1008"
)

func TestSalario(t *testing.T) {
	t.Run("1 - SALARY = U$ 550.00", func(t *testing.T) {
		const (
			nrFuncionario = 25
			hrTrabalhadas = 100
			vlrHora       = 5.50
			esperado      = 550.00
		)

		resultado := bee1008.Salario(vlrHora, hrTrabalhadas)

		if resultado != esperado {
			t.Errorf("Valor esperado diferente do resultado: esperado %f esperado %f", esperado, resultado)
		}
	})

	t.Run("2 - SALARY = U$ 4100.00", func(t *testing.T) {
		const (
			nrFuncionario = 1
			hrTrabalhadas = 200
			vlrHora       = 20.5
			esperado      = 4100.00
		)

		resultado := bee1008.Salario(vlrHora, hrTrabalhadas)

		if resultado != esperado {
			t.Errorf("Valor esperado diferente do resultado: esperado %f esperado %f", esperado, resultado)
		}
	})

	t.Run("3 - SALARY = U$ 2254.75", func(t *testing.T) {
		const (
			nrFuncionario = 6
			hrTrabalhadas = 145
			vlrHora       = 15.55
			esperado      = 2254.75
		)

		resultado := bee1008.Salario(vlrHora, hrTrabalhadas)

		if resultado != esperado {
			t.Errorf("Valor esperado diferente do resultado: esperado %f esperado %f", esperado, resultado)
		}
	})
}
