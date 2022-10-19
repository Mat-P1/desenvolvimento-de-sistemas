package dev.metodos.employee;

public class Employee {

    // Variáveis de instância

    private String primeiroNome, segundoNome;
    private double salarioMensal;

    // Construtor com as variáveis de instância inicializadas

    public Employee (String primeiroNome, String segundoNome, double salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        if(salarioMensal > 0){
            this.salarioMensal = salarioMensal;
        }else{
            this.salarioMensal = 0.0;
        }
    }

    // Métodos

    // Getters

    public String getPrimeiroNome () {
        return this.primeiroNome;
    }

    public String getSegundoNome () {
        return this.segundoNome;
    }

    public double getSalarioMensal () {
        return this.salarioMensal;
    }

    // Setters

    public void setPrimeiroNome(String primeiroNome){
        this.primeiroNome = primeiroNome;
    }

    public void setSegundoNome (String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public void setSalarioMensal (double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
