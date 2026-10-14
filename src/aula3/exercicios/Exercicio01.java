package aula3.exercicios;

import java.util.Scanner;

public class Exercicio01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a sua idade: ");
            int idade = scanner.nextInt();


            if (idade >= 18) {
                System.out.println("Acesso permitido.");
            } else {
                System.out.println("Acesso negado.");
            }

            scanner.close();
        }
    }

