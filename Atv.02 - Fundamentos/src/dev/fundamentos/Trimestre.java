package dev.fundamentos;

import java.util.Scanner;

public class Trimestre {

    static void mostrarTrimestre(int month) {
        switch (month) {
            case 1 -> System.out.print("Mês 1 (Janeiro), faz parte do primeiro trimestre");
            case 2 -> System.out.print("Mês 2 (Fevereiro), faz parte do primeiro trimestre");
            case 3 -> System.out.print("Mês 3 (Março), faz parte do primeiro trimestre");
            case 4 -> System.out.print("Mês 4 (Abril), faz parte do segundo trimestre");
            case 5 -> System.out.print("Mês 5 (Maio), faz parte do segundo trimestre");
            case 6 -> System.out.print("Mês 6 (Junho), faz parte do segundo trimestre");
            case 7 -> System.out.print("Mês 7 (Julho), faz parte do terceiro trimestre");
            case 8 -> System.out.print("Mês 8 (Agosto), faz parte do terceiro trimestre");
            case 9 -> System.out.print("Mês 9 (Setembro), faz parte do terceiro trimestre");
            case 10 -> System.out.print("Mês 10 (Outubro), faz parte do quarto trimestre");
            case 11 -> System.out.print("Mês 11 (Novembro), faz parte do quarto trimestre");
            case 12 -> System.out.print("Mês 12 (Dezembro), faz parte do quarto trimestre");
            default -> System.out.print("Mês inválido");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

/* *
 * Dado um mês como inteiro de 1 a 12, retorne ao qual trimestre ele pertence como um número inteiro. Por exemplo: mês 2
 * (fevereiro), faz parte do primeiro trimestre; mês 6 (junho), faz parte do segundo trimestre; e o mês 11 (novembro),
 * faz parte do quarto trimestre.
 */

        System.out.println("Inserir número referente a determinado mês do ano (ex: Janeiro = 1): ");
        int month = input.nextInt();

        mostrarTrimestre(month);
    }
}
