package com.company;

public class Soma implements Expressoes{

    private Expressoes esquerda;
    private Expressoes direita;

    public Soma(Expressoes esquerda, Expressoes direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public double avalia() {
        double valorDaEsquerda = esquerda.avalia();
        double valorDaDireita = direita.avalia();

        return valorDaEsquerda + valorDaDireita;
    }
}
