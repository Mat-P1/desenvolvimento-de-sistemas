package dev.herancaepolimorfismo;

/* *
 * Subclasse de Pessoa
 * Superclasse de Gerente
 */

public class Funcionario extends Pessoa {
    protected float salario;

    public Funcionario(String nome, int dia, int mes, int ano, float salario) {
        super(nome, dia, mes, ano);
        this.salario = salario;
    } // Construtor

    public float calcularImposto () {
        return (float) (this.salario * 0.03);
    } /* *
       * Métodos para calcular um imposto
       * A subclasse gerente sobrepõe esse método se o método calcularImposto() em Gerente for usado
       */

    @Override
    public String imprimeDados() {
        return String.format("""
                        Nome do funcionário: %s
                        Data de Nascimento: %s
                        Salário: %.2f
                        Imposto: %.2f
                        Salário líquido %.2f
                        """, nome, nascimento.getData(), salario, calcularImposto(), salario - calcularImposto());
    } /* *
       * Método usado para imprimir dados
       * A subclasse gerente sobrepõe esse método se o método imprimeDados() em gerente for usado
       */
}
