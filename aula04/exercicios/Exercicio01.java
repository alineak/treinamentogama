package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resultado;
        int valor;

        System.out.print("digite um número inteiro:");
        valor = entrada.nextInt();

        resultado = validaPar(valor);

        System.out.println(resultado);
        entrada.close();
    }

    static String validaPar(int numero) {

        String resposta;
        if (numero % 2 == 0) {
            resposta = "é par";
        } else {
            resposta = "é ímpar";
        }
        return resposta;
    }
}
