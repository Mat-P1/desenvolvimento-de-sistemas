package dev.poorevisao;

import java.util.ArrayList;

public class CadastroVeiculos {
    protected final ArrayList<Veiculo> cadastro = new ArrayList<>();

    // Construtores

    public CadastroVeiculos() {}

    // Cadastrar

    public void cadastrarVeiculo (Veiculo cad) {
        cadastro.add(cad);
    }

    public void imprimeCadastro () {
        for (Veiculo cad : cadastro){
            System.out.println(cad);
        }
    }
}
