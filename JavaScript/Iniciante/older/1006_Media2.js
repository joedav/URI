import {
  listeners
} from "cluster";

// sempre trocar o prompt() por lines.shift()

/* 
Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

Saída
Imprima a variável MEDIA conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade. Assim como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
*/
// var input = require('fs').readFileSync('/dev/stdin', 'utf8');
// var lines = input.split('\n');

var a = parseFloat(prompt());
var b = parseFloat(prompt());
var c = parseFloat(prompt());

if ((a >= 0 && a <= 10.0) && (b >= 0 && b <= 10.0) && (c >= 0 && c <= 10.0)) {

  var media = ((a * 2) + (b * 3) + (c * 5)) / 10;
  console.log("MEDIA = " + media.toFixed(1));
}