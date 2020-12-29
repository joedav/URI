using System;
using System.Collections.Generic;
using System.Net.Sockets;
using System.Text;

namespace URI_Projects
{
    public class _1019_ConversaoDeTempo
    {
        public string ConversaoDeTempo(int segundos = 0)
        {
             /*
             * Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.
 
             * Entrada
               O arquivo de entrada contém um valor inteiro N.
        
            * Saída
              Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
             */
            segundos = int.Parse(Console.ReadLine());

            int[] hr = { 0, 0, 0 };

            for (int i = 0; i < 2; i++)
            {
                if (segundos >= 3600)
                {
                    hr[i] = segundos / 3600;
                    segundos %= 3600;
                }
                i++;
                hr[i] = segundos / 60;
                segundos %= 60;

            }
            hr[2] = segundos;

            return $"{hr[0]}:{hr[1]}:{hr[2]}";
        }
    }
}
