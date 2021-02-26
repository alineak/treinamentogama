package exemplos;

/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
        System.out.println("Programa de cadastro v. 1.1.2");
        linha2(30); // chamada de método
        System.out.println("Bom dia!");
        linha();

        linha3(30, '*');
        
    }

    static void linha() {
        System.out.println("---------------------");
    }

    static void linha2(int tamanho) { // tamanho recebe 25

        for(int i = 0; i < tamanho; i++){
            System.out.print("-");
        }
        System.out.println();
    }

    static void linha3(int tamanho, char tipo) { // tamanho recebe 25

        for(int i = 0; i < tamanho; i++){
            System.out.print(tipo);
        }
        System.out.println();
    }
}