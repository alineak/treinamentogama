package exercicios.exercicio01;

public class Placar {
    private String time1, time2;
    private int gols1, gols2;

    public Placar() {
        this.time1 = "Time da casa";
        this.time2 = "Visitante";

    }

    public Placar(String time1, String time2) {
        // this.time1 = time1;
        // this.time2 = time2;
        this(time1, time2, 0, 0); // chama o construtor de 4 parametros
    }

    public Placar(String time1, String time2, int gols1, int gols2) {
        this.time1 = time1;
        this.time2 = time2;
        this.gols1 = gols1;
        this.gols2 = gols2;

    }

    @Override
    public String toString() {
        return time1 + " " + gols1 + " x " + time2 + " " + gols2;
        // public String exibir() {
        // return time1 + " " + gols1 + " x " + time2 + " " + gols2;
    }
}
