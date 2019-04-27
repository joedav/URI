package Iniciante;


/**
 * Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.
 *
 * Entrada
 * O arquivo de entrada contém 2 valores inteiros.
 *
 * Saída
 * Imprima a variável SOMA com todas as letras maiúsculas, com um espaço em branco antes e depois
 * da igualdade seguido pelo valor correspondente à soma de A e B. Como todos os problemas, não esqueça de imprimir
 * o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
 *
 * @author Joelyson David
 */
import java.io.IOException;
import java.util.Scanner;

public class SomaSimples {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int a;
        int b;

        a = input.nextInt();
        b = input.nextInt();

        int soma = a + b;

        System.out.println("SOMA = " + soma);
    }

}