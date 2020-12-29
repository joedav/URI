using System;
using System.Collections.Generic;
using System.Text;

namespace URI_Projects
{
    public class _1017_GastoDeCombustivel
    {
        public void GastoDeCobustivel()
        {
            /*
         *Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, ao utilizar um automóvel que faz 12 KM/L. Para isso, ele gostaria que você o auxiliasse através de um simples programa. Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade média durante a mesma (em km/h). Assim, pode-se obter distância percorrida e, em seguida, calcular quantos litros seriam necessários. Mostre o valor com 3 casas decimais após o ponto.

         Entrada
         O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem (em horas) e o segundo é a velocidade média durante a mesma (em km/h).

         Saída
         Imprima a quantidade de litros necessária para realizar a viagem, com três dígitos após o ponto decimal
         * 
         */

            int tempoGastoHr = 0;
            int velocidadeMediaKMh = 0;
            double litros = 0;

            tempoGastoHr = int.Parse(Console.ReadLine());
            velocidadeMediaKMh = int.Parse(Console.ReadLine());

            // velocidade media vezes o tempo gasto = distancia percorrida. dividido pela quantidade de km por litro
            litros = (velocidadeMediaKMh * tempoGastoHr) / 12.00;

            Console.WriteLine(litros.ToString("F3"));
        }
    }
}
