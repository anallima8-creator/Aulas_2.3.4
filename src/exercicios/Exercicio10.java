package exercicios;

public class Exercicio10 {
    public static void main(String[] args) {
        short numeroShort = 100;
        int numeroInt = numeroShort;
        byte numeroByte = (byte) numeroShort;

        System.out.println("Valor Short: " + numeroShort);
        System.out.println("Valor Int: " + numeroInt);
        System.out.println("Valor Byte: " + numeroByte);
    }
}