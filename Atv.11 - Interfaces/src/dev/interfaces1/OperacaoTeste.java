/* *
 * Observe o diagrama em anexo e realiza as codificações necessárias.
 * A partir de dados fornecidos pelo usuário, a aplicação deve realizar uma operação matemática e imprimir o seu
 * resultado. Oferecer para o usuário um menu para a escolha entre as operações matemáticas disponíveis.
 *
 * Não defina a e b como atributos.
 * Implemente um construtor padrão para cada uma das classes.
 */

package dev.interfaces1;

import java.util.Scanner;

public class OperacaoTeste {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        // Criando os objetos Soma, Subtração, Multiplicação e Divisão

        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        // Criando menu

        int valor1, valor2, opcao;

        do {
            System.out.print("\nCalculadora\n[1] Soma\n[2] Subtração\n[3] Multiplicação\n[4] Divisão\n[5] Sair\n");
            opcao = input.nextInt();
            switch (opcao) {
                case 1 -> {
                    System.out.print("\n1º valor: ");
                    valor1 = input.nextInt();
                    System.out.print("2º valor: ");
                    valor2 = input.nextInt();
                    System.out.printf("\nResultado: %d + %d = %d", valor1, valor2, soma.calcula(valor1, valor2));
                }
                case 2 -> {
                    System.out.print("1º valor: ");
                    valor1 = input.nextInt();
                    System.out.print("2º valor: ");
                    valor2 = input.nextInt();
                    System.out.printf("\nResultado: %d - %d = %d", valor1, valor2, subtracao.calcula(valor1, valor2));
                }
                case 3 -> {
                    System.out.print("1º valor: ");
                    valor1 = input.nextInt();
                    System.out.print("2º valor: ");
                    valor2 = input.nextInt();
                    System.out.printf("\nResultado: %d * %d = %d", valor1, valor2, multiplicacao.calcula(valor1, valor2));
                }
                case 4 -> {
                    System.out.print("1º valor: ");
                    valor1 = input.nextInt();
                    System.out.print("2º valor: ");
                    valor2 = input.nextInt();
                    System.out.printf("\nResultado: %d / %d = %d", valor1, valor2, divisao.calcula(valor1, valor2));
                }
                case 5 -> System.out.print("Obrigado por usar nosso sistema.");
                default -> System.out.print("Escolha uma opção válida!");
            }
        }while (opcao != 5);
    }
}
