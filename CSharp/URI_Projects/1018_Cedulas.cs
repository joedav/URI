using System;
using System.Collections.Generic;
using System.Globalization;
using System.Text;

namespace URI_Projects
{
    public class _1018_Cedulas
    {
        public void Cedulas()
        {
            /*
             * Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.
             * 
             * Entrada
             * O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).
             * 
             * Saída
             * Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
             * 
             */
            CultureInfo ptBr = new CultureInfo("pt-Br");
            int valor = int.Parse(Console.ReadLine());

            if (valor > 0 && valor < 1000000)
            {
                int valorAux = valor;
                int[,] notas = { { 100, 0 }, { 50, 0 }, { 20, 0 }, { 10, 0 }, { 5, 0 }, { 2, 0 }, { 1, 0 } };

                for (int i = 0; valor > 0; i++)
                {
                    if (valor >= notas[i, 0])
                    {
                        notas[i, 1] = valor / notas[i, 0];
                        valor = valor % notas[i, 0];
                    }
                }

                Console.WriteLine(valorAux);
                for (int i = 0; i < 7; i++)
                {
                    Console.Write(notas[i, 1] + " nota(s) de R$ " + notas[i, 0].ToString("F2", ptBr) + "\n");
                }
            }
        }
    }
}
