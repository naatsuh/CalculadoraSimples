package com.company;

public class Multiplicacao implements Expressoes{
    private Expressoes esquerda;
    private Expressoes direita;

    public Multiplicacao(Expressoes esquerda, Expressoes direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public double avalia() {
        double valorDaEsquerda = esquerda.avalia();
        double valorDaDireita = direita.avalia();
        return valorDaDireita * valorDaDireita;
    }
}
