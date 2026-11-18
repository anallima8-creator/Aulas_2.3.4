package aula5.exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = {"Lily", "Clarice", "Amanda"};

        System.out.println("Digite o nome que deseja fazer a verificação:");
        String nomeBusca = scanner.nextLine();

        boolean encontrado = false;


        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeBusca)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("O nome está presente no vetor!");
        } else {
            System.out.println( "O nome não está presente no vetor!");
        }
        scanner.close();
    }
}
