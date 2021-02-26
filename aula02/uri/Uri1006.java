package uri;

import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Double a, b, c, media;

        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        media = (2*a + 3*b + 5*c)/10;

        System.out.printf("MEDIA = %.1f\n", media);

        teclado.close();


    }
}
