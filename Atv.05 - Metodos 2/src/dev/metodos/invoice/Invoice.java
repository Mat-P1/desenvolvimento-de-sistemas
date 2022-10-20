package dev.metodos.invoice;

public class Invoice {
    private String numero, descricao;
    private int quantidadeComprada;
    private double preco;

    // Construtor com as variáveis de instância inicializadas

    public Invoice(String numero, String descricao, int quantidadeComprada, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        if(preco>0) {
            this.preco = preco;
        } else {
            this.preco = 0.0;
        }
        this.quantidadeComprada = Math.max(quantidadeComprada, 0);
}

    // Getters e Setters

    public String getNumero() {
        return this.numero;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public int getQuantidadeComprada() {
        return this.quantidadeComprada;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getInvoiceAmount() {
        double amount;
            if (this.quantidadeComprada < 0 || this.preco < 0) {
                amount = 0.0;
            } else {
                amount = this.quantidadeComprada * this.preco;
            }
        return amount;
    } // Método getter com cálculo do valor da fatura
}
