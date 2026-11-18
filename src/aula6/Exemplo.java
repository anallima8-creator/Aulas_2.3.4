package aula6;

import java.util.Scanner;

public class Exemplo {

    static void main(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado: ");

        int lado = scanner.nextInt();
 
 
        int areadoQuadrdo = CalcularArea(lado);

        System.out.println("Area do quadrado : "+areadoQuadrdo);
 
        System.out.printf("""

                            Escreva seu seus dados pessoais:

                                nome:""");
 
        String nome = scanner.next();

        System.out.printf("""

                            Idade:""");

        int idade = scanner.nextInt();
 
        imprimirDadosPessoais(idade, nome);
 
 
    }
 
    public static void imprimirDadosPessoais(int idade, String nome){

        System.out.println("Nome: "+nome);

        System.out.println("Idade: "+idade);

    }
 
    public static int CalcularArea(int lado){
 
        return lado*lado;

    }

}