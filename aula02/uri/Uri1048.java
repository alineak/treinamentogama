package uri;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario;
        boolean faixa1, faixa2, faixa3, faixa4, faixa5;

        salario = entrada.nextDouble();

        faixa1 = (salario <= 400);
        faixa2 = (salario >= 400.01 && salario <= 800.00);
        faixa3 = (salario >= 800.01 && salario <= 1200.00);
        faixa4 = (salario >= 1200.01 && salario <= 2000.00);
        faixa5 = (salario > 2000);

        if (faixa1) {
            double salarioNovo1, reajuste1;
            salarioNovo1 = salario * 1.15;
            reajuste1 = salario * 0.15;

            System.out.printf("Novo salario: %.2f\n", salarioNovo1);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste1);
            System.out.println("Em percentual: 15 %");
        } else {
            if (faixa2) {
                double salarioNovo2, reajuste2;
                salarioNovo2 = salario * 1.12;
                reajuste2 = salario * 0.12;

                System.out.printf("Novo salario: %.2f\n", salarioNovo2);
                System.out.printf("Reajuste ganho: %.2f\n", reajuste2);
                System.out.println("Em percentual: 12 %");
            } else {
                if (faixa3) {
                    double salarioNovo3, reajuste3;
                    salarioNovo3 = salario * 1.1;
                    reajuste3 = salario * 0.1;

                    System.out.printf("Novo salario: %.2f\n", salarioNovo3);
                    System.out.printf("Reajuste ganho: %.2f\n", reajuste3);
                    System.out.println("Em percentual: 10 %");
                } else {
                    if (faixa4) {
                        double salarioNovo4, reajuste4;
                        salarioNovo4 = salario * 1.07;
                        reajuste4 = salario * 0.07;

                        System.out.printf("Novo salario: %.2f\n", salarioNovo4);
                        System.out.printf("Reajuste ganho: %.2f\n", reajuste4);
                        System.out.println("Em percentual: 7 %");
                    } else {
                        if (faixa5) {
                            double salarioNovo5, reajuste5;
                            salarioNovo5 = salario * 1.12;
                            reajuste5 = salario * 0.04;

                            System.out.printf("Novo salario: %.2f\n", salarioNovo5);
                            System.out.printf("Reajuste ganho: %.2f\n", reajuste5);
                            System.out.println("Em percentual: 4 %");
                        }
                    }
                }
            }
        }
        entrada.close();
    }
}
