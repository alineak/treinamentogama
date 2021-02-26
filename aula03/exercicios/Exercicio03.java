package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
        int num = entrada.nextInt();

        int cont = 1;
        while (cont <= num / 2) {
            System.out.print(cont + ", ");
            cont *= 2;
        }
        System.out.print(cont);

        entrada.close();
    }

}
