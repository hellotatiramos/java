package com.tatiramos;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String texto = "";
        do {
            System.out.println("Você precisa falar as palavras mágicas: ");
            System.out.println("Quer sair?");
            texto = scan.nextLine();
        } while (!texto.equalsIgnoreCase("por favor"));

        System.out.println("Obrigada!");
    }
}
