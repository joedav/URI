/**
 * Leia 4 valores inteiros A, B, C e D. A seguir, 
 * se B for maior do que C 
 * e se D for maior do que A, 
 * e a soma de C com D for maior que a soma de A e B
 * e se C e D, ambos, forem positivos 
 * e se a variável A for par escrever a mensagem "Valores aceitos", 
 * senão escrever "Valores nao aceitos".

 * Entrada
 * Quatro números inteiros A, B, C e D.

 * Saída
 * Mostre a respectiva mensagem após a validação dos valores.
 */

/**  para leitura em node
 * const input = require('fs').readFileSync('/dev/stdin', 'utf8');
 * const lines = input.split('\n');
*/

// const lines = prompt().split(' ')
const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const line = lines[0].split(' ')
const [a, b, c, d] = [line[0], line[1], line[2], line[3]]

const bMaiorC = valorMaior(b, c)
const dMaiorA = valorMaior(d, a)
const cdMaiorAb = valorMaior(c + d, a + b)
const cPositivo = valorPositivo(c)
const dPositivo = valorPositivo(d)

let mensagem = 'Valores nao aceitos'
if (bMaiorC && dMaiorA && cdMaiorAb && cPositivo && dPositivo) {
    mensagem = 'Valores aceitos'
}
console.log(mensagem)

function valorMaior(n1, n2) {
    return n1 > n2
}

function valorPositivo(n) {
    return n > 0
}