/*
 * Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”.
 * Utilize a fórmula:
  * MaiorAB = (a+b+abs(a-b))/2
  * abs=valor absoluto = qualquer numero vira positivo
  * Ex: (7+9+(2))/2 = 9
  *     (3+4+(1))/2 = 4
  *     (18+14+(4))/2 = 18
  * 
  * (3+4+7+(3-4-7))/3 = 4

 * Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b).
 * Um segundo passo, portanto é necessário para chegar no resultado esperado.

 * Entrada
 * O arquivo de entrada contém três valores inteiros.

 * Saída
 * Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
 *
 * trocar "prompt()" por "lines.shift()" quandop passar pro URI
 */

function Maior() {
  const texto = prompt();
  const valores = texto.split(" ");
  const a = parseInt(valores[0]);
  const b = parseInt(valores[1]);
  const c = parseInt(valores[2]);

  // const a = -2127;
  // const b = -1420;
  // const c = -6424;

  const maiorAB = ((a + b) + Math.abs(a - b)) / 2;
  const maiorABC = maiorAB > c ? maiorAB : c;
  console.log(maiorABC + " eh o maior");
}


Maior();