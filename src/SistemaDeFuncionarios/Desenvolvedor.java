package SistemaDeFuncionarios;

public class Desenvolvedor extends Funcionario {

    private String linguagemPrincipal;

    public Desenvolvedor(String nome, double salarioBase, String linguagemPrincipal) {
        super(nome, salarioBase);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    void programar() {
        System.out.println("MEU NOME É " + super.getNome() + "E MINHA LINGUAGEM É " + linguagemPrincipal);
    }

    @Override
    void exibirDados() {
        super.exibirDados();
        System.out.println(linguagemPrincipal);
    }

}
