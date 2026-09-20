package Biblioteca;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("punpun", "inio asano");
        Leitor leitor1 = new Leitor();
        Biblioteca biblioteca1 = new Biblioteca("fip", 7, 2);
        Emprestimo emprestimo1 = new Emprestimo(livro1, leitor1, biblioteca1);

        emprestimo1.iniciar();

        emprestimo1.devolver(10);

    }
}
