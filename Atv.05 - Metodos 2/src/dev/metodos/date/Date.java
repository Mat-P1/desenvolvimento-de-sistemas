package dev.metodos.date;

public class Date {

    // Variáveis de instância

    private int mes, dia, ano;

    // Construtor com as variáveis de instância inicializadas

    public Date (int dia, int mes, int ano) {

        if(dia>=1 && dia<31){
            this.dia = dia;
        }else {
            System.out.println("Dia Inválido!");
        }

        if(mes>=1 && mes<=12){
            this.mes = mes;
        }else {
            System.out.println("Mês Inválido!");
        }

        if(ano>0) {
            this.ano = ano;
        }else {
            System.out.println("Ano Inválido!");
        }

    }

    // Métodos

    // Setters

    public int getMes() {
        return mes;
    }
    public int getDia() {
        return dia;
    }
    public int getAno() {
        return ano;
    }

    // Setters

    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método para exibir mês, dia e ano

    public String displayDate() {
        return String.format("%d/%d/%d", this.dia, this.mes, this.ano);
    }

}
