#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>

main()
{
	char valores[10];
	int a, b, c, maior;

	gets(valores);

	char *numero;
	numero = strtok(valores, " ");
	a = atoi(numero);
	numero = strtok(NULL, " ,");
	b = atoi(numero);
	numero = strtok(NULL, " ,");
	c = atoi(numero);
	numero = strtok(NULL, " ,");

	maior = ((a + b) + abs(a - b)) / 2;
	maior = ((maior + c) + abs(maior - c)) / 2;

	printf("%d eh o maior", maior);
}
