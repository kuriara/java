package Biblioteca;

public class Leitor {

    int emprestimosAtivos;
    int limiteEmprestimos;

    public Leitor() {
        emprestimosAtivos = 0;
        limiteEmprestimos = 2;
    }

    boolean podeEmprestar(){
        if (emprestimosAtivos <= limiteEmprestimos) {
            return true;
        }
        return false;
    }

    void registrarEmprestimo() {
        if (podeEmprestar()) {
            emprestimosAtivos += 1;
        }
    }

    void registrarDevolucao() {
        if (emprestimosAtivos > 0) {
            emprestimosAtivos -= 1;
        }
    }

}
