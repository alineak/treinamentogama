package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senha;

        System.out.println("Informe a senha:");
        senha = entrada.nextLine();

        if (senha.equals("R10p5")) {
            System.out.println("acesso concedido");            
        } else {
            System.out.println("acesso negado");
        }

        entrada.close();
    }
    
}
