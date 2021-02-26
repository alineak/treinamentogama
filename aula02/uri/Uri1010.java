package uri;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Double valor1, valor2, pagar;
        int codigo1, qtde1, codigo2, qtde2;

        codigo1 = teclado.nextInt();
        qtde1 = teclado.nextInt();
        valor1 = teclado.nextDouble();
        codigo2 = teclado.nextInt();
        qtde2 = teclado.nextInt();
        valor2 = teclado.nextDouble();

        pagar = qtde1 * valor1 + qtde2 * valor2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", pagar);

        teclado.close();
    }
}
