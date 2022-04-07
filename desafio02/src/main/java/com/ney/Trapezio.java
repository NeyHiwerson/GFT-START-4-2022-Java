package com.ney;

public class Trapezio implements calculosGerais{
    int calculaTrapézio(int B, int b, int h){
        int baseMaior = B ;
        int baseMenor = b ;
        int altura = h ;
        int A = (((baseMaior + baseMenor) * altura) / 2);
        return A ;
    }

}
