package exercicio_test

import (
	"testing"

	"github.com/joelysondavid/bee-golang/bee-1006/exercicio"
)

func TestMedia2(t *testing.T) {
	t.Run("MEDIA = 6.3", func(t *testing.T) {
		const (
			notaA = 5.0
			notaB = 6.0
			notaC = 7.0
		)

		esperado := 6.3
		resultado := exercicio.Media2(notaA, notaB, notaC)

		if resultado != esperado {
			t.Errorf("Resultado diferente do esperado: resultado %.1f esperado %.1f", resultado, esperado)
		}
	})

	t.Run("MEDIA = 9.0", func(t *testing.T) {
		const (
			notaA = 5.0
			notaB = 10.0
			notaC = 10.0
		)

		esperado := 9.0
		resultado := exercicio.Media2(notaA, notaB, notaC)

		if resultado != esperado {
			t.Errorf("Resultado diferente do esperado: resultado %.1f esperado %.1f", resultado, esperado)
		}
	})

	t.Run("MEDIA = 7.5", func(t *testing.T) {
		const (
			notaA = 10.0
			notaB = 10.0
			notaC = 5.0
		)

		esperado := 7.5
		resultado := exercicio.Media2(notaA, notaB, notaC)

		if resultado != esperado {
			t.Errorf("Resultado diferente do esperado: resultado %.1f esperado %.1f", resultado, esperado)
		}
	})
}
