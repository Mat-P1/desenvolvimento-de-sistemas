/* *
 * Escreva uma classe Agenda, que contém vários contatos do tipo Contato. Cada contato possui nome, telefone e email.
 * A agenda também possui um nome. Crie um programa teste que peça para o usuário entrar com o nome da Agenda e em
 * seguida 3 contatos. Crie métodos que retornem uma String com a informação de cada contato e também de todos os
 * contatos da Agenda.
 */

package dev.relacionamentoentreclasses2;

import java.util.Scanner;

public class AgendaTeste {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        // Criando objetos do tipo Agenda e Contato

        Agenda agenda = new Agenda();
        Contato[] contatos = new Contato[3];

        // Inserindo dados

        System.out.print("Insira o nome da agenda: ");
        String nomeAgenda = input.next();
        agenda.setNomeAgenda(nomeAgenda);

        for (int i = 0; i < contatos.length; i++) {
            Contato contato = new Contato();

            System.out.printf("\nInsira o nome do %dº contato: ", i+1);
            String nomeContato = input.next();
            contato.setNomeContato(nomeContato);

            System.out.printf("Insira o email do %dº contato: ", i+1);
            String email = input.next();
            contato.setEmail(email);

            System.out.printf("Insira o telefone do %dº contato: ", i+1);
            String telefone = input.next();
            contato.setTelefone(telefone);

            contatos[i] = contato;
        }

        agenda.setContatos(contatos);

        // Output de todos os dados inseridos

        System.out.print(agenda.getNomeAgenda());
        System.out.print(agenda.retornarContatos());
    }
}
