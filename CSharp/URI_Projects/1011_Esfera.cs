using System;
using System.Collections.Generic;
using System.Text;

namespace URI_Projects
{
    class _1011_Esfera
    {
        public void Esfera()
        {
            // variavies
            double raio, PI = 3.14159, result;
            // entrada com raio
            raio = Convert.ToDouble(Console.ReadLine());
            // calculo do volume de uma esfera (4/3 * pi * r^3) sendo que pi = 3,14159
            result = (4.0 / 3.0) * PI * (raio*raio*raio);
            // mostra o resultado
            Console.WriteLine("VOLUME = "+result.ToString("0.000"));
        }
    }
}
