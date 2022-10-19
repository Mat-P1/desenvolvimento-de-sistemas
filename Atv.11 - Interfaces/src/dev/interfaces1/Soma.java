package dev.interfaces1;

public class Soma implements OperacaoMatematica {

    public Soma () {}

    @Override
    public int calcula(int a, int b) {
        return a + b;
    }
}
