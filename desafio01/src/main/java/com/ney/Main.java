package com.ney;

import java.applet.Applet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static javax.print.attribute.Size2DSyntax.MM;

public class Main {
    public static void main(String[] args) {

        SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy");
        Date y=new Date();
        System.out.println(sdf1.format(y));

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a data do nascimento da passoa 1: dd/mm/aaaa");
        String dataRecebida1 = scan.nextLine();
        System.out.println(dataRecebida1);

        System.out.println("Digite a data do nascimento da passoa 2: dd/mm/aaaa");
        String dataRecebida2 = scan.nextLine();
        System.out.println(dataRecebida2);


    }
}
