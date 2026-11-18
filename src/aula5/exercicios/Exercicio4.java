package aula5.exercicios;

import java.util.Scanner;


public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];

        System.out.println("Digite as 4 notas do aluno:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < 4; i++) {
            soma = soma + notas[i];
        }

        double media = soma / 4;
        System.out.println("A média final do aluno é: " + media);
    }
}