package dev.relacionamentosentreclasses1;

import java.time.LocalTime;
import java.util.Arrays;

public class Curso {
    private String nomeCurso;
    private LocalTime horario;
    private Professor professor;
    private Aluno[] alunos;

    public Curso(String nomeCurso, LocalTime horario) {
        this.nomeCurso = nomeCurso;
        this.horario = horario;
    } // Construtor

    // Getters e Setters (Alguns são somente uma demonstração. Não serão usados nesse exercício)

    public String getNomeCurso() {
        return nomeCurso;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return String.format("\nCurso: %s\tHorário: %s\n%s\nAlunos\n%s\n", nomeCurso,
                horario, professor, Arrays.toString(alunos));
    } // Método toString para imprimir os valores inseridos nos objetos dessa classe
}
