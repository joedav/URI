using System;
using System.Collections.Generic;
using System.Text;

namespace URI_Projects
{
    class AreaDoCirculo_1002
    {
        public void AreaCirculo()
        {
            double raio, area;
            raio = Convert.ToDouble(Console.ReadLine());
            area = 3.14159 * (raio * raio);
            Console.WriteLine("A=" + area.ToString("0.0000"));
            Console.ReadKey();
        }
    }
}
