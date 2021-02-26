package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, par, media, soma, porcentagem;
        final int QTDE_DE_NUMEROS = 9;

        par = 0;
        soma = 0;
        media = 0;

        for (int i = 1; i <= QTDE_DE_NUMEROS; i++) {
            System.out.println("Digite o " + i + "º número: ");
            num = entrada.nextInt();
            if (num % 2 == 0) {
                par++;
                soma = num + soma;
                media = (soma / par);
            }
        } if (par == 0) {
            System.out.println("Não foram declarados números pares");
            System.out.printf("A porcentagem de números ímpares é: 100%");
        } else {
        porcentagem = (QTDE_DE_NUMEROS - par);

        System.out.println("A média dos valores pares é: " + (double)media);
        System.out.printf("A porcentagem de números ímpares é: %.2f %%\n", (double)porcentagem * 100 / QTDE_DE_NUMEROS);
        entrada.close();
        }
    }

}
