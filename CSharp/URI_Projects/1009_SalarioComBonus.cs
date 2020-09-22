using System;
using System.Collections.Generic;
using System.Text;

namespace URI_Projects
{
    class _1009_SalarioComBonus
    {
        public void SalarioBonus()
        {
            // variaveis
            string nome;
            double salario, vendas, salarioBonus;

            // entrada nome, valor do salario, e valor das vendas
            nome = Console.ReadLine();
            salario = Convert.ToDouble(Console.ReadLine());
            vendas = Convert.ToDouble(Console.ReadLine());
            // calculo do salario com bonus
            salarioBonus = salario + (vendas * 0.15);
            // mostra o total
            Console.WriteLine("TOTAL = R$ " + salarioBonus.ToString("0.00"));
        }
    }
}
