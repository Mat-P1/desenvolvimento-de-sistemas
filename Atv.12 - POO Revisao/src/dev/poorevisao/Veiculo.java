package dev.poorevisao;

public abstract class Veiculo {
    protected String registroVeiculo, proprietarioVeiculo;
    protected int ano;
    protected double valorVeiculo;
    
    public Veiculo(String registroVeiculo, String proprietarioVeiculo, int ano, double valorVeiculo) {
        this.registroVeiculo = registroVeiculo;
        this.proprietarioVeiculo = proprietarioVeiculo;
        this.ano = ano;
        this.valorVeiculo = valorVeiculo;
    }

    // MÉTODOS ABSTRATOS

    public abstract void checkList();

    public abstract void adjust();

    public abstract void cleanup();
}
