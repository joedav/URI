using System;
using System.Collections.Generic;
using System.Text;

namespace URI_Projects
{
    class _1010_CalculoSimples
    {
        public void CalculoSimples()
        {
            // variaveis
            string pecas= "";
            string[] pec = new string[3]; // array para armazenar cada item da linha
            int[] qtd = new int[2]; // array de inteiro para armazenar a quantidade
            double[] valPecas = new double[4]; // array double para armazenar os valores das peças e o total
            // loop
            for (int i = 0; i < 2; i++)
            {                
                pecas = Console.ReadLine(); // faz a leitura de uma string
                pec = pecas.Split(' '); // divide essa string em 3 valores e armazena cada um em um indice do array
                qtd[i] = Convert.ToInt32(pec[1]); // pega o segundo item do array (qtd de itens)
                valPecas[i] = Convert.ToDouble(pec[2]); // pega o valor de cada item (terceiro item do array de pec)
            }          
            // validacao
            if (valPecas.Length >= 1)
            {
                valPecas[2] = valPecas[0] * qtd[0]; // multiplica o valor do item 1 com a quantidade dele e armazena na terceira posicao do array de valores
                valPecas[3] = valPecas[1] * qtd[1]; // multiplica o valor do item 1 com a quantidade dele e armazena na quarta posicao do array de valores
                // mostra o total de valores com duas casas decimais
                Console.WriteLine("VALOR A PAGAR: R$ " + (valPecas[2]+valPecas[3]).ToString("0.00"));
            }
        }
    }
}
