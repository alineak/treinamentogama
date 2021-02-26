package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, par, impar;

        par = 0;
        impar = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %dº número: ", i);
            num = entrada.nextInt();
            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }

        }
        System.out.printf("O total de pares é: %d\n", par);
        System.out.printf("O total de impares é: %d\n", impar);

        entrada.close();
    }

}
