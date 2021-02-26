package exercicios;

public class Exercicio01 {
    public static void main(String[] args) {
        int cont;
        final int LIMITE_DO_LACO = 201; // final torna a variável em uma constante. Por convensão, constante deve ser em caixa alta.

        cont = 100;
        
        while (cont < LIMITE_DO_LACO) {
            System.out.print(cont + " ");
            cont++;
        }

    }

}
