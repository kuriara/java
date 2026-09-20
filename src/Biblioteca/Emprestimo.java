package Biblioteca;

public class Emprestimo {

    Livro livro;
    Leitor leitor;
    Biblioteca biblioteca;
    double diasComLivro;
    boolean iniciado;
    boolean devolvido;

    public Emprestimo (Livro livro, Leitor leitor, Biblioteca biblioteca) {
        this.livro = livro;
        this.leitor = leitor;
        this.biblioteca = biblioteca;
        iniciado = false;
        devolvido = false;
    }

    boolean iniciar() {
        if (iniciado == false && livro.disponivel == true && leitor.podeEmprestar() == true) {
            iniciado = true;
            livro.disponivel = false;
            leitor.registrarEmprestimo();
            biblioteca.registrarSaida();
            return true;
        }
        return false;
    }

    double calcularMulta(double diasComLivro) {
        if (biblioteca.prazoDias - diasComLivro < 0) {
            return ((diasComLivro - biblioteca.prazoDias) * biblioteca.multaPorDia);
        }
        return 0;
    }

    boolean devolver(double diasComLivro) {
        if (iniciado == true && devolvido == false && biblioteca.prazoDias - diasComLivro > 0) {
            System.out.println("Multa: " + calcularMulta(diasComLivro));
            livro.disponivel = true;
            leitor.registrarDevolucao();
            biblioteca.registrarRetorno();
            devolvido = true;
            return true;
        }
        System.out.println("Multa: " + calcularMulta(diasComLivro));
        return false;
    }


}
