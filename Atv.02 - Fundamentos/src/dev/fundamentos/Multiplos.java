package dev.fundamentos;

import java.util.Scanner;

public class Multiplos {

    public static void retornarMultiplos(int x, int n) {
        int[] Multiplos = new int [n];

        for (int i = 0; i < Multiplos.length; i++) {
            Multiplos[i] = x * (i+1);
        }

        System.out.printf("Os [%d] múltiplos de [%d] são: ", n, x);
        for (int j : Multiplos) {
            System.out.printf("[%d]", j);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

/* *
 * Crie uma função com dois argumentos que retornarão uma matriz dos primeiros n múltiplos de x. Suponha que tanto o
 * número dado quanto o número de vezes contados serão números positivos superiores a 0.
 */

        System.out.println("Múltiplos de X:");
        int x = input.nextInt();
        System.out.println("Quantidade de múltiplos de X:");
        int n = input.nextInt();

        retornarMultiplos(x, n);

    }
}
