package Biblioteca;

public class Biblioteca {

    String nome;
    int prazoDias;
    double multaPorDia;
    int emprestimosAtivos;

    public Biblioteca(String nome, int prazoDias, double multaPorDia) {
        this.nome = nome;
        this.prazoDias = prazoDias;
        this.multaPorDia = multaPorDia;
        emprestimosAtivos = 0;
    }

    void registrarSaida() {
        emprestimosAtivos += 1;
    }

    void registrarRetorno() {
        if (emprestimosAtivos >= 0) {
            emprestimosAtivos -= 1;
        }
    }

    void exibirDados() {
        System.out.println("Nome da biblioteca: " + nome);
        System.out.println("Prazo: " + prazoDias);
        System.out.println("Multa diária: " + multaPorDia);
        System.out.println("Total de empréstimos ativos: " + emprestimosAtivos);
    }

}
