package dev.estruturadedados2;

public class Conta implements Comparable<Conta> {
    protected double saldo;
    protected int id;

    // Construtor

    public Conta(double saldo, int id) {
        this.saldo = saldo;
        this.id = id;
    }

    // MÉTODOS

    @Override
    public int compareTo(Conta c) {
        return Double.compare(c.saldo, this.saldo);
    } // Método de comparação entre os valores dos saldos. Ordem decrescente.

    public String imprimirInfo () {
        return String.format("\nId: %d\tSaldo: %.2f", this.id, this.saldo);
    } // Método para impressão em uma lista organizada pelo método compareTo().
}
