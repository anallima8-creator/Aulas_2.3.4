package aula4.exercicios;

public class Exercicio_6 {
    static void main(String[] args) {
        int termo1 = 0;
        int termo2 = 1;
        int contador = 1;


        System.out.println("Os 10 primeiros números da sequência de Fibonacci são: ");

        while (contador <= 10) {
            System.out.println(termo1 + " ");

            int proximoTermo = termo1 + termo2;
            termo1 = termo2;
            termo2 = proximoTermo;

            contador++;
        }
        System.out.println();
    }
}
