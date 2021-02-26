package uri;

import java.util.Scanner;

/**
 * Uri1003
 */
public class Uri1003 {

    public static void main(String[] args) {
        // 1. entrada
        Scanner teclado = new Scanner (System.in);
        int a, b, soma;

        a = teclado.nextInt();
        b = teclado.nextInt();

        // 2. processamento
        soma = a + b;
        // 3. saída
        System.out.println("SOMA = " + soma);

        teclado.close();
    }
}