using System;
using System.Collections.Generic;
using System.Text;

namespace URI_Projects
{
    public class _1016_Distancia
    {
        public void Distancia()
        {
            /*
            * Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja, consegue se afastar um quilômetro a cada 2 minutos.

               Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro.

               Entrada
               O arquivo de entrada contém um número inteiro.

               Saída
               Imprima o tempo necessário seguido da mensagem "minutos".
            */

            int minutos = 0;
            int km = 0;

            km = int.Parse(Console.ReadLine());

            minutos = km * 2;

            Console.WriteLine(minutos + " minutos");
        }
    }
}
