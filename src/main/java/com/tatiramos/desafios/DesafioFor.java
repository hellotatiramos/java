package com.tatiramos.desafios;

public class DesafioFor {

    public static void main(String[] args) {

        String valor = "#";
        String target = "#####";

        for (; !valor.equals(target); valor += "#") {
            System.out.println(valor);
        }
        // Imprimir o valor final igual a target
        System.out.println(valor);

        // Não pode usar valor numérico para controlar o laço!
    }
}
