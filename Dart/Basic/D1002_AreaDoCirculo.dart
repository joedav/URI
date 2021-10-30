import 'dart:io';

main() {
  double raio = 0.0;

  String? value = stdin.readLineSync();

  if (value != null) {
    raio = areaCirculo(double.parse(value));

    print("A=${raio.toStringAsFixed(4)}");
  }
}

double areaCirculo(double raio) {
  double area =  (raio * raio) * 3.14159;

  return area;
}
