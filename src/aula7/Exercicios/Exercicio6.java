package aula7.Exercicios;
import java.util.Scanner;

public class Exercicio6 {
    public static boolean verificarPar(int numero) {
        return numero % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        boolean ehPar = verificarPar(num);
        System.out.println("O número é par? " + ehPar);

        scanner.close();
    }
}
