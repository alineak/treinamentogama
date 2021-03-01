package exercicios.exercicio03;

public class Conta {
    private int numero;
    private double saldo, valor, deposito, saque;

    public Conta(int numero) {
        this.numero = numero;
    }

    public boolean deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean saque(double valor) {
        if (valor > 0) {
            saldo -= valor;
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return "nº conta: " + numero + " / saldo: " + saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

}
