package SistemaDeFuncionarios;

public class Estagiario extends Funcionario{

    private String instituicaoEnsino;

    public Estagiario(String nome, double salarioBase, String instituicaoEnsino) {
        super(nome, salarioBase);
        this.instituicaoEnsino = instituicaoEnsino;
    }

    @Override
    void exibirDados() {
        super.exibirDados();
        System.out.println("INSTITUIÇÃO DE ENSINO: " + instituicaoEnsino);
    }

}
