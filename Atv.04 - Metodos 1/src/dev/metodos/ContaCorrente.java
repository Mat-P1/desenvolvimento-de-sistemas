package dev.metodos;

import java.time.Instant;

public class ContaCorrente {
    String nome;
    double saldo;
    Instant dtCriacao;
    int idade;
    double salario;

    public ContaCorrente (String nome, double saldo, Instant dtCriacao, int idade, double salario) {
        this.nome = nome;
        this.saldo = saldo;
        this.dtCriacao = dtCriacao;
        this.idade = idade;
        this.salario = salario;
    }

    void depositar (double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }else {
            System.out.print("Insira um valor válido");
        }
    }

    void sacar(double valor) {
        if (valor > this.saldo || valor < 0) {
            System.out.print("Valor acima do saldo/inválido");
        }else {
            this.saldo -= valor;
        }
    }
}
