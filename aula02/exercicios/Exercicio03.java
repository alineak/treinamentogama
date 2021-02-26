package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num1, num2;
        boolean comparacao;
        System.out.println("digite um número:");
        num1 = teclado.nextDouble();
        System.out.println("digite outro número:");
        num2 = teclado.nextDouble();

        comparacao = num1 > num2;

        if (comparacao == true) {
            System.out.println(num1);
            System.out.println(num2);
        } else {
            System.out.println(num2);
            System.out.println(num1);
        }

        teclado.close();
    }

}
