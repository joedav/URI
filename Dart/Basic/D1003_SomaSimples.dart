import 'dart:async';
import 'dart:io';

void main() {
  String? value1 = stdin.readLineSync();
  String? value2 = stdin.readLineSync();

  if (value1 == null || value2 == null) return;

  int? number1 = int.tryParse(value1);
  int? number2 = int.tryParse(value2);

  if (number1 == null || number2 == null) return;
  int result = simpleSum(number1, number2);

  print("SOMA = $result");
}

int simpleSum(int number1, int number2) {
  return number1 + number2;
}
