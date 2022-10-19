package dev.herancaepolimorfismo;

// Classe usada como auxiliar para registro de datas

public class Data {
    protected int dia, mes, ano;

    // Construtor

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // MÉTODOS

    public String getData () {
        return dia+"/"+mes+"/"+ano;
    }
}
