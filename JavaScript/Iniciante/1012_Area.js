/* 
 * Escreva um programa que leia três valores com ponto flutuante de
 * dupla precisão: A, B e C. Em seguida, calcule e mostre:
 * a) a área do triângulo retângulo que tem A por base e C por altura.
 * b) a área do círculo de raio C. (pi = 3.14159)
 * c) a área do trapézio que tem A e B por bases e C por altura.
 * d) a área do quadrado que tem lado B.
 * e) a área do retângulo que tem lados A e B.

 * Entrada
 * O arquivo de entrada contém três valores com um dígito após o ponto decimal.

 * Saída
 * O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde
 * a uma das áreas descritas acima, sempre com mensagem * correspondente e um
 * espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado
 * com 3 dígitos após o ponto decimal. 
 *
 * Mudar "prompt()" para "lines.shift()" quando passar para o uri
 */

function areas() {
  const texto = prompt(); // le o texto
  const valores = texto.split(" "); // separa para um array
  const a = parseFloat(valores[0]);
  const b = parseFloat(valores[1]);
  const c = parseFloat(valores[2]);

  const triangulo = areaTriangulo(a, c);
  const circulo = areaCirculo(c);
  const trapezio = areaTrapezio(a, b, c);
  const quadrado = areaQuadrado(b);
  const retangulo = areaRetangulo(a, b);

  console.log("TRIANGULO: " + triangulo)
  console.log("CIRCULO: " + circulo);
  console.log("TRAPEZIO: " + trapezio);
  console.log("QUADRADO: " + quadrado)
  console.log("RETANGULO: " + retangulo);
}

function areaTriangulo(base, altura) {
  // base x altura / 2 = area do triangulo
  return ((base * altura) / 2).toFixed(3);
}

function areaCirculo(raio) {
  // PI x (raio²)
  return (3.14159 * (raio * raio)).toFixed(3);
}

function areaTrapezio(baseA, baseB, altura) {
  // soma das bases vezes altura dividido por 2
  return (((baseA + baseB) * altura) / 2).toFixed(3);
}

function areaQuadrado(lado) {
  // area do quadrado = lado²
  return (lado * lado).toFixed(3);
}

function areaRetangulo(ladoA, ladoB) {
  // ladoA x ladoB
  return (ladoA * ladoB).toFixed(3);
}

areas();