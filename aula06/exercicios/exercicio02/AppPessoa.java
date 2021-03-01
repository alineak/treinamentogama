package exercicios.exercicio02;

public class AppPessoa {
    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa("Aline", "123456789");
        Aluno a1 = new Aluno("Aline", "123456789" , "matemática");
        Professor prof1 = new Professor("Alberto", "987254363", 3000);

        // System.out.println(p1);
        System.out.println(a1);
        System.out.println(prof1);
    }
}
