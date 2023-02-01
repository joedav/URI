/**
 * Leia um valor inteiro, que é o tempo de duração em segundos de um determinado
 * evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

 * Entrada
 * O arquivo de entrada contém um valor inteiro N.

 * Saída
 * Imprima o tempo lido no arquivo de entrada (segundos),
 * convertido para horas:minutos:segundos, conforme exemplo fornecido.
 * 
 * mudar "prompt()" para "lines.shift()" quando passar para o URI
 */

const temp = parseInt(prompt());
conversaoTempo(temp);

function conversaoTempo (tempo) {
  let tempoI = tempo;
  let segundos = ((tempoI % 60));
  let minutos = Math.floor((tempoI / 60) % 60);
  let horas = Math.floor(((tempoI / 60) / 60)); //.toFixed(0);

  // console.log(minutos);
  // console.log(`${horas}:${minutos}:${segundos}`);
  console.log(horas + ":" + minutos + ":" + segundos);
}