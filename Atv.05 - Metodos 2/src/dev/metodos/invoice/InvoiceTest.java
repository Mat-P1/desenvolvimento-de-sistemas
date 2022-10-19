package dev.metodos.invoice;

import java.util.Scanner;

/* *
 * Crie uma classe chamada Invoice para que uma loja de suprimentos de informática a utilize para representar uma fatura
 * de um item vendido nela. Uma Invoice (fatura) deve incluir quatro partes das informações como variáveis de instância:
 * o número (String), a descrição (String), a quantidade comprada de um item (int) e o preço por item (double).
 *
 * Sua classe deve ter um construtor que inicializa as quatro variáveis de instância.
 *
 * Forneça um método set e um get para cada variável de instância. Crie um método chamado getInvoiceAmount que calcula o
 * valor de fatura (quantidade * preço) e depois retorna esse valor como double.
 *
 * Se a quantidade não for positiva, ela deve ser configurada como 0. Se o preço por item não for positivo, ele deve ser
 * configurado como 0.0.
 *
 * Escreva um aplicativo de teste chamado InvoiceTest que demonstra as capacidades da classe Invoice.
 */

public class InvoiceTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Criando o objeto fatura

        Invoice fatura = new Invoice("0115", "Placa-mãe", 2, 1200);

        // Testando Métodos

        // Getters

        System.out.print("Código do produto: "+fatura.getNumero());
        System.out.print("\nDescrição do produto: "+fatura.getDescricao());
        System.out.print("\nQuantidade comprada: "+fatura.getQuantidadeComprada());
        System.out.print("\nPreço: "+fatura.getPreco());

        // Fatura

        System.out.print("\nValor da fatura: "+fatura.getInvoiceAmount());

        // Setters
        
        System.out.print("\nInserir código do produto: ");
        String numero = input.next();
        fatura.setNumero(numero);

        System.out.print("\nInserir descrição do produto: ");
        String descricao = input.next();
        fatura.setDescricao(descricao);

        System.out.print("\nInserir quantidade comprada: ");
        int quantidadeComprada = input.nextInt();
        fatura.setQuantidadeComprada(quantidadeComprada);

        System.out.print("\nInserir preço: ");
        double preco = input.nextDouble();
        fatura.setPreco(preco);

        //Fatura

        System.out.print("\nValor da fatura: "+fatura.getInvoiceAmount());
    }
}
