package SistemaDeFuncionarios;

public class Vendedores extends Funcionario {

    private double totalVendido;

    public Vendedores(String nome, double salarioBase) {
        super(nome, salarioBase);
        this.totalVendido = 0;
    }

    void registrarVenda(double valor) {
        if (valor > 0) {
            totalVendido += valor;
        }
    }

    double calcularComissao() {
        return totalVendido * 0.05;
    }

    @Override
    void exibirDados() {
        super.exibirDados();
        System.out.println(totalVendido);
    }

}
