/* *
 * 01. Crie as classes da imagem abaixo;
 * 02. Faça atributos e métodos;
 * 03. Faça 3 construtores;
 * 04. Faça gets, sets e toString;
 * 05. Observe se há uma relação de herança;
 * 06. Observe se há polimorfismo;
 * 07. Transforme veículo em uma classe abstrata;
 * 08. Crie um método abstrato;
 * 09. Crie uma interface para aplicar a esse exemplo;
 * 10. Adicione os abjetos a um vetor.
 */

package dev.poorevisao;

public class TesteRevisao {

    public static void main(String[] args) {

        Bicicleta bicicleta1 = new Bicicleta ("RE-1255", "David Silveira", 2020, 2500, "Profissional");
        Bicicleta bicicleta2 = new Bicicleta ("RE-1490", "Erick Saldanha", 2018, 1800, "Profissional");
        Automovel automovel1 = new Automovel ("RE-5520", "Carlos Henrique", 2015, 50000, "BR-9510556J");
        Automovel automovel2 = new Automovel ("RE-1560", "Josué Pinheiro", 2020, 85000, "BR-8815C132C");

        CadastroVeiculos cadastro = new CadastroVeiculos();

        cadastro.cadastrarVeiculo(bicicleta1);
        cadastro.cadastrarVeiculo(bicicleta2);
        cadastro.cadastrarVeiculo(automovel1);
        cadastro.cadastrarVeiculo(automovel2);

        cadastro.imprimeCadastro();

        bicicleta1.checkList();
        bicicleta1.adjust();
        bicicleta1.cleanup();

        automovel1.checkList();
        automovel1.adjust();
        automovel1.cleanup();
    }
}
