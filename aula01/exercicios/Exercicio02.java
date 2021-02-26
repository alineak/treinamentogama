package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1;

        System.out.println("Digite a primeira nota do aluno: ");
        nota1 = entrada.nextDouble();

        double nota2;

        System.out.println("Digite a segunda nota do aluno: ");
        nota2 = entrada.nextDouble();

        double media = (nota1 + nota2)/2;

        System.out.println("A média é: " + media);

        entrada.close();
    }
    
}
