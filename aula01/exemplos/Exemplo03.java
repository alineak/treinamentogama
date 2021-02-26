package exemplos;

public class Exemplo03 {
    public static void main(String[] args) {
        // TIPO (ex: int) + nome [,nome2] (ex: numero)
        // warning é um aviso, é diferente de erro
        int numero; // declaração de uma variável integer com nome numero 

        numero = 10; // atribuição = guardar o valor na variável

        System.out.println("numero");
        System.out.println(numero);

        numero = 5; // sobrepoe o valor anterior
        System.out.println(numero);

        numero = 11 * 3;
        System.out.println(numero);

        System.out.println(numero + 2);
        System.out.println(numero);

        numero = numero + 2; // faz o cálculo e armazena na variável
        System.out.println(numero);
    }
}
