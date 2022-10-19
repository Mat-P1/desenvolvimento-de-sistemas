/* *
 * Crie uma classe TesteArrayListNumero que possui um método main.
 * Dentro do main crie um ArrayList de Integer.
 * Adicione 10 números informados pelo usuário.
 * Se o usuário tiver digitado os números 10, 100 ou 1000 mostre uma mensagem informando que ele ganhou um bônus de R$ 50,00.
 */

package dev.estruturadedados1;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteArrayListNumero {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        // Criando o objeto ArrayList para armazenar os dados

        ArrayList<Integer> numeros = new ArrayList<>();

        // Estrutura de repetição para o usuário inserir os dados

        for (int i = 0; i < 10; i++) {
            System.out.printf("Insira o %dº número inteiro: ", i+1);
            int numero = input.nextInt();
            numeros.add(numero);
        }

        // Output caso usuário tiver digitado os números 10, 100 ou 1000

        if (numeros.contains(10) || numeros.contains(100) || numeros.contains(1000))
            System.out.print("Parabéns! Você acaba de ganhar um bônus de R$ 50,00!");
    }
}
