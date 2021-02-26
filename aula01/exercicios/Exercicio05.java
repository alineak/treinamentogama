package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double valorFabrica, porcDistribuidor, impostos, valorTotal;

        System.out.println("Informe o valor do custo de fábrica do carro:");
        valorFabrica = entrada.nextDouble();
        porcDistribuidor = valorFabrica * 0.28;
        impostos = valorFabrica * 0.45;
        valorTotal = valorFabrica + porcDistribuidor + impostos;

        System.out.println("Custo do carro: R$" + valorTotal);
        System.out.println("Total de impostos: R$" + impostos);

        entrada.close();
    }
    
}
