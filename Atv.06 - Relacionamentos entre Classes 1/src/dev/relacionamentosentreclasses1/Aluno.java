package dev.relacionamentosentreclasses1;

public class Aluno {
    private String nomeAluno, matricula;
    private double[] notas;

    // Construtores

    public Aluno() {}

    // MÉTODOS

    // Getters (Somente como demonstração. Não serão usados nesse exercício)

    public String getNomeAluno() {
        return nomeAluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    // Setters

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    // Calcular média dos alunos

    public double calcularMedia() {
        double media = 0;
        for (double nota : notas) {
            media += nota;
        }
        return media/4;
    }

    // Verificar situação da aprovação

    public boolean verificarSituacao() {
        return calcularMedia() >= 7;
    }

    // Conversão do resultado booleano

    public String converter(){
        String resultado;
        if(verificarSituacao()) {
            resultado = "APROVADO";
        } else {
            resultado = "REPROVADO";
        }
        return resultado;
    }

    // Imprimir informações

    public String toString() {
        return String.format("Aluno: %s\tMatrícula: %s\tMédia: %.2f\tSituação: %s\n", nomeAluno, matricula,
                calcularMedia(), converter());
    }
}
