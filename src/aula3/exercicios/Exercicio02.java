package aula3.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = scanner.nextDouble();
        double valorFinal;


        if (valorCompra > 100.0) {
            double desconto = valorCompra * 0.10;
            valorFinal = valorCompra - desconto;
            System.out.println("Desconto de 10% aplicado!");
        } else {
            valorFinal = valorCompra;
            System.out.println("Nenhum desconto foi aplicado...");
        }

        System.out.println("Valor final da compra: " + valorFinal);

        scanner.close();
    }
}

