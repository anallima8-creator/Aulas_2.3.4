package aula7.Exercicios;

public class Exercicio5 {
    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3.0;
    }
    public static void main(String[] args) {
        double mediaFinal = calcularMedia(8.5, 7.0, 9.5);
        System.out.println("A média do aluno é: " + mediaFinal);
    }
}