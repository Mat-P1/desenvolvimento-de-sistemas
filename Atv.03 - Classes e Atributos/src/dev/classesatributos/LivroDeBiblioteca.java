package dev.classesatributos;

import java.time.Instant;
import java.time.LocalDate;

/* *
 * Usando o resultado do modelo "Livro" como base, crie uma classe "Livro de Biblioteca" que represente os dados básicos
 * de um livro de uma biblioteca, que pode ser emprestado a leitores.
 */

public class LivroDeBiblioteca {
    int qtdParaAluguel;
    int idCopia;
    int idComprovanteAluguel;
    Instant dtAluguel;
    LocalDate dtDevolucao;
}
