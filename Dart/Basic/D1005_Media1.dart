import 'dart:io';

void main() {
  String? value1 = stdin.readLineSync();
  String? value2 = stdin.readLineSync();

  if (value1 == null && value2 == null) return;
  double? number1 = double.tryParse(value1!);
  double? number2 = double.tryParse(value2!);

  if (number1 != null && number2 != null) {
    if (number1 >= 0 && number1 <= 10 && number2 >= 0 && number2 <= 10) {
      String result = media1(number1, number2);
      print("MEDIA = $result");
    }
  }
}

String media1(double number1, double number2) {
  double result = ((number1 * 3.5) + (number2 * 7.5)) / 11;
  return result.toStringAsFixed(5);
}
