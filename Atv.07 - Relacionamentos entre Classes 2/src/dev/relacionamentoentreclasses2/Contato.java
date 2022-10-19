package dev.relacionamentoentreclasses2;

public class Contato {
    private String nomeContato, email, telefone;

    // Construtores

    public Contato() {}

    // MÉTODOS

    // Setters

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String retornarContato() {
        return "\nNome: "+ this.nomeContato + "\nTelefone: " + this.telefone +
                "\nE-mail: " + this.email;
    } // Retorna os dados de um contato
}
