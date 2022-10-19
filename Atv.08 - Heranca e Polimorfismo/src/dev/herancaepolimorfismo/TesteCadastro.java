package dev.herancaepolimorfismo;

public class TesteCadastro {

    public static void main(String[] args) {
        // Inserindo dados

        // Criando 5 Pessoas diferentes

        Cliente cliente1 = new Cliente("Mateus",24,8,1995,1);
        Cliente cliente2 = new Cliente("Marlon", 30, 9, 1999, 2);
        Funcionario funcionario1 = new Funcionario("Davi",7,5,1990,1800);
        Funcionario funcionario2 = new Funcionario("José",10,12,1985,2800);
        Gerente gerente1 = new Gerente("Pedro",12,8,1953,3800,"vendas");

        // Criando um novo Cadastro

        CadastroPessoas cadastro = new CadastroPessoas();

        // Adicionando Pessoas ao cadastro

        cadastro.cadastraPessoa(cliente1);
        cadastro.cadastraPessoa(cliente2);
        cadastro.cadastraPessoa(funcionario1);
        cadastro.cadastraPessoa(funcionario2);
        cadastro.cadastraPessoa(gerente1);

        // Visualizando o cadastro completo

        cadastro.imprimeCadastro();
    }
}
