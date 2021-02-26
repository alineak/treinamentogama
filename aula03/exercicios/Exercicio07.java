package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double geralTurma = 0

        for (int contaTurma = 1; contaTurma < 3; contaTurma++) {
            
            geralTurma = geralTurma + mediaTurma / contaTurma
        double totalNota = 0;
        double mediaTurma = 0;

        for (int contaAluno = 1; contaAluno < 3; contaAluno++) {
            System.out.println("digite a nota do aluno:");
            double notaAluno = entrada.nextDouble();
            totalNota += notaAluno;
            mediaTurma = totalNota / contaAluno;
        }
    }
    System.out.println("A média da turma é " + mediaTurma);
    entrada.close();
}
    
}
