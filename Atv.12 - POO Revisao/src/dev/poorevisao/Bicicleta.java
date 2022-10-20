package dev.poorevisao;

public class Bicicleta extends Veiculo implements Imposto {
    private String tipoBicicleta;

    public Bicicleta(String registroVeiculo, String proprietarioVeiculo, int ano, double valorVeiculo, String tipoBicicleta) {
        super(registroVeiculo, proprietarioVeiculo, ano, valorVeiculo);
        this.tipoBicicleta = tipoBicicleta;
    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }

    // Métodos herdados da superclasse Veiculo

    @Override
    public void checkList() {
        System.out.printf("\nChecando o veículo %s...\nTudo okay para retirada!\n", super.registroVeiculo);
    }

    @Override
    public void adjust() {
        System.out.printf("\nMarcando veículo %s para ajustes...\nConfirmado!\n", super.registroVeiculo);
    }

    @Override
    public void cleanup() {
        System.out.printf("\nMarcando veículo %s para limpeza...\nConfirmado!\n", super.registroVeiculo);
    }

    @Override
    public double calcularImposto() {
        return this.valorVeiculo * 0.10;
    }

    public String toString() {
        return String.format("Proprietário: %s\tRegistro: %s\tTipo: %s\tValor: %.2f\tImposto: %.2f",
                proprietarioVeiculo, registroVeiculo, tipoBicicleta, valorVeiculo, calcularImposto());
    }
}
