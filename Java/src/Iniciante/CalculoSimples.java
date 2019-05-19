package Iniciante;

/**
 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o
 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
 * o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
 *
 * Entrada O arquivo de entrada contém duas linhas de dados. Em cada linha
 * haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas
 * decimais.
 *
 * Saída A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo,
 * lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O
 * valor deverá ser apresentado com 2 casas após o ponto.
 *
 * @author Joelyson David
 */
import java.io.IOException;
import java.util.Scanner;

public class CalculoSimples {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        // variáveis
        int codigo, numPecas;
        double valor = 0, valorTotal = 0;
        int i = 1;
        while (i <= 2) {
            codigo = input.nextInt();
            numPecas = input.nextInt();
            valor = input.nextDouble();
            valorTotal += valor * numPecas;
            i++;
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
    }
}
