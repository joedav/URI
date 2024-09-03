package bee1009

func SalarioComBonus(salario, vendas, comissao float64) float64 {
	if comissao < 0.01 {
		comissao = 0.15
	}

	return salario + (vendas * comissao)
}
