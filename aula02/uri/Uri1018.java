package uri;

import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, nota100, sobra100, nota50, sobra50, nota20, sobra20, nota10, sobra10, nota5, sobra5, nota2, sobra2, nota1;

        num = entrada.nextInt();
        if (0 < num && num < 1000000) {
            nota100 = num /100;
            sobra100 = num % 100;
            nota50 = sobra100 / 50;
            sobra50 = sobra100 % 50;
            nota20 = sobra50 / 20;
            sobra20 = sobra50 % 20;
            nota10 = sobra20 / 10;
            sobra10 = sobra20 % 10;
            nota5 = sobra10 / 5;
            sobra5 = sobra10 % 5;
            nota2 = sobra5 / 2;
            sobra2 = sobra5 % 2;
            nota1 = sobra2 / 1;

            System.out.printf("%d nota(s) de R$ 100,00\n", nota100);
            System.out.printf("%d nota(s) de R$ 50,00\n", nota50);
            System.out.printf("%d nota(s) de R$ 20,00\n", nota20);
            System.out.printf("%d nota(s) de R$ 10,00\n", nota10);
            System.out.printf("%d nota(s) de R$ 5,00\n", nota5);
            System.out.printf("%d nota(s) de R$ 2,00\n", nota2);
            System.out.printf("%d nota(s) de R$ 1,00\n", nota1);
            
        }
        entrada.close();
    }
    
}
