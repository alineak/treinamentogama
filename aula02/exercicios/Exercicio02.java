package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Digite a nota 1: ");
        nota1 = teclado.nextDouble();
        System.out.println("Digite a nota 2: ");
        nota2 = teclado.nextDouble();

        media = (nota1 * 0.4 + nota2 * 0.6);

        if (media >= 6.0) {
            System.out.println("Aprovado");

        } else {
            System.out.println("Reprovado");
        }

        teclado.close();
    }

}
