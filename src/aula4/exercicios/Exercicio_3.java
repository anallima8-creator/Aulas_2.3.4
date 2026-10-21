package aula4.exercicios;

import java.util.Scanner;

public class Exercicio_3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo para calcular o fatorial: ");
        int numeroOriginal = scanner.nextInt();

        long fatorial = 1;
        int i = numeroOriginal;

        do{
            if (numeroOriginal == 0 || numeroOriginal == 1) {
                break;
            }
            fatorial *= i;
            i--;
        } while (i >1);

        System.out.println("O fatorial de " + numeroOriginal + " é: " +fatorial);
        scanner.close();
    }
}
