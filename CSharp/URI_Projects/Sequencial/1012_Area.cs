using System;
using System.Collections.Generic;
using System.Text;

namespace URI_Projects
{
    class _1012_Area
    {
        public void Area()
        {
            // variaveis
            string valores;
            string[] abc = new string[3];
            double a, b, c, trian, circ, trap, quad,retan, PI= 3.14159;
            // leitura dos valores
            valores = Console.ReadLine();
            abc = valores.Split(' '); // passando os valores para um array de 3 posições
            // passando os valores do array para as respectivas variáveis
            a = Convert.ToDouble(abc[0]);
            b = Convert.ToDouble(abc[1]);
            c = Convert.ToDouble(abc[2]);
            // operações
            trian = a * c / 2; // base * altura / 2
            circ = PI*(c*c); // c^2 * PI
            trap = ((a+b)*c)/2; // ((base1+base2) * altura) / 2
            quad = b * b; // lado * lado
            retan = a * b; // base * altura

            // mostrando na tela
            Console.WriteLine("TRIANGULO: "+trian.ToString("0.000")+"\nCIRCULO: "+circ.ToString("0.000")+"\nTRAPEZIO: "+trap.ToString("0.000")+"\nQUADRADO: "+quad.ToString("0.000")+"\nRETANGULO: "+retan.ToString("0.000"));
        }
    }
}
