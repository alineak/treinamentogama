package exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //int valor;
        char resposta;

        resposta = 's'; // um único caracter deve usar aspas simples.

        while (resposta == 's' || resposta == 'S') {
            System.out.println("Digite um número: ");
            //valor = Integer.parseInt(entrada.nextLine()); // o integer transforma a string em int, pois nextLine é para string.
            
            System.out.println("Quer continuar (S/N)?: ");
            resposta = entrada.nextLine().charAt(0); // charAt(0) lê o primeiro caracter da linah.
        }
        entrada.close();
    }

}
