package aula5.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    static void main(String[] args) {
        String[][] matriz = new String[3][3];
        matriz[0][0] = "a";
        matriz[0][1] = "b";
        matriz[0][2] = "c";

        matriz[1][0] = "d";
        matriz[1][1] = "e";
        matriz[1][2] = "f";

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String letraBuscada = teclado.nextLine();

        for(int linha = 0; linha < 2; linha++){
            for(int coluna = 0; coluna < 3; coluna++){

                if(matriz[linha][coluna].equals(letraBuscada)){
                    System.out.println("Encontrando na Linha: " + linha + " Coluna: " + coluna);
                }
            }
        }
        teclado.close();
    }
}
