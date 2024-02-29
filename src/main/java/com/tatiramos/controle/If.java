package com.tatiramos.controle;

import java.util.Locale;
import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a média: ");
        double media = scan.nextDouble();

        if(media <= 10 && media >= 7.0) {
            System.out.println("Aprovado!");
            System.out.println("Parabéns!!");
        }

        if(media < 7 && media >= 4.5) {
            System.out.println("Recuperação");
        }

        if(media < 4.5 && media >= 0) {
            System.out.println("Reprovado");
        }
    }
}
