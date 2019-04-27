package Iniciante;


/**
 * A fórmula para calcular a área de uma circunferência é: area = π . raio2.
 * Considerando para este problema que π = 3.14159:
 *
 * - Efetue o cálculo da área, elevando o valor de raio ao quadrado e
 * multiplicando por π.
 *
 * Entrada A entrada contém um valor de ponto flutuante (dupla precisão), no
 * caso, a variável raio.
 *
 * Saída Apresentar a mensagem "A=" seguido pelo valor da variável area,
 * conforme exemplo abaixo, com 4 casas após o ponto decimal. Utilize variáveis
 * de dupla precisão (double). Como todos os problemas, não esqueça de imprimir
 * o fim de linha após o resultado, caso contrário, você receberá "Presentation
 * Error".
 *
 * @author Joelyson David
 */
import java.io.IOException;
import java.util.Scanner;

public class AreaDoCírculo {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        double PI = 3.14159;
        double area, raio;

        raio = input.nextDouble();

        area = PI * (raio * raio);

        System.out.printf("A=%.4f\n", area);

    }

}
