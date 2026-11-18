package aula4.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_9 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100) + 1;
        int palpite = 0;
        int tentativas = 0;

        do {
            System.out.println("Adivinhe o número (1 a 100): ");
            palpite = scanner.nextInt();
            tentativas++;
            if (palpite < numeroSecreto){
                System.out.println("Tente outra vez. O número é menor!");
            } else if (palpite> numeroSecreto){
                System.out.println("Não foi dessa vez...o número é menor!");
            }
        } while (palpite!=numeroSecreto);


        System.out.println("Acertou!! Você descobriu o número secreto em" + tentativas + "tentativa(s). Parabéns!");

        scanner.close();
    }
}
