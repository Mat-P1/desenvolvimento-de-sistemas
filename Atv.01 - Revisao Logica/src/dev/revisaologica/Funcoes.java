package dev.revisaologica;

import java.util.Scanner;

public class Funcoes {

    static double calcularCustoConsumidor (double custoFabricacao) {
        return custoFabricacao + custoFabricacao * 0.28 + custoFabricacao * 0.45;
    }

    static double calcularTotal (int quantidadeAdquirida, double precoUnitario) {
        double totalFuncao;
        totalFuncao = quantidadeAdquirida * precoUnitario;
        return totalFuncao;
    }

    static double calcularDesconto (int quantidadeAdquirida, double precoUnitario) {

        double descontoFuncao;
        if (quantidadeAdquirida <= 5) {
            descontoFuncao = calcularTotal(quantidadeAdquirida, precoUnitario) * 0.02;
        } else if (quantidadeAdquirida <= 10) {
            descontoFuncao = calcularTotal(quantidadeAdquirida, precoUnitario) * 0.03;
        } else {
            descontoFuncao = calcularTotal(quantidadeAdquirida, precoUnitario) * 0.05;
        }
        return descontoFuncao;
    }

    static double calcularTotalConsumidor (int quantidadeAdquirida, double precoUnitario) {
        return calcularTotal(quantidadeAdquirida, precoUnitario) - calcularDesconto(quantidadeAdquirida, precoUnitario);

    }

    static void contarNumeros(int[] contaNumero) {

        int contagem100 = 0, contagem200 = 0, contagemOver200 = 0;

        for (int i : contaNumero) {
            if (i <= 100) {
                contagem100++;
            } else if (i <= 200) {
                contagem200++;
            } else {
                contagemOver200++;
            }
        }

        System.out.printf(""" 
                Quantidade de números entre 0 e 100: %d
                Quantidade de números entre 101 e 200: %d
                Quantidade de números acima de 200: %d
                """, contagem100, contagem200, contagemOver200);

    }

    static void somarNumeros () {
        Scanner input = new Scanner(System.in);

        int numeroFuncao = 0;
        int somaFuncao = 0;

        do {
            System.out.printf("Insira o %dº valor positivo: ", numeroFuncao + 1);
            numeroFuncao = input.nextInt();

            if (numeroFuncao >= 0) somaFuncao += numeroFuncao;

        } while (numeroFuncao >= 0);

        System.out.print("Soma dos valores positivos: "+somaFuncao);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* *
         * Questão 05:
         * Reescreva os códigos aplicando funções
         */

// Questão 01

        System.out.print("Custo de fabricação: ");
        double custoFabricacao = input.nextDouble();

        System.out.printf("Custo final: %.2f", calcularCustoConsumidor(custoFabricacao));

// Questão 02

        System.out.print("\nNome do produto: ");
        String descricao = input.next();
        System.out.print("Quantidade adquirida: ");
        int quantidadeAdquirida = input.nextInt();
        System.out.print("Preço unitário: ");
        double precoUnitario = input.nextDouble();

        System.out.printf("Produto: %s\tTotal: %.2f", descricao, calcularTotal(quantidadeAdquirida, precoUnitario));
        System.out.printf("\nDesconto: %.2f", calcularDesconto(quantidadeAdquirida, precoUnitario));
        System.out.printf("\tTotal a pagar: %.2f\n", calcularTotalConsumidor(quantidadeAdquirida, precoUnitario));

// Questão 03

        int[] contaNumero = new int[20];

        for (int i = 0; i < contaNumero.length; i++) {
            System.out.printf("Insira o %dº valor: ", i + 1);
            contaNumero[i] = input.nextInt();
        }

        contarNumeros(contaNumero);

// Questão 04

        somarNumeros();
    }
}

