package aula3.exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas trabalhadas:");
        int horasTrabalhadas = scanner.nextInt();

        double valorHoraNormal = 20.00;
        double valorHorasExtras = 0.0;

        if (horasTrabalhadas > 40) {
            int horasExtras = horasTrabalhadas - 40;
            valorHorasExtras = horasExtras * (valorHoraNormal * 1.5);
            System.out.println("O funcionário fez horas extras.");
        } else {
            System.out.println("O funcionário não fez horas extras.");
        }

        System.out.println("O valor pago pelas horas extras será:" + valorHorasExtras);
        scanner.close();

    }
}

