package aula7.Exercicios;
import java.util.Scanner;
public class Exercicio7 {

        public static int maiorNumero(int a, int b, int c) {
            int maior = a;
            if (b > maior) {
                maior = b;
            }
            if (c > maior) {
                maior = c;
            }
            return maior;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o primeiro número: ");
            int n1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int n2 = scanner.nextInt();

            System.out.print("Digite o terceiro número: ");
            int n3 = scanner.nextInt();

            int resultado = maiorNumero(n1, n2, n3);
            System.out.println("O maior número é: " + resultado);

            scanner.close();
        }
    }

