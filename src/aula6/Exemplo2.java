package aula6;

import java.util.Scanner;

public class Exemplo2 {

    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("""

                Escreva seu seus dados pessoais:

                    nome:""");

        String nome = scanner.next();

        System.out.printf(""" 

                \t Idade:""");

        int idade = scanner.nextInt();

        imprimirDadosPessoais(idade, nome);


    }

    public static void imprimirDadosPessoais(int idade, String nome) {

        System.out.println("Nome: " + nome);

        System.out.println("Idade: " + idade);

    }

}
 