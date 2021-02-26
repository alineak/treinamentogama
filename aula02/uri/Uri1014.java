package uri;

import java.util.Scanner;

public class Uri1014 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int distancia;
        double combustivel, consumoMedio;

        distancia = teclado.nextInt();
        combustivel = teclado.nextDouble();

        consumoMedio = distancia/combustivel;

        System.out.printf("%.3f km/l\n", consumoMedio);

        teclado.close();

    }
    
}
