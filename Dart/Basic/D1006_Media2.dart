import 'dart:io';

void main(List<String> args) {
  double notaA = double.tryParse(stdin.readLineSync().toString()) ?? -1;
  double notaB = double.tryParse(stdin.readLineSync().toString()) ?? -1;
  double notaC = double.tryParse(stdin.readLineSync().toString()) ?? -1;

  if (notasSaoValidas(notaA, notaB, notaC)) {
    final media = media2(notaA, notaB, notaC);
    print('MEDIA = ${media.toStringAsFixed(1)}');
  }
}

bool notasSaoValidas(double notaA, double notaB, double notaC) {
  final notasMaioresIguais0 = notaA >= 0 && notaB >= 0 && notaC >= 0;
  final notasMenoresIguais10 = notaA <= 10 && notaB <= 10 && notaC <= 10;
  return notasMaioresIguais0 && notasMenoresIguais10;
}

double media2(double notaA, double notaB, double notaC) {
  final double pesoA = 2;
  final double pesoB = 3;
  final double pesoC = 5;

  var notaPesoA = (notaA * pesoA);
  var notaPesoB = (notaB * pesoB);
  var notaPesoC = (notaC * pesoC);
  double media = (notaPesoA + notaPesoB + notaPesoC) / 10;

  return media;
}
