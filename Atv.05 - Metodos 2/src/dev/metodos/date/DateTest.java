package dev.metodos.date;

import java.util.Scanner;

/* *
 * Crie uma classe Date que inclua três variáveis de instância — mês (int), dia (int) e ano (int). Forneça um construtor
 * que inicializa as três variáveis de instância supondo que os valores fornecidos estejam corretos.
 *
 * Ofereça um método set e um get para cada variável. Apresente um método displayDate que exiba mês, dia e ano separados
 * por barras normais (/). Escreva um aplicativo de teste chamado DateTest que demonstre as capacidades da classe Date.
 */

public class DateTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Criando objeto date

        Date date1 = new Date(10,10,2022);

        // Testando métodos

        // Getters

        System.out.printf("Dia: [%d]\tMês: [%d]\tAno [%d]\n", date1.getDia(), date1.getMes(), date1.getAno());

        // Setters

        System.out.print("Inserir dia: ");
        int dia = input.nextInt();
        System.out.print("Inserir mês: ");
        int mes = input.nextInt();
        System.out.print("Inserir ano: ");
        int ano = input.nextInt();

        // Mostrar data

        System.out.print("Data: "+date1.displayDate());
    }
}
