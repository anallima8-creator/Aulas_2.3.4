package aula4.exercicios;

import java.util.Scanner;

public class Exercicio_4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        boolean ehPrimo = true;

        if (numero <= 1 ) {
            ehPrimo = false;
        }else {
            for (int i = 2; i <= numero / 2; i++){
                if (numero % i == 0){
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número é " + numero + " não é primo.");
        }
        scanner.close();
    }
}
