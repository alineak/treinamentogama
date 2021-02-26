package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, soma, cont;
        System.out.print("Digite o 1º número: ");

        soma = 0;
        cont = 1;
        num = entrada.nextInt();

        while (num != 0) {
            soma = soma + num;
            cont++;
            System.out.printf("Digite o %d º número: ", cont);
            num = entrada.nextInt();
        }

        System.out.println(soma);

        entrada.close();

    }
}
