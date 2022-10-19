package dev.classesatributos;

import java.time.Instant;

/* *
 * Crie uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa se ela é
 * especial ou não, um limite.
 */

public class ContaCorrente {
    String donoConta;
    String banco;
    String agencia;
    int idNumero;
    double saldo;
    String status;
    double limite;
    Instant dtCriacao;
}
