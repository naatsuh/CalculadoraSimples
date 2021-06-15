package com.company;

public class Numero implements Expressoes{
    private double numero;
    //this: dessa classe
    public Numero(double numero){
        this.numero = numero;
    }

    @Override
    public double avalia() {
        return this.numero;
    }
}
