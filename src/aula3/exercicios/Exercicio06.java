package aula3.exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();


        if (nota >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (nota >= 5.0 && nota < 7.0) {
            System.out.println("Aluno de recuperação.");
        } else
            System.out.println("Aluno reprovado.");

        scanner.close();
    }
}

