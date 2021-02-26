package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario;

        System.out.println("Informe o salário do colaborador:");
        salario = entrada.nextDouble();

        System.out.println("O salário com o aumento será: R$" + (salario*1.25));
        
        entrada.close();
    }
    
}
