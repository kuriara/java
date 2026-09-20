package Biblioteca;

public class Livro {

    String titulo;
    String autor;
    boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        disponivel = true;
    }

    void emprestar() {
        disponivel = false;
    }

    void devolver() {
        disponivel = true;
    }

    void exibirDados() {
        System.out.println("Título do livro: " + titulo);
        System.out.println("Autor do livro: " + autor);
        System.out.println("Disponível? " + disponivel);
    }

}
