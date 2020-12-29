using System;
using System.Collections.Generic;
using System.Text;

namespace URI_Projects
{
    class _1014_Consumo
    {
        public void Consumo()
        {
            int km = int.Parse(Console.ReadLine()); // total de km percorrido
            double l = double.Parse(Console.ReadLine()); // litros gasto na viagem

            double consumoMedio = (km / l);

            Console.WriteLine(consumoMedio.ToString("0.000")+" km/l");
        }
    }
}
