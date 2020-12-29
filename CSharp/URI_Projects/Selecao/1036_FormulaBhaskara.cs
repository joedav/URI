using System;
using System.Globalization;

namespace URI_Projects.Selecao
{
    public class _1036_FormulaBhaskara
    {

        public static void FormulaDeBhaskara()
        {
            /*
         * Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara.
         * Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, 
         * caso haja uma divisão por 0 ou raiz de numero negativo.

         * Entrada
            Leia três valores de ponto flutuante (double) A, B e C.

        * Saída
            Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.
         */

            string[] valoresString = Console.ReadLine().Split(' ');
            if (valoresString.Length == 3)
            {
                double[] numeros = new double[3];
                for (int i = 0; i < 3; i++)
                {
                    double.TryParse(valoresString[i], NumberStyles.Float, CultureInfo.InvariantCulture, out numeros[i]);
                }

                if (numeros.Length == 3)
                {
                    double delta = Math.Pow(numeros[1], 2) - 4 * (numeros[0] * numeros[2]);

                    if ((!double.IsNaN(Math.Sqrt(delta)) && (-(numeros[1]) + Math.Sqrt(delta)) != 0) && (2 * numeros[0] != 0))
                    {
                        double x1 = (-(numeros[1]) + Math.Sqrt(delta)) / (2 * numeros[0]);
                        double x2 = (-(numeros[1]) - Math.Sqrt(delta)) / (2 * numeros[0]);

                        Console.WriteLine($"R1 = {x1.ToString("N5")}");
                        Console.WriteLine($"R2 = {x2.ToString("N5")}");
                    }
                    else
                    {
                        Console.WriteLine("Impossivel calcular");
                    }
                }
            }
        }
    }
}
