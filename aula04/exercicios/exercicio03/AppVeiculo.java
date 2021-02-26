package exercicios.exercicio03;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("vectra", "chevrolet", 15);

        veiculo.apresentar();

        veiculo.setConsumo(-5);

        System.out.printf("Consumo: %.2f km/l\n" , veiculo.getConsumo());
    }
}
