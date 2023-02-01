/*
 * Leia os quatro valores correspondentes aos eixos x e y de dois pontos
 * quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles,
 * mostrando 4 casas decimais após a vírgula, segundo a fórmula:

 * Distancia = √((x2-x1)² + (y2-y1)²)

 * Entrada
 * O arquivo de entrada contém duas linhas de dados.
 * A primeira linha contém dois valores de ponto flutuante:
 * x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

 * Saída
  Calcule e imprima o valor da distância segundo a fórmula fornecida,
  *  com 4 casas após o ponto decimal.
 *
 * trocar "prompt()" por "lines.shift()" quando for mandar pro URI
 */

function DistanciaEntreDoisPontos() {
  const texto1 = prompt();
  const texto2 = prompt();

  // const texto1 = "-2.5 0.4";
  // const texto2 = "12.1 7.3";

  const p1 = texto1.split(" ");
  const p2 = texto2.split(" ");

  const distancia = Math.sqrt((Math.pow((p2[0] - p1[0]), 2) + (Math.pow((p2[1] - p1[1]), 2))));
  console.log(distancia.toFixed(4));
}

DistanciaEntreDoisPontos();