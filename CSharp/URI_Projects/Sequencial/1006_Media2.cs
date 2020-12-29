using System;
using System.Collections.Generic;
using System.Text;

namespace URI_Projects
{
    class Media2_1006
    {
        public void Media2()
        {
            double a, b, c, media;

            a = Convert.ToDouble(Console.ReadLine());
            b = Convert.ToDouble(Console.ReadLine());
            c = Convert.ToDouble(Console.ReadLine());

            if (a > 10.0 || b > 10.0 || c > 10.0 || a < 0 || b < 0 || c < 0)
                return;

            media = (((a * 0.2) + (b * 0.3) + (c * 0.5)) / 10)*10;

            Console.WriteLine("MEDIA = "+media.ToString("0.0"));
        }
    }
}
