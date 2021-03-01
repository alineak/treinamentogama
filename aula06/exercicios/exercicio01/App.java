package exercicios.exercicio01;

public class App {
    public static void main(String[] args) {
        Placar construtor1 = new Placar();
        Placar construtor2 = new Placar("Palmeiras", "Santos");
        Placar construtor3 = new Placar("Palmeiras", "Santos", 1, 0);

        System.out.println(construtor1);
        System.out.println(construtor2);
        System.out.println(construtor3);
        // System.out.println(construtor1.exibir);
        // System.out.println(construtor2.exibir);
        // System.out.println(construtor3.exibir);
    }
}
