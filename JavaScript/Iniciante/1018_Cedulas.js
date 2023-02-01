/**
 * Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis
 * (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de
 * 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

 * Entrada
 * O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

 * Saída
 * Imprima o valor lido e, em seguida, a quantidade mínima de notas
 * de cada tipo necessárias, conforme o exemplo fornecido. Não esqueça
 * de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a
 * 
 * Mudar "prompt()" para "lines.shift()" quando madar para o URI
 */



// const valor = parseInt(prompt());
const cedulas = [100, 50, 20, 10, 5, 2, 1];

cedula(576);

function cedula(valor) {
  if (valor > 0 && valor < 1000000) {
    const x = valor;
    const qtdNotas = [];
    for (let i = 0; i < cedulas.length; i++) {
      let qtd = 0;
      let val = cedulas[i];
      while (valor >= val) {
        qtd++;
        val += cedulas[i];
      }
      valor %= cedulas[i];
      qtdNotas.push(qtd);
    }
    console.log(x);
    for (let i = 0; i < cedulas.length; i++) {
      console.log(qtdNotas[i] + " nota(s) de R$ " + cedulas[i] + ",00");
    }
  }
}


function cedula2(valor) {
  if (valor > 0 && valor < 1000000) {
    let qtdNotas;
    const x = valor;

    qtdNotas = cedulas.map(nota => {
      let i = nota;
      let qtd = 0;
      for (i; i <= valor; i += nota) {
        qtd++;
      }
      valor %= nota;
      return qtd;
    });
    console.log(x);
    for (let i = 0; i < cedulas.length; i++) {
      console.log(`${qtdNotas[i]} notas(s) de ${cedulas[i]}`);
    }
  }
}
cedula2(576);

// forma mais curta que consegui
function cedula3(valor) {
  if (valor > 0 && valor < 1000000) {
    let qtdNotas;
    const x = valor;

    qtdNotas = cedulas.map(nota => {
      let qtd = Math.floor(valor / nota);
      valor %= nota;
      return qtd;
    });
    console.log(x);
    for (let i = 0; i < cedulas.length; i++) {
      console.log(`${qtdNotas[i]} notas(s) de ${cedulas[i]}`);
    }
  }
}
cedula3(576);