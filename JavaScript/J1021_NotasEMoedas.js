/**
 * Leia um valor de ponto flutuante com duas casas decimais. 
 * Este valor representa um valor monetário. A seguir, calcule o menor número de notas e
 * moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2.
 * As moedas possíveis são de 1, 0.50, 0.25,   0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

 * Entrada
 * O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

 * Saída
 * Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

 * Obs: Utilize ponto (.) para separar a parte decimal.
 */

var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
const valor = lines.shift();
notasEMoedas(valor);
function notasEMoedas(valor) {
  parseFloat(valor);

  if (valor === null || valor === "") return;
  console.log(valor);
  const notas = [100.00, 50.00, 20.00, 10.00, 5.00, 2.00];
  const moedas = [1.00, 0.50, 0.25, 0.10, 0.05, 0.01];

  let notasCalculadas = calculaNotas(valor, notas);
  console.log("NOTAS:");
  notasCalculadas.forEach((nota, indice) => {
    console.log(`${nota} nota(s) de R$ ${notas[indice].toFixed(2)}`);
  });

  let moedasCalculadas = calculaMoedas(valor, moedas);
  console.log("MOEDAS:");
  moedasCalculadas.forEach((moeda, indice) => {
    console.log(`${moeda} moedas(s) de R$ ${moedas[indice].toFixed(2)}`)
  });
}

function calculaNotas(valor, notas) {
  let valorRestante = valor;
  let qtdNotas = [];

  notas.forEach(nota => {
    if (nota <= valorRestante) {
      let qtdNota = Math.floor(valorRestante / nota);
      valorRestante %= nota;
      qtdNotas.push(qtdNota.toFixed(0));
    } else {
      qtdNotas.push(0);
    }
  });

  return qtdNotas;
}

function calculaMoedas(valor, moedas) {
  let valorRestante = (valor % 5) % 2;
  let qtdMoedas = [];

  moedas.forEach(moeda => {
    if (moeda <= valorRestante) {
      let qtdMoeda = Math.floor(valorRestante / moeda);
      valorRestante %= moeda;
      qtdMoedas.push(qtdMoeda.toFixed(0));
    } else {
      qtdMoedas.push(0);
    }
  });

  return qtdMoedas;
}