package aula7.Exercicios;

public class Exercicio4 {
    public static double converterCelsiusParaFahrenheit (double celsius) {
        return celsius * 1.8 + 32;
    }
    public static void main(String[] args) {
        double fahrenheit = converterCelsiusParaFahrenheit(25.0);
        System.out.println ("Temperatura em Fahrenheit:" + fahrenheit);
    }
}
