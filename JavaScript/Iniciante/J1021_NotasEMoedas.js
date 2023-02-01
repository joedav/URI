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
 notasEMoedas2(576.73)
 console.log('======')
 notasEMoedas2(4.0)
 console.log('======')
 notasEMoedas2(91.01)
 console.log('======')
 notasEMoedas2(276.82)
 
 var input = require('fs').readFileSync('/dev/stdin', 'utf8')
 var lines = input.split('\n')
 const entrada = parseFloat(lines.shift())
 notasEMoedas2(entrada)
 
 function notasEMoedas2(entrada) {
   if (typeof entrada !== 'number') return
   if (entrada <= 0 || entrada >= 1000000.0) return
 
   let valor = parseFloat(entrada)
 
   const notas = [100, 50, 20, 10, 5, 2]
   const moedas = [1.0, 0.5, 0.25, 0.1, 0.05, 0.01]
 
   console.log('NOTAS:')
   notas.forEach((nota) => {
     if (valor >= nota) {
       let qtdNota = parseInt(Math.floor(valor / nota))
       valor = parseFloat(valor % nota).toFixed(2) // ou  Math.round((valor * 100.0) % nota) / 100
       mostraResultadoNotas(qtdNota, nota)
     } else {
       mostraResultadoNotas(0, nota)
     }
   })
 
   console.log('MOEDAS:')
   moedas.forEach((moeda) => {
     if (valor >= moeda) {
       let qtdMoeda = Math.floor(valor / moeda)
       valor = parseFloat(valor % moeda).toFixed(2)
       mostraResultadoMoedas(qtdMoeda, moeda)
     } else {
       mostraResultadoMoedas(0, moeda)
     }
   })
 }
 
 function mostraResultadoNotas(qtdNota, nota) {
   console.log(`${qtdNota} nota(s) de R$ ${nota.toFixed(2)}`)
 }
 
 function mostraResultadoMoedas(qtdMoeda, moeda) {
   console.log(`${qtdMoeda} moeda(s) de R$ ${moeda.toFixed(2)}`)
 }