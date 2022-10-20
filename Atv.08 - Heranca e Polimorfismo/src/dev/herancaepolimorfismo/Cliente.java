package dev.herancaepolimorfismo;

// Subclasse de Pessoa

public class Cliente extends Pessoa {
    protected int codigo;

    public Cliente(String nome, int dia, int mes, int ano, int codigo) {
        super(nome, dia, mes, ano);
        this.codigo = codigo;
    } // Construtor

    @Override
    public String imprimeDados() {
        return String.format("Nome do cliente: %s\nData de Nascimento: %s\nCódigo: %d\n", nome, nascimento.getData(), this.codigo);
    } // Sobrepõe o método abstrato na Superclasse Pessoa
}
