/* *
 * Escreva uma classe para representar um Curso, que tem nome e horário. Cada curso tem um Professor, que possui nome,
 * departamento e email. Cada curso também pode ter vários alunos(tipo Aluno). Cada Aluno tem nome, matricula e 4 notas.
 * Escreva um programa teste que crie um curso com 5 alunos, e que peça para o usuário entrar com as 4 notas de cada
 * aluno. Ao final, imprima a média de cada aluno, se o mesmo está aprovado(média maior ou igual a 7).
 */

package dev.relacionamentosentreclasses1;

import java.time.LocalTime;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        Aluno[] alunos = new Aluno[5];
        double[] notas = new double[4];

        Curso curso = new Curso("Java POO", LocalTime.of(8, 30)); // Instanciação do objeto curso

        Professor professor = new Professor("Davi Saldanha", "Desenvolvimento de Sistemas",
                "davi@email.com"); // Instanciação do objeto professor com todos os atributos

        curso.setProfessor(professor); // invocando o atributo professor em Curso para gravar os dados acima

        for (int i = 0; i < alunos.length; i++) {
            Aluno aluno = new Aluno();
            double[] nota = new double[4];

            System.out.printf("Inserir o nome do %dº aluno: ", i+1);
            String alunoNome = input.next();
            aluno.setNomeAluno(alunoNome);

            System.out.printf("Inserir a matricula do %dº aluno: ", i+1);
            String matricula = input.next();
            aluno.setMatricula(matricula);

            for (int j = 0; j < notas.length; j++) {
                System.out.printf("Inserir %dº nota do %dº aluno: ", j+1, i+1);
                nota[j] = input.nextDouble();
                aluno.setNotas(nota);
            }
            alunos[i] = aluno;
        } // Inserindo informações sobre os alunos do curso

        curso.setAlunos(alunos); // invocando o atributo aluno em Curso para gravar os dados acima

        System.out.print(curso); // Imprimindo informações
    }
}