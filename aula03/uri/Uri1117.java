package uri;

import java.util.Scanner;

public class Uri1117 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;
        int qtdeNotas, somaNotas

        nota = entrada.nextInt();
qtdeNotas = 0;
somaNotas = 0;
        while (nota >= 0 || nota <= 10) {
            qtdeNotas++;
            somaNotas += nota;
        }
        entrada.close();
    }
}
