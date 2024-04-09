package com.tatiramos.desafios;
import java.util.Scanner;
public class DesafioWhile {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double total = 0;
            int contador = 0;

            System.out.println("Digite as notas de 0 a 10 (para sair, digite -1): ");
            double nota = scanner.nextDouble();

            while (nota != -1) {
                if (nota >= 0 && nota <= 10) {
                    total += nota;
                    contador++;
                } else {
                    System.out.println("Nota inválida. Digite novamente.");
                }

                nota = scanner.nextDouble();
            }

            if (contador > 0) {
                double media = total / contador;
                System.out.println("Total de notas digitadas: " + contador);
                System.out.println("Média das notas: " + media);
            } else {
                System.out.println("Nenhuma nota válida foi digitada.");
            }

        }
    }

