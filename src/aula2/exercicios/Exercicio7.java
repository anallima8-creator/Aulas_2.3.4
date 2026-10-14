package aula2.exercicios;

public class Exercicio7 {
    public static void main(String[] args) {

        boolean usuario_logado = true;
        boolean possui_permissao = false;
        boolean sistema_ativo = true;

        boolean pode_acessar = sistema_ativo && (usuario_logado || possui_permissao);

        if (pode_acessar) {
            System.out.println("Acesso garantido ao painel!");
        } else {
            System.out.println("Acesso negado. Verifique os dados ou o status do sistema.");
        }
    }
}

