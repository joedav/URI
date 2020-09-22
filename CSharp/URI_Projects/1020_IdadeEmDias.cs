using System;
using System.Collections.Generic;
using System.Text;

namespace URI_Projects
{
    // 1020 - Idade em Dias
    public class _1020_IdadeEmDias
    {
        /*
         Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

         *Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

        *Entrada
        O arquivo de entrada contém um valor inteiro.

        *Saída
        Imprima a saída conforme exemplo fornecido.
         */

        public void IdadeEmDias()
        {
            // Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
            int days = int.Parse(Console.ReadLine());

            // Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias.Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364.Este é apenas um exercício com objetivo de testar raciocínio matemático simples.
            int[] idade = new int[3];
            idade[0] = (days / 365);
            days %= 365;
            idade[1] = days / 30;
            days %= 30;
            idade[2] = (days % 30);

            // Exibição
            Console.WriteLine("{0} ano(s)", idade[0]);
            Console.WriteLine("{0} mes(es)", idade[1]);
            Console.WriteLine("{0} dia(s)", idade[2]);
        }
    }
}
