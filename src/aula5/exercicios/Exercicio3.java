package aula5.exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {


        boolean[] vetor = new boolean[8];

        Scanner teclado = new Scanner(System.in);
        int totalTrue = 0;


        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor (true/false): ");
            vetor[i] = teclado.nextBoolean();


            if (vetor[i] == true) {
                totalTrue++;
            }
        }


        System.out.println("Quantidade de valores true inseridos: " + totalTrue);

        teclado.close();
    }
}
