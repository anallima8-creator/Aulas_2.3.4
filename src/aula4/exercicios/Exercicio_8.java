package aula4.exercicios;

import java.util.Scanner;

public class Exercicio_8 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "° número inteiro:");
            int numero = scanner.nextInt();

            if (numero % 2 == 0){
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("----Resultado:----");
        System.out.println("Quantidade de números pares:"+pares);
        System.out.println("Quantidade de números impares: " +impares);

        scanner.close();
    }
}
