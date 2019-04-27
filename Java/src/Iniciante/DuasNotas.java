package Iniciante;

/**
 * Gilberto é um famoso vendedor de esfirras na região. Porém, apesar de todos
 * gostarem de suas esfirras, ele só sabe dar o troco com duas notas, ou seja,
 * nem sempre é possível receber o troco certo. Para facilitar a vida de Gil,
 * escreva um programa para ele que determine se é possível ou não devolver o
 * troco exato utilizando duas notas.
 *
 * As notas disponíveis são: 2, 5, 10, 20, 50 e 100.
 *
 * Entrada A entrada deve conter o valor inteiro N da compra realizada pelo
 * cliente e, em seguida, o valor inteiro M pago pelo cliente (N < M ≤ 104). A
 * entrada termina com N = M = 0.
 *
 * Saída Seu programa deverá imprimir "possible" se for possível devolver o
 * troco exato ou "impossible" se não for possível.
 *
 * @author Joelyson David
 */
import java.io.IOException;
import java.util.Scanner;

public class DuasNotas {

    // método booleano ´passando dois parametros n = valorProduto m = pagoPeloCliente
    public static boolean result(int n, int m) { 
        int notas = 0; // variavel para contar a qtd de notas
        int deve = m - n; // valor pago - valor do produto = troco
        // enquanto a variavel deve for maior que 0
        while (deve > 0) {
            if (deve >= 100) {
                deve -= 100;
                notas++;
            }
            if (deve >= 50) {
                deve -= 50;
                notas++;
            }
            if (deve >= 20) {
                deve -= 20;
                notas++;
            }
            if (deve >= 10) {
                deve -= 10;
                notas++;
            }
            if (deve >= 5) {
                deve -= 5;
                notas++;
            }
            if (deve >= 2) {
                deve -= 2;
                notas++;
            } else {
                break;
            }
        }
        // se tudo isso aconter e for possivel eu pagar com apenas 2 notas retorna true
        if (notas == 2) {
            return true;
        } else { // caso contrario false
            return false;
        }
    }

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in); // objeto Scanner para leitura do teclado
        // variaveis iniciais para entrada de dados
        int n, m;
        // variavel resultado para obter true ou false através do retorno do método
        boolean resultado = false;

        do {
            // entrada de dados
            n = input.nextInt();
            m = input.nextInt();
            // chama o metodo
            resultado = result(n, m);
            // se resultado for true
            if (resultado == true) {
                System.out.println("possible");
            } else if (n == 0 && m == 0) {
                break;
            } else {
                System.out.println("impossible");
            }
        } while (n != 0 && m != 0);

    }

}
