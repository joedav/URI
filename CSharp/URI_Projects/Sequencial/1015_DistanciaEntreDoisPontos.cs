using System;
using System.Collections.Generic;
using System.Text;

namespace URI_Projects
{
    class _1015_DistanciaEntreDoisPontos
    {
        private const int V = 0;

        public static void DistanciaEntreDoisPontos()
        {
            // Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:
            string[] p1;
            string[] p2;

            p1 = Console.ReadLine().Split(" "); // armazenara x1 e y1
            p2 = Console.ReadLine().Split(" "); // armazenara x2 e y2


            double[] x1y1 = { double.Parse(p1[0]), double.Parse(p1[1]) };
            double[] x2y2 = { double.Parse(p2[0]), double.Parse(p2[1]) };

            double distancia = Math.Sqrt(((x2y2[0] - x1y1[0]) * (x2y2[0] - x1y1[0])) + ((x2y2[1] - x1y1[1]) * (x2y2[1] - x1y1[1])));

            Console.WriteLine(distancia.ToString("0.0000"));
        }
    }
}
