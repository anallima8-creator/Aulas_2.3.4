package aula4.exercicios;

import java.util.Scanner;

public class Exercicio_7 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        do {
            System.out.println("Digite uma nota de 0 a 10:");
            nota = scanner.nextDouble();
        if (nota < 0 || nota > 10){
            System.out.println("Nota Inválida...tente novamente.");
            }

        } while (nota < 0 || nota > 10);


        System.out.println("Nota válida inserida: " +nota);

        scanner.close();
    }
}
