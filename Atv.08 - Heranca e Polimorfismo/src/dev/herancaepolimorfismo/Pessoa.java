package dev.herancaepolimorfismo;

// Superclasse abstrata
// Superclasse indireta (Funcionario tem uma subclasse chamada Gerente)
// Subclasses: Cliente e Funcionario

public abstract class Pessoa {
    protected String nome;
    protected Data nascimento;

    // Construtores

    public Pessoa(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.nascimento = new Data(dia, mes, ano);
    }

    // MÉTODOS

    // Método abstract para imprimir dados

    public abstract String imprimeDados ();
    // Método será sobreposto por outros métodos em Cliente e Funcionario (polimorfismo)
}
