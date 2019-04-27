
/**
 * Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno.
 * A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B
 * tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0,
 * sempre com uma casa decimal.
 *
 * Entrada
 * O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).
 *
 * Saída
 * Imprima a variável MEDIA conforme exemplo abaixo, com 1 dígito após o ponto
 * decimal e com um espaço em branco antes e depois da igualdade. Assim como
 * todos os problemas, não esqueça de imprimir o fim de linha após o resultado,
 * caso contrário, você receberá "Presentation Error".
 *
 * @author Joelyson David
 */
import java.io.IOException;
import java.util.Scanner;

public class Media2 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in); // objeto scanner para entrada de dados
        double a, b, c, media; // variaveis

        // solicita inserção de dados
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        // controle de peso das notas
        a = a * 2;
        b = b*3;
        c = c*5;
        // atribuinda a media
        media = (a+b+c) / 10;
        System.out.printf("MEDIA = %.1f\n", media);
    }
}
