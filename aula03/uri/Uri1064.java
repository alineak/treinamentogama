package uri;

import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numeros, media, totalPar;
        int pares;

        pares = 0;
        totalPar = 0;
        media = 0;

        for (int i = 1; i < 7; i++) {
            numeros = entrada.nextDouble();

            if (numeros >= 0) {
                totalPar += numeros;
                pares++;
                media = totalPar / pares;

            }
        }
        System.out.println(pares + " valores positivos");
        System.out.printf("%.1f\n", media);

        entrada.close();
    }

}
