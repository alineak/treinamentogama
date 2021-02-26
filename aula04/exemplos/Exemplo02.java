package exemplos;

public class Exemplo02 {
    public static void main(String[] args) { // este método não retorna nada (void)
        int resultado;
        
        resultado = soma(10, 5);

        System.out.println("A soma é " + resultado);
    }
    
    static int soma(int valor1, int valor2){ // este método retorna um número inteiro
        int resposta;

        resposta = valor1 + valor2;

        return resposta; // return = termina a execução e devolve o valor.
    }
}
