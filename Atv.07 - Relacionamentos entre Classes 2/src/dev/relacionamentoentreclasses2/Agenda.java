package dev.relacionamentoentreclasses2;

public class Agenda {
    private String nomeAgenda;
    private Contato[] contatos;

    // Construtores

    public Agenda() {}

    // MÉTODOS

    // Getters

    public String getNomeAgenda() {
        return nomeAgenda;
    }

    // Setters

    public void setNomeAgenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String retornarContatos() {
        StringBuilder info = new StringBuilder();
        for (Contato contato : contatos) {
            info.append(contato.retornarContato());
        }
        return info.toString();
    } // Retorna os dados de todos os contatos auxiliado pelo método retornarContato() em Contatos
}
