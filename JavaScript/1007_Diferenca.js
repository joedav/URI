/*
 * Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre 
 * a diferença do produto de A e B pelo produto de C e Dsegundo a fórmula: DIFERENCA = (A * B - C * D).

 * Entrada
 * O arquivo de entrada contém 4 valores inteiros.

 * Saída
 * Imprima a mensagem DIFERENCA com todas as letras maiúsculas, 
 * conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
 */

// SEMPRE TROCAR 'prompt()' por 'lines.shift()' quando for passar pro URI

let a = parseInt(prompt());
let b = parseInt(prompt());
let c = parseInt(prompt());
let d = parseInt(prompt());

let diferenca = (a * b) - (c * d);

console.log("DIFERENCA = " + diferenca);