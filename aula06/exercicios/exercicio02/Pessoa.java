package exercicios.exercicio02;

public abstract class Pessoa { // classe abstrata não pode gerar objeto, só serve como modelo para outras classes
    private String nome, telefone;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return nome + " : " + telefone;
    }

   // public String telefonar() {
     //   return "Discando";
        
    //}

    // public abstract void telefonar();         
}
