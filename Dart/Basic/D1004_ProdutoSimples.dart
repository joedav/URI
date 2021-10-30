import 'dart:async';
import 'dart:io';

void main() {

  String? value1 = stdin.readLineSync();
  String? value2 = stdin.readLineSync();

  if(value1==null||value2==null) return;

  int? number1 = int.parse(value1);
  int? number2 = int.parse(value2);

  int result = simpleProduct(number1, number2);

  print("PROD = ${result}");

}

int simpleProduct(int number1, int number2) {
  return number1 * number2;
}
