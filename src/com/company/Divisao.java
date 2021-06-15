package com.company;

public class Divisao implements Expressoes{
    private Expressoes esquerda;
    private Expressoes direita;

    public Divisao(Expressoes esquerda, Expressoes direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public double avalia() {
        double valorDaEsquerda = esquerda.avalia();
        double valorDaDireita = direita.avalia();
        return valorDaEsquerda / valorDaDireita;
    }
}
