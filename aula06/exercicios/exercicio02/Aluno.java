package exercicios.exercicio02;

public class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, String telefone, String curso) {
        super(nome, telefone);
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + curso;
    }

    // public void telefonar() {


   // }
}
