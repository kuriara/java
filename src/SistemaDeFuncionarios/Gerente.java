package SistemaDeFuncionarios;

public class Gerente extends Funcionario {

    private String setor;

    public Gerente(String nome, double salarioBase, String setor) {
        super(nome, salarioBase);
        this.setor = setor;
    }

    void realizarReuniao() {
        System.out.println("REUNIÃO COM " + super.getNome() + "NO SETOR " + setor);
    }

    @Override
    void exibirDados() {
        super.exibirDados();
        System.out.println(setor);
    }
}
