package dev.herancaepolimorfismo;

import java.util.ArrayList;

public class CadastroPessoas {
    protected int qtdAtual;
    protected ArrayList<Pessoa> cadastro = new ArrayList<>();

    // Construtores

    public CadastroPessoas () {}

    // MÉTODOS

    // Registrar os cadastros dentro do Array

    public void cadastraPessoa(Pessoa pess) {
        cadastro.add(pess);
        qtdAtual++;
    }

    // Visualizar os cadastros

    public void imprimeCadastro() {
        for (Pessoa pess : cadastro) {
            System.out.println(pess.imprimeDados());
        }
    }
}
