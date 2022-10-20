package dev.poorevisao;

public class Automovel extends Veiculo implements Imposto {
    private String placa;

    public Automovel(String registroVeiculo, String proprietarioVeiculo, int ano, double valorVeiculo, String placa) {
        super(registroVeiculo, proprietarioVeiculo, ano, valorVeiculo);
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public void checkList() {
        System.out.printf("\nChecando o veículo %s...\nTudo okay para retirada!\n", super.registroVeiculo);
    }

    @Override
    public void adjust() {
        System.out.printf("\nMarcando o veículo %s para ajustes...\nConfirmado!\n", super.registroVeiculo);
    }

    @Override
    public void cleanup() {
        System.out.printf("\nMarcando o veículo %s para limpeza...\nConfirmado!\n", super.registroVeiculo);
    }

    @Override
    public double calcularImposto() {
        return this.valorVeiculo * 0.20;
    }

    public String toString() {
        return String.format("Proprietário: %s\tRegistro: %s\tPlaca: %s\tValor: %.2f\tImposto: %.2f",
                proprietarioVeiculo, registroVeiculo, placa, valorVeiculo, calcularImposto());
    }
}
