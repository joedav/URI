/**
 * Leia um valor inteiro correspondente à idade de uma
 * pessoa em dias e informe-a em anos, meses e dias

 * Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias
 * e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que
 * permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um 
 * exercício com objetivo de testar raciocínio matemático simples.

 * Entrada
 * O arquivo de entrada contém um valor inteiro.

 * Saída
 * Imprima a saída conforme exemplo fornecido.
 * 
 * Lembre-se de trocar o "prompt()" por "lines.shift()" quando for mandar pro URI
 */


// let qtDias = parseInt(prompt());

idadeEmDias(qtDias);

function idadeEmDias(qtdDias) {
  let anos = Math.floor(qtdDias / 365);
  let meses = Math.floor((qtdDias % 365) / 30);
  let dias = (qtdDias % 365) % 30;

  console.log(anos + " ano(s)");
  console.log(meses + " mes(es)");
  console.log(dias + " dia(s)");
}
	