package exercicios.exercicio05;

public class Ebook { // classe criada para objeto Ebook
    private String titulo, autor; // atributos
    private int totalPaginas, paginaAtual;

    public Ebook( String titulo, String autor, int totalPaginas, int paginaAtual){ //construtor
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        irParaPagina(paginaAtual);
    }

    public int exibirPagina() {
        return paginaAtual;
    }

    public void mostrarCapa() {
        System.out.println("Capa: Título: " + titulo + " - Autor: " + autor + " - Qtde de páginas: " + totalPaginas);
    }

    public void avancarPagina() {
        if (paginaAtual == totalPaginas) {
            System.out.println("Você chegou ao fim");
        } else {
            System.out.println("Pagina: " + (paginaAtual+1));
            this.paginaAtual = paginaAtual + 1;
        }
    }
    
    public void retrocederPagina() {
        if (paginaAtual !=0) {
            System.out.println("Página: " + (paginaAtual-1));
            this.paginaAtual = paginaAtual - 1; 
            } else { 
                System.out.println("não foi possivel retroceder, você está na capa");
            }
    }

    public void irParaPagina(int paginaAtual) {
        if (paginaAtual >= 0 && paginaAtual <= totalPaginas) {
            this.paginaAtual = paginaAtual;
        } else {
            System.out.println("indique uma página dentro do livro.");
        }

    }

}
