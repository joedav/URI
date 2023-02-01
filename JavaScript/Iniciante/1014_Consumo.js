/*
 * Calcule o consumo médio de um automóvel sendo fornecidos 
 * a distância total percorrida (em Km) e o total de combustível gasto (em litros).

 * Entrada
 * O arquivo de entrada contém dois valores: um valor inteiro X representando
 * a distância total percorrida (em Km), e um valor real Y representando o total
 * de combustível gasto, com um dígito após o ponto decimal.

 * Saída
 * Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula,
 * seguido da mensagem "km/l".
 *
 * trocar "prompt()" por "lines.shift()" quando passar pro URI
 */

function consumo() {
  const distanciaPercorridaKM = parseInt(prompt());
  const combustivelGastoLT = parseFloat(prompt());

  // const distanciaPercorridaKM = parseInt(4554);
  // const combustivelGastoLT = parseFloat(464.6);

  const comsumoMedio = distanciaPercorridaKM / combustivelGastoLT;

  console.log(comsumoMedio.toFixed(3) + " km/l");
}

consumo();