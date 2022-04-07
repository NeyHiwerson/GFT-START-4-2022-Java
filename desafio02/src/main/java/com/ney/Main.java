package com.ney;

import java.util.Scanner;

public class Main implements calculosGerais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int aTri, aR, aQ, aTra , b , h , L , B;
        System.out.println("Insira os valores para as figuras geométricas:");
        System.out.println("insira o valor da base:");
        b = scan.nextInt();
        System.out.println("insira o valor da altura:");
        h = scan.nextInt();
        System.out.println("Insira o valor do Lado:");
        L = scan.nextInt();
        System.out.println("Insira o valor da Base maior para o calculo do trapézio");
        B = scan.nextInt();


        System.out.println("A area do Triângulo é: " + aTri);
        System.out.println("A area do Retângulo é: " + aR);
        System.out.println("A area do Quadrado é: " + aQ);
        System.out.println("A area do Trapézio é: " + aTra);



    }
}
