package dev.relacionamentosentreclasses1;

public class Aluno {
    private String nomeAluno, matricula;
    private double[] notas;

    public Aluno() {} // Construtor

    // Getters e Setters (Somente como demonstração. Não serão usados nesse exercício).

    public String getNomeAluno() {
        return nomeAluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        double media = 0;
        for (double nota : notas) {
            media += nota;
        }
        return media/4;
    } // Calcular média dos alunos

    public boolean verificarSituacao() {
        return calcularMedia() >= 7;
    } // Verificar situação da aprovação

    public String converter(){
        String resultado;
        if(verificarSituacao()) {
            resultado = "APROVADO";
        } else {
            resultado = "REPROVADO";
        }
        return resultado;
    } // Conversão do resultado booleano para os Strings "Aprovado" ou "Reprovado"

    public String toString() {
        return String.format("Aluno: %s\tMatrícula: %s\tMédia: %.2f\tSituação: %s\n", nomeAluno, matricula,
                calcularMedia(), converter());
    } // Imprimir informações
}
