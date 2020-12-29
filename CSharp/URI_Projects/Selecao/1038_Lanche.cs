using System;
using System.Collections.Generic;
using System.Globalization;
using System.Text;

namespace URI_Projects.Selecao
{
    public class _1038_Lanche
    {
        public static void Lanche()
        {
            List<object> items = new List<object>();
            items.Add(new { Codigo = 1, Nome = "Cachorro Quente", Preco = 4.0 });
            items.Add(new { Codigo = 2, Nome = "X-Salada", Preco = 4.5 });
            items.Add(new { Codigo = 3, Nome = "X-Bacon", Preco = 5.0 });
            items.Add(new { Codigo = 4, Nome = "Torrada simples", Preco = 2.0 });
            items.Add(new { Codigo = 5, Nome = "Refrigerante", Preco = 1.5 });

            int codItem, qtdItem;
            double total = 0;

            string[] codQtd = Console.ReadLine().Split(' ');
            codItem = int.Parse(codQtd[0]);
            qtdItem = int.Parse(codQtd[1]);

            foreach (var item in items)
            {
                if (codItem == (int)item.GetType().GetProperty("Codigo").GetValue(item, null))
                {
                    total = (double)item.GetType().GetProperty("Preco").GetValue(item, null) * qtdItem;
                    break;
                }
            }

            Console.WriteLine("Total: R$ " + total.ToString("N2", CultureInfo.InvariantCulture));
        }
        

        class Item
        {
            public Item(int codigo, string nome, double preco)
            {
                Codigo = codigo;
                Nome = nome;
                Preco = preco;
            }
            public int Codigo { get; set; }
            public string Nome { get; set; }
            public double Preco { get; set; }
        }
    }
}
