package Iniciante;


/**
 * Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 *
 * Entrada
 * O arquivo de entrada contém 4 valores inteiros.
 *
 * Saída
 * Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
 *
 * @author Joelyson David
 */
import java.io.IOException;
import java.util.Scanner;

public class Diferenca {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int a, b, c, d;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        int prodAB = a * b;
        int prodCD = c * d;
        int diferenca = prodAB - prodCD;
        System.out.println("DIFERENCA = " + diferenca);

    }
}
