package dev.herancaepolimorfismo;

/* *
 * Superclasse abstrata
 * Superclasse indireta (Funcionario tem uma subclasse chamada Gerente)
 *  Subclasses: Cliente e Funcionario
 */

public abstract class Pessoa {
    protected String nome;
    protected Data nascimento;

    public Pessoa(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.nascimento = new Data(dia, mes, ano);
    } // Construtor

    public abstract String imprimeDados ();
    /* *
     * Método abstract para imprimir dados
     * Método será sobreposto por outros métodos em Cliente e Funcionario (polimorfismo)
     */
}
