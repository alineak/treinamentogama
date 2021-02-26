package uri;

import java.util.Scanner;

public class Uri1037 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor;

        valor = entrada.nextDouble();

        boolean int1 = (valor >= 0 && valor <= 25);
        boolean int2 = (valor > 25 && valor <= 50);
        boolean int3 = (valor > 50 && valor <= 75);
        boolean int4 = (valor > 75 && valor <= 100);

        if (int1) {
            System.out.println("Intervalo (0,25]");

        } else {
            if (int2) {
                System.out.println("Intervalo (25,50]");
            } else {
                if (int3) {
                    System.out.println("Intervalo (50,75]");
                } else {
                    if (int4) {
                        System.out.println("Intervalo (75,100]");
                    } else {
                        System.out.println("Fora de intervalo");
                    }
                }
            }
        }

        entrada.close();
    }

}
