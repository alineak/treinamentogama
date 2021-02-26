package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, cont;

        System.out.println("Digite um número");
        num = entrada.nextInt();

        cont = 0;
        while (cont < 11) {
           /**System.out.print(num + " x " + cont);
            total = num * cont;
            System.out.println(" = " + total);
            cont++;*/
            System.out.printf("%d x %02d = %2d\n", num, cont, num * cont);
            cont++;            
        }

        entrada.close();
    }

}
