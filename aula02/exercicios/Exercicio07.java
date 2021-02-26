package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c;

        System.out.println("Informe 3 comprimentos:");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();

        if (a > b + c || b > a + c || c > a + b) {
            System.out.println("Não é um triângulo");
        } else {
            if (a == b && b == c) {
                System.out.println("Triângulo equilátero");

            } else {
                if (a == b || b == c || a == c) {

                    System.out.println("Triângulo isósceles");
                } else {
                    System.out.println("Triâgulo escaleno");
                }
            }
        }

        entrada.close();
    }

}
