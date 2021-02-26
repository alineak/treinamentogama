package exemplos;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;

        do {
            System.err.println("Digite um numero menor que 10:");
            numero = entrada.nextInt();
        } while (numero >= 10);

        entrada.close();
    }
}
