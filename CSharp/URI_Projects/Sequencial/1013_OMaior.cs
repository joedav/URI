using System;
using System.Collections.Generic;
using System.Text;

namespace URI_Projects
{
    class _1013_OMaior
    {
        public void Maior()
        {
            // variaveis
            string valores;
            string[] abc = new string[3];
            int maior=0;
            // entrada
            valores = Console.ReadLine();
            abc = valores.Split(' ');
            // operacao do maior
            for(int i = 0; i <= 2; i++)
            {
                // se o valor do indice for maior que o maior numero
                if (maior < Convert.ToInt32(abc[i]))
                {
                    // armazena esse numero na variavel maior
                    maior = Convert.ToInt32(abc[i]);
                }
            }
            // mostrando
            Console.WriteLine(maior+" eh o maior");
        }
    }
}
