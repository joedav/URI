using System;
using System.Collections.Generic;
using System.Text;

namespace URI_Projects
{
    class Salario_1008
    {
        public void Salario()
        {
            // numero do func, e numeros de horas trabalhadas
            int num, horasTrab;
            double valorHora, salario;

            // recebe numero do funcionario horas trabalhadas e valor das horas
            num = Convert.ToInt32(Console.ReadLine());
            horasTrab = Convert.ToInt32(Console.ReadLine());
            valorHora = Convert.ToDouble(Console.ReadLine());

            // calcula o salario do funcionario
            salario = valorHora * horasTrab;

            Console.WriteLine("NUMBER = "+num+"\nSALARY = U$ "+salario.ToString("0.00"));
        }
    }
}
