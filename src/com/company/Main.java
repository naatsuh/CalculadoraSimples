package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double n1;
        double n2;
        String verificarOperacao;

        Operacoes operacoes = new Operacoes();
        Scanner teclado= new Scanner(System.in);
        Scanner tecladoString = new Scanner(System.in);


        System.out.println("Digite um número");
        n1 = teclado.nextDouble();

        System.out.println("Digite o segundo número");
        n2 = teclado.nextDouble();

        System.out.println("Escolha a operação");
        verificarOperacao = tecladoString.nextLine();

        if( verificarOperacao.equals("+")){

            System.out.println(n1 + " " + verificarOperacao +" "+ n2 +" = "+  operacoes.Somar(n1, n2) );

        } if (verificarOperacao.equals( "-")){
            System.out.println(n1 + " " + verificarOperacao +" "+ n2 +" = "+   operacoes.Subtrair(n1, n2) );

        } if (verificarOperacao.equals("*") ){
            System.out.println(n1 + " " + verificarOperacao +" "+ n2 +" = "+   operacoes.multiplicar(n1, n2) );

        } if (verificarOperacao.equals("/")){
            System.out.println(n1 + " " + verificarOperacao +" "+ n2 +" = "+   operacoes.dividir(n1, n2) );


        }


    }
}
