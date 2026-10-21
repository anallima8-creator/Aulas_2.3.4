package aula4.exercicios;

public class Exercicio_2 {
    static void main(String[] args) {
    int numero = 2;
    int soma = 0;

    while (numero <= 100) {
        soma += numero;
        numero += 2;
    }
        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
    }
}
