package dev.revisaologica;

import java.util.Scanner;

public class RevisaoLogica {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

 /* *
 * Questão 01:
 * O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos
 * (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever
 * um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.
 */

        System.out.print("Custo de fabricação: ");
        double custoFabricacao = input.nextDouble();

        System.out.printf("Custo final: %.2f\n", custoFabricacao + custoFabricacao * 0.28 + custoFabricacao * 0.45);

/* *
 * Questão 02:
 * Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário.
 * Calcular e escrever o total (quantidade adquirida * preço unitário), o desconto e o total a pagar (total - desconto),
 * sabendo-se que:
 * - Se quantidade <= 5 o desconto será de 2%
 * - Se quantidade > 5 e quantidade <=10 o desconto será de 3%
 * - Se quantidade > 10 o desconto será de 5%
 */

        System.out.print("\nNome do produto: ");
        String descricao = input.next();
        System.out.print("Quantidade adquirida: ");
        int quantidadeAdquirida = input.nextInt();
        System.out.print("Preço unitário: ");
        double precoUnitario = input.nextDouble();

        double total = quantidadeAdquirida * precoUnitario;

        System.out.printf("Produto: %s\tTotal: %.2f", descricao, total);

        double desconto;
        if (quantidadeAdquirida <= 5) {
            desconto = total * 0.02;
        } else if (quantidadeAdquirida <= 10) {
            desconto = total * 0.03;
        } else {
            desconto = total * 0.05;
        }

        System.out.printf("\nDesconto: %.2f\tTotal a pagar: %.2f\n", desconto, total - desconto);

/* *
 * Questão 03:
 * Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100, quantos estão entre 101 e 200
 * e quantos são maiores de 200.
 */

        int contagem = 0, contagem100 = 0, contagem200 = 0, contagemOver200 = 0;

        while (contagem < 20) {
            System.out.printf("Insira o %dº valor: ", contagem + 1);
            int numero = input.nextInt();

            if (numero <= 100) {
                contagem100++;
            } else if (numero <= 200) {
                contagem200++;
            } else {
                contagemOver200++;
            }

         contagem++;
        }

        System.out.printf(""" 
                Quantidade de números entre 0 e 100: %d
                Quantidade de números entre 101 e 200: %d
                Quantidade de números acima de 200: %d
                """, contagem100, contagem200, contagemOver200);

/* *
 * Questão 04:
 * Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números. Encerre a execução
 * quando um número negativo for digitado.
 */

        int somaNumero = 0, soma = 0;

        do {
            System.out.printf("Insira o %dº valor positivo: ", somaNumero + 1);
            somaNumero = input.nextInt();

                if (somaNumero >= 0) soma += somaNumero;

        } while (somaNumero >= 0);

        System.out.print("Soma dos valores positivos: "+soma);
    }
}
