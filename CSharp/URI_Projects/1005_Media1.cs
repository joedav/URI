using System;
using System.Collections.Generic;
using System.Text;

namespace URI_Projects
{
    class Media1_1005
    {
        public void Media1()
        {
            double a, b, media;

            a = Convert.ToDouble(Console.ReadLine());
            b = Convert.ToDouble(Console.ReadLine());

            if ((a < 0 || a > 10) || (b < 0 || b > 10.0))
                return;

            media = (((a * 0.35) + (b * 0.75)) / 11) * 10;


            Console.WriteLine("MEDIA = " + media.ToString("0.00000"));
        }
    }
}
