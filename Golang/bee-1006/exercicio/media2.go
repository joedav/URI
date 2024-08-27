package exercicio

func Media2(a, b, c float64) float64 {
	var (
		pesoA = 2.0
		pesoB = 3.0
		pesoC = 5.0
	)

	if notaInvalida(a) || notaInvalida(b) || notaInvalida(c) {
		return 0.0
	}

	resultado := ((a * pesoA) + (b * pesoB) + (c * pesoC)) / 10

	return resultado
}

func notaInvalida(nota float64) bool {
	return nota < 0.0 || nota > 10.0
}
