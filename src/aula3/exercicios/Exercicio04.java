package aula3.exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total das vendas: R$ ");
        double vendas = scanner.nextDouble();
        double taxaComissao;

        if (vendas < 1000.0) {
            taxaComissao = 0.05;
        } else if (vendas <= 5000.0) {
            taxaComissao = 0.10;
        } else {
            taxaComissao = 0.15;
        }

        double comissao = vendas * taxaComissao;

        System.out.println("Percentual aplicado:" + taxaComissao * 100);
        System.out.println("Valor de comissão a receber: " + comissao);
        scanner.close();

    }
}

