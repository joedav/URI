import 'dart:io';

void main() {
  String? value1 = stdin.readLineSync();
  String? value2 = stdin.readLineSync();

  if (value1 == null || value2 == null) return;

  int n1 = int.parse(value1);
  int n2 = int.parse(value2);

  int result = basicSum(n1, n2);

  print("X = $result");
}

int basicSum(int a, int b) {
  return a + b;
}
