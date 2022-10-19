package dev.metodos;

import java.time.Instant;
import java.util.Scanner;

public class Interface {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        ContaCorrente newConta = new ContaCorrente("Mateus", 2000, Instant.now(), 25, 5000 );

        int contagem = 0;

        while (contagem != 4) {
            double valor;

            System.out.print("\nBANCO\n[1] Saldo\t[2] Depositar\n[3] Sacar\t[4] Sair\n");
            contagem = input.nextInt();

            switch (contagem) {

                case 1 -> System.out.print("Saldo: " + newConta.saldo);
                case 2 -> {
                    System.out.print("Valor do depósito: ");
                    valor = input.nextDouble();
                    newConta.depositar(valor);
                }
                case 3 -> {
                    System.out.print("Valor de saque: ");
                    valor = input.nextDouble();
                    newConta.sacar(valor);
                }
                case 4 -> System.out.print("Obrigado por usar nosso sistema!");
                default -> System.out.print("Opção inválida");

            }
        }
    }
}
