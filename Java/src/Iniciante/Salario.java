
/**
 * Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
 *
 * Entrada
 * O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.
 *
 * Saída
 * Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.
 *
 * @author Joelyson David
 */
import java.io.IOException;
import java.util.Scanner;

public class Salario {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int numFunc, horasTrab; // numero do funcionario e qtd de horas trabalhadas
        double valorHora, salario; // valor da hora e o salario

        // entradad de dados
        numFunc = input.nextInt();
        horasTrab = input.nextInt();
        valorHora = input.nextDouble();

        salario = valorHora * horasTrab; // calculo do salario
        System.out.printf("NUMBER = %d\nSALARY = %.2f\n", numFunc, salario);

    }
}
