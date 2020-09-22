using System;
using System.Collections.Generic;
using System.Text;

namespace URI_Projects
{
    class ProdutoSimples1004
    {

        public void ProdutoSimples()
        {
            int a, b, prod;
            a = Convert.ToInt32(Console.ReadLine());
            b = Convert.ToInt32(Console.ReadLine());

            prod = a * b;

            Console.WriteLine("PROD = " + prod);
        }
    }
}
