package dev.relacionamentosentreclasses1;

public class Professor {
    private String nomeProfessor, departamento, email;

    // Construtores

    public Professor(String nomeProfessor, String departamento, String email) {
        this.nomeProfessor = nomeProfessor;
        this.departamento = departamento;
        this.email = email;
    }
    // MÉTODOS

    // Getters (Somente como demonstração. Não serão usados nesse exercício)

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getEmail() {
        return email;
    }

    // Setters (Somente como demonstração. Não serão usados nesse exercício)

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return String.format("Professor: %s\tDepartamento: %s\tE-mail: %s\n", nomeProfessor, departamento, email);
    }
}
