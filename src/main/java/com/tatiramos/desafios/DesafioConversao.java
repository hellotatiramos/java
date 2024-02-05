package com.tatiramos.desafios;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro salário: ");
        String salario1 = scan.next().replace(",", ".");

        System.out.println("Informe o segundo salário: ");
        String salario2 = scan.next().replace(",", ".");

        System.out.println("Informe o terceiro salário: ");
        String salario3 = scan.next().replace(",", ".");

        double valor1 = Double.parseDouble(salario1);
        double valor2 = Double.parseDouble(salario2);
        double valor3 = Double.parseDouble(salario3);

        double media = (valor1+valor2+valor3) / 3;

        System.out.println("A média dos salários é: " + media);
    }
}
