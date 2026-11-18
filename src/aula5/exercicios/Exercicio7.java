package aula5.exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][3];
        int soma = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j];
            }
        }
        System.out.println(" A soma de todos os valores da matriz é:" + soma);

        scanner.close();

    }

}