package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioMinimo, qtdeKw, valorKw;
        System.out.println("Informe o valor do salário mínimo: ");
        salarioMinimo = entrada.nextDouble();
        
        System.out.println("Informe a quantidade de quilowatts: ");
        qtdeKw = entrada.nextDouble();

        valorKw = salarioMinimo/500;

        System.out.println("O valor, em reais, de cada quiowatt é R$" + valorKw);
        System.out.println("O valor, em reais, a ser pago por essa residência é R$" + valorKw*qtdeKw);
        System.out.println("O valor, em reais, a ser pago com desconto de 15% é R$" + valorKw*qtdeKw*0.85);

        entrada.close();

    }
    
}
