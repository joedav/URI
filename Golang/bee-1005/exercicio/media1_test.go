package exercicio_test

import (
	"testing"

	"github.com/joelysondavid/bee-golang/bee-1005/exercicio"
)

func Test1Media1(t *testing.T) {
	result := exercicio.FnMedia1(5.0, 7.1)
	expect := 6.43182

	if result != expect {
		t.Errorf("Resultado diferente do esperado: resultado %.5f esperado %.5f", result, expect)
	}
}

func Test2Media1(t *testing.T) {
	result := exercicio.FnMedia1(0.0, 7.1)
	expect := 4.84091

	if result != expect {
		t.Errorf("Resultado diferente do esperado: resultado %.5f esperado %.5f", result, expect)
	}
}

func Test3Media1(t *testing.T) {
	result := exercicio.FnMedia1(10.0, 10.0)
	expect := 10.00000

	if result != expect {
		t.Errorf("Resultado diferente do esperado: resultado %.5f esperado %.5f", result, expect)
	}
}

func TestErrMedia1(t *testing.T) {
	result := exercicio.FnMedia1(10.1, 10.0)
	expect := 10.00000

	if result == expect {
		t.Errorf("Resultado diferente do esperado: resultado %.5f esperado %.5f", result, expect)
	}
}
