package dev.poorevisao;

public class Automovel extends Veiculo implements Imposto {
    private String placa;

    // Construtor

    public Automovel(String registroVeiculo, String proprietarioVeiculo, int ano, double valorVeiculo, String placa) {
        super(registroVeiculo, proprietarioVeiculo, ano, valorVeiculo);
        this.placa = placa;
    }

    // MÉTODOS

    // Getters e Setters

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // Métodos herdados da superclasse Veiculo

    @Override
    public void checkList() {
        System.out.printf("\nChecando o veículo %s...\nTudo okay para retirada!\n", super.registroVeiculo);
    } // Sobrepõe o método checkList() na superclasse Veiculo

    @Override
    public void adjust() {
        System.out.printf("\nMarcando veículo %s para ajustes...\nConfirmado!\n", super.registroVeiculo);
    } // Sobrepõe o método adjust() na superclasse Veiculo

    @Override
    public void cleanup() {
        System.out.printf("\nMarcando veículo %s para limpeza...\nConfirmado!\n", super.registroVeiculo);
    } // Sobrepõe o método cleanup() na superclasse Veiculo

    // Interface para calcular impostos

    @Override
    public double calcularImposto() {
        return this.valorVeiculo * 0.20;
    }

    // Método toString

    public String toString() {
        return String.format("Proprietário: %s\tRegistro: %s\tPlaca: %s\tValor: %.2f\tImposto: %.2f",
                proprietarioVeiculo, registroVeiculo, placa, valorVeiculo, calcularImposto());
    }
}
