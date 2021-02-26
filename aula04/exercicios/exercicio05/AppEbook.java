package exercicios.exercicio05;

public class AppEbook {
    public static void main(String[] args) {
        Ebook ebook = new Ebook("Dom Quixote", "Miguel de Cervantes", 637, 0);

        ebook.avancarPagina();

        ebook.retrocederPagina();

        ebook.irParaPagina(10);
                
        ebook.exibirPagina();
        System.out.println("Página atual: " + ebook.exibirPagina());

        ebook.mostrarCapa();
    }
}
