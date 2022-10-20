package dev.herancaepolimorfismo;

// Subclasse de Funcionario

public class Gerente extends Funcionario {
    protected String area;

    public Gerente(String nome, int dia, int mes, int ano, float salario, String area) {
        super(nome, dia, mes, ano, salario);
        this.area = area;
    } // Construtor

    @Override
    public float calcularImposto() {
        return (float) (this.salario * 0.05);
    } // Sobrepõe o método calcularImposto() em Funcionario

    @Override
    public String imprimeDados() {
        return String.format("""
                        Nome do Gerente: %s
                        Área: %s
                        Data de Nascimento: %s
                        Salário: %.2f
                        Imposto: %.2f
                        Salário líquido %.2f
                        """, nome, area, nascimento.getData(), salario, calcularImposto(), salario - calcularImposto());
    } // Sobrepõe o método imprimeDados() em Funcionario
}
