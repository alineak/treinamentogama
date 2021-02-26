package exercicios.exercicio03;

public class Veiculo {
    private String modelo, marca;
    private double consumo;

    public Veiculo (String modelo, String marca, double consumo){
        this.modelo = modelo; // this refere-se ao próprio objeto
        this.marca = marca;
        setConsumo(consumo);
    }

    public void apresentar() {
        System.out.println("modelo: " + modelo + " - " + marca);
        
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        if(consumo > 0){
            this.consumo = consumo;
        }
    }
}
