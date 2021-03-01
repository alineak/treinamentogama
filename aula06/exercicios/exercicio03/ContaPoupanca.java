package exercicios.exercicio03;

public class ContaPoupanca extends Conta {
    private static double taxaDeSaque; // atributo de classe, não de objeto (ou seja, valera para todos os objetos toda vez que alterar)

    public ContaPoupanca(int numero) {
        super(numero);
    }

    public static void setTaxaDeSaque(double taxa) {
        if (taxa > 0) {
            taxaDeSaque = taxa;
        }
    }

    @Override
    public boolean saque(double valor) {
        if ( getSaldo() >= taxaDeSaque + valor) {
            return super.saque(valor + taxaDeSaque);
        }
        return false;
    }
}
