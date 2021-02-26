package uri;

import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros, par, positivo, negativo;

        par = 0;
        positivo = 0;
        negativo = 0;

        for (int i = 1; i < 6; i++) {
            numeros = entrada.nextInt();

            if (numeros % 2 == 0 ) {
                par++;
            } 
            if (numeros > 0 ) {
                positivo++;
            }
            if (numeros < 0 ) {
                negativo++;
            }
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println((5 - par) + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
        entrada.close();
    }
    
}
