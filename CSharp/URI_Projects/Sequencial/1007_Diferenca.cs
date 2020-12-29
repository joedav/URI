using System;
using System.Collections.Generic;
using System.Text;

namespace URI_Projects
{
    class Diferenca_1007
    {
        // Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
        // Entrada 
        // O arquivo de entrada contém 4 valores inteiros.
        // Saída
        // Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.

        public void Diferenca()
        {
            int a, b, c, d, dif;

            // Entrada com 4 valores inteiros
            a = Convert.ToInt32(Console.ReadLine());
            b = Convert.ToInt32(Console.ReadLine());
            c = Convert.ToInt32(Console.ReadLine());
            d = Convert.ToInt32(Console.ReadLine());
            // formula (A * B - C * D)
            dif = ((a * b) - (c * d));

            Console.WriteLine("DIFERENCA = "+dif);
        }
    }
}
