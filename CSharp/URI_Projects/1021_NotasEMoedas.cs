using System;
using System.Collections.Generic;
using System.Globalization;
using System.Text;

namespace URI_Projects
{
    class _1021_NotasEMoedas
    {/*
         Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

        *Entrada
        O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

        *Saída
        Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

        Obs: Utilize ponto (.) para separar a parte decimal.
         */

        public void NotasEMoedas()
        {


            double valor = 0;
            valor = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
            int[] notas = { 100, 50, 20, 10, 5, 2 };
            int[] qtdNotas = new int[6];
            double[] moedas = { 1, 0.50, 0.25, 0.10, 0.05, 0.01 };
            int[] qtdMoedas = new int[6];

            if (valor > 0 && valor < 1000000.00)
            {
                int valorN = int.Parse(Math.Floor(valor).ToString(""));
                double valorM = double.Parse((valor % 1).ToString("N2"));
                for (int i = 0; i < 2; i++)
                {
                    for (int j = 0; j < 6; j++)
                    {
                        if (i == 0)
                        {
                            if (valorN / notas[j] >= 0)
                                qtdNotas[j] = (int)(valorN / notas[j]);

                            valorN = valorN % notas[j];
                        }

                        if (i == 1)
                        {

                            if (valorN == 1)
                            {
                                qtdMoedas[j] = 1;
                                j++;
                                valorN = 0;
                            }

                            if (valorM / moedas[j] >= 0)
                                qtdMoedas[j] = (int)(valorM / moedas[j]);

                            valorM = double.Parse((valorM % moedas[j]).ToString("N2"));
                        }
                    }

                }

                Console.WriteLine("NOTAS:");
                for (int i = 0; i < qtdNotas.Length; i++)
                {
                    Console.WriteLine($"{qtdNotas[i]} nota(s) de R$ {notas[i].ToString("N2")}");
                }
                Console.WriteLine("MOEDAS:");
                for (int j = 0; j < qtdMoedas.Length; j++)
                {
                    Console.WriteLine($"{qtdMoedas[j]} moeda(s) de R$ {moedas[j].ToString("N2")}");
                }
            }
        }
    }
}
