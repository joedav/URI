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
notasEMoedas(576.73)
notasEMoedas(4.0)
notasEMoedas(91.01)
notasEMoedas(91.1)
notasEMoedas(276.82)

var input = require('fs').readFileSync('/dev/stdin', 'utf8')
var lines = input.split('\n')
const entrada = lines.shift()
notasEMoedas(entrada)

function notasEMoedas(valorInformado) {
  if (
    valorInformado === null ||
    valorInformado === '' ||
    typeof valorInformado !== 'number'
  )
    return

  const valor = parseFloat(valorInformado)

  if (valor <= 0.0 || valor >= 1000000.0) return

  const notaMoeda = valor.toString().split('.')
  const nota = notaMoeda[0]
  const moeda = notaMoeda[1]

  const notas = [100.0, 50.0, 20.0, 10.0, 5.0, 2.0]
  const moedas = [1.0, 0.5, 0.25, 0.1, 0.05, 0.01]

  let moedasCalculadas = calculaMoedas(moeda, moedas)
  let notasCalculadas = calculaNotas(nota, notas, moedasCalculadas)

  console.log('NOTAS:')
  notasCalculadas.forEach((nota, indice) => {
    console.log(`${nota} nota(s) de R$ ${notas[indice].toFixed(2)}`)
  })

  console.log('MOEDAS:')
  moedasCalculadas.forEach((moeda, indice) => {
    console.log(`${moeda} moeda(s) de R$ ${moedas[indice].toFixed(2)}`)
  })
}

function calculaNotas(valor, notas, moedas) {
  let valorRestante = valor
  let qtdNotas = []

  notas.forEach((nota) => {
    if (nota <= valorRestante) {
      let qtdNota = Math.floor(valorRestante / nota)
      valorRestante = parseFloat(valorRestante % nota).toFixed(2)
      qtdNotas.push(qtdNota)
    } else {
      qtdNotas.push(0)
    }
  })

  if (valorRestante > 0) {
    moedas[0] = parseInt(valorRestante)
  }

  return qtdNotas
}

function calculaMoedas(valor, moedas) {
  let valorRestante = parseFloat(`00.${valor}`)
  let qtdMoedas = []

  moedas.forEach((moeda) => {
    if (moeda <= valorRestante) {
      let qtdMoeda = Math.floor(valorRestante / moeda)
      valorRestante = (valorRestante % moeda)
      qtdMoedas.push(qtdMoeda)
    } else {
      qtdMoedas.push(0)
    }
  })

  return qtdMoedas
}
