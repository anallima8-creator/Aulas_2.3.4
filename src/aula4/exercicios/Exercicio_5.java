package aula4.exercicios;

import java.util.Scanner;

public class Exercicio_5 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 5; i++){
            System.out.println("Digite a nota " + i +": ");
            soma += scanner.nextDouble();
        }

        double media = soma / 5;
        System.out.println("A média das notas é: " +media);

        scanner.close();
    }
}
