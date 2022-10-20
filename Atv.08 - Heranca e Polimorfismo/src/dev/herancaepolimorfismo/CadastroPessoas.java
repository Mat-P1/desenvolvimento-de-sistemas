package dev.herancaepolimorfismo;

import java.util.ArrayList;

public class CadastroPessoas {
    protected int qtdAtual;
    protected ArrayList<Pessoa> cadastro = new ArrayList<>();

    public CadastroPessoas () {} // Construtor

    public void cadastraPessoa(Pessoa pess) {
        cadastro.add(pess);
        qtdAtual++;
    } // Registrar os dados dentro do Array

    public void imprimeCadastro() {
        for (Pessoa pess : cadastro) {
            System.out.println(pess.imprimeDados());
        }
    } // Visualizar o cadastro com todos os objetos inseridos
}
