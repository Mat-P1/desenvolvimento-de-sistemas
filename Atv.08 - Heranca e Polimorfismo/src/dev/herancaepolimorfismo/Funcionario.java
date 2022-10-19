package dev.herancaepolimorfismo;

// Subclasse de Pessoa
// Superclasse de Gerente

public class Funcionario extends Pessoa {
    protected float salario;

    // Construtores

    public Funcionario(String nome, int dia, int mes, int ano, float salario) {
        super(nome, dia, mes, ano);
        this.salario = salario;
    }

    // MÉTODOS

    // Calcular Imposto

    public float calcularImposto () {
        return (float) (this.salario * 0.03);
    }  // A subclasse gerente sobrepõe esse método se o método Gerente.calcularImposto() for invocado

    // Método para imprimir dados

    @Override
    public String imprimeDados() {
        return String.format("""
                        Nome do funcionário: %s
                        Data de Nascimento: %s
                        Salário: %.2f
                        Imposto: %.2f
                        Salário líquido %.2f
                        """, nome, nascimento.getData(), salario, calcularImposto(), salario - calcularImposto());
    } // A subclasse gerente sobrepõe esse método se o método Gerente.imprimeDados() for invocado
}
