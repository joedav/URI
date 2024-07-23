package exercicio

import (
	"testing"
)

func TestProdutoSimples(t *testing.T) {
	got := ProdutoSimplesReturn(3, 9)
	want := 27

	if got != want {
		t.Errorf("got %q, wanted %q", got, want)
	}

	got = ProdutoSimplesReturn(-30, 10)
	want = -300

	if got != want {
		t.Errorf("got %q, wanted %q", got, want)
	}

	got = ProdutoSimplesReturn(0, 9)
	want = 0

	if got != want {
		t.Errorf("got %q, wanted %q", got, want)
	}
}
