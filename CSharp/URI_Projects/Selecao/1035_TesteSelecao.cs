using System;
using System.Collections.Generic;
using System.Text;

namespace URI_Projects
{
    public class _1035_TesteSelecao
    {

        public static void TesteSelecao()
        {
            /*
               * Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

               * Entrada
                   Quatro números inteiros A, B, C e D.

               * Saída
                   Mostre a respectiva mensagem após a validação dos valores.
            */

            string[] valoresString = Console.ReadLine().Split(' ');
            if (valoresString.Length == 4)
            {
                int[] valores = new int[4];
                for (int i = 0; i < 4; i++)
                {
                    int.TryParse(valoresString[i], out valores[i]);
                }

                if ((valores[1] > valores[2] && valores[3] > valores[0]) &&
                    (valores[2] + valores[3] > valores[0] + valores[1]) &&
                    (valores[2] > 0 && valores[3] > 0) && (valores[0] % 2 == 0))
                    Console.WriteLine("Valores aceitos");
                else
                    Console.WriteLine("Valores nao aceitos");
            }
        }
    }
}
