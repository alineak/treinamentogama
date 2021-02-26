package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, prestacao, maximo;

        System.out.println("informe o valor do salário:");
        salario = entrada.nextDouble();
        System.out.println("informe o valor da prestação:");
        prestacao = entrada.nextDouble();

        maximo = salario * 0.3;

        boolean comparacao;
        comparacao = prestacao <= maximo;

        if (comparacao == true) {
            System.out.println("Emprestimo concedido");
        } else {
            System.out.println("Emprestimo negado");
        }

        entrada.close();
    }

}
