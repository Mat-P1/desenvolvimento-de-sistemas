package dev.metodos.employee;

import java.util.Scanner;

public class EmployeeTest {

/* *
 * Crie uma classe Employee que inclua três variáveis de instância: um primeiro nome (String), um sobrenome (String) e
 * um salário mensal (double). Forneça um construtor que inicializa as três variáveis. Forneça um método set e um get
 * para cada variável. Se o salário mensal não for positivo, não configure seu valor. Escreva um aplicativo de teste
 * chamado EmployeeTest que demonstre as capacidades da classe Employee.
 *
 * Crie dois objetos Employee e exiba o salário anual de cada objeto. Então dê a cada Employee um aumento de 10% e exiba
 * novamente o salário anual de cada Employee.
 */

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        // Criando os objetos empregado 1 e 2

        Employee employee1 = new Employee("José", "Carvalho", 2000);
        Employee employee2 = new Employee(" ", " ", 5000);

        // Testando getters and setters

        System.out.print("Primeiro nome: ");
        String primeiroNome = input.next();
        employee2.setPrimeiroNome(primeiroNome);

        System.out.print("\nSegundo nome: ");
        String segundoNome = input.next();
        employee2.setSegundoNome(segundoNome);

        System.out.printf("Nome: %s %s", employee1.getPrimeiroNome(), employee1.getSegundoNome());
        System.out.printf("\t// Salário anual: %.1f", employee1.getSalarioMensal() * 12);

        System.out.printf("\nNome: %s %s", employee2.getPrimeiroNome(), employee2.getSegundoNome());
        System.out.printf("\t// Salário anual: %.1f", employee2.getSalarioMensal() * 12);

        // Inserindo 10% de aumento

        double salario1 = employee1.getSalarioMensal()*1.10;
        double salario2 = employee2.getSalarioMensal()*1.10;

        employee1.setSalarioMensal(salario1);
        employee2.setSalarioMensal(salario2);

        System.out.printf("\nSalário anual com aumento (Employee 1): %.1f", employee1.getSalarioMensal() * 12);
        System.out.printf("\nSalário anual com aumento (Employee 2): %.1f", employee2.getSalarioMensal() * 12);
    }
}
