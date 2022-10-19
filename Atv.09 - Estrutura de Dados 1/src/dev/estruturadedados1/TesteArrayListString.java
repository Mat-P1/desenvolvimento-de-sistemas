/* *
 * Crie uma classe TesteArrayListString que possui um método main.
 * Dentro do main crie um ArrayList de String (lista1).
 * Adicione 10 Strings informadas pelo usuário.
 * Percorra a lista verificando se o usuário digitou alguma String com menos de 3 caracteres. Em caso positivo, adicione
 * essa String em outra lista que você vai criar (lista2).
 * Utilizando o método removeAll, remova todos os elementos dessa segunda lista (lista2) da lista principal (lista1).
 * No final imprima a quantidade de Strings da lista.
 */

package dev.estruturadedados1;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteArrayListString {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        // Criando os objetos ArrayList para armazenar os dados

        ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();

        // Estrutura de repetição para o usuário inserir os dados

        for (int i = 0; i < 10; i++) {
            System.out.printf("Insira uma palavra contendo um ou mais caracteres [%d]: ", i+1);
            String string = input.next();
            lista1.add(string);
        }

        // Percorrendo a lista1 para verificar a quantidade de caracteres das palavras e adicionando a lista2

        for (int i = 0; i < 10; i++) {
            if(lista1.get(i).length() < 3) {
                lista2.add(lista1.get(i));
            }
        }

        // Removendo palavras idênticas em lista1

        lista1.removeAll(lista2);

        // Imprimindo o tamanho das listas.

        System.out.printf("---Tamanho das listas---\nLista 1: %s\nLista 2: %d", lista1.size(), lista2.size());

    }
}
