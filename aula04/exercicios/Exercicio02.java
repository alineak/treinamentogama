package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int resultado, n1, n2, n3;

        System.out.println("digite 3 números inteiros:");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        n3 = entrada.nextInt();

        resultado = validaMenor(n1, n2, n3);

        System.out.println("o menor número é o " + resultado);

        entrada.close();
    }

    static int validaMenor(int num1, int num2, int num3) {
        int resposta;

        if (num1 >= num2 && num1 >= 3) {
            resposta = num1;
        } else {
            if (num2 >= num1 && num2 >= num3) {
                resposta = num2;
            } else {
                resposta = num3;
            }
        }
        return resposta;
    }
}
