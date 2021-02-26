package exemplos;

public class Exemplo04 {
    public static void main(String[] args) {
        int numeroInt;
        double numeroDouble;

        numeroInt = 12;
        numeroDouble = 10.5;

        numeroInt = (int) numeroDouble; // casting - coversão

        System.out.println(numeroInt);
        System.out.println(numeroDouble);
    }
    
}
