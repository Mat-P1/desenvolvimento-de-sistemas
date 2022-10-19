package dev.interfaces1;

public class Multiplicacao implements OperacaoMatematica{

    public Multiplicacao() {}

    @Override
    public int calcula(int a, int b) {
        return a * b;
    }
}
