package aula2.exercicios;

public class Exercicio9 {
    public static void main(String[] args) {
        float numeroFloat = 10.75f;
        long numeroLong = (long) numeroFloat;
        double numeroDouble = numeroLong;

        System.out.println("Valor Float: " + numeroFloat);
        System.out.println("Valor Long: " + numeroLong);
        System.out.println("Valor Double: " + numeroDouble);
    }
}