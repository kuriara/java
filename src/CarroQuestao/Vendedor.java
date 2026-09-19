package CarroQuestao;

public class Vendedor {

    String nome;
    double percentualComissao;
    double totalComissoes;

    public Vendedor() {
        totalComissoes = 0;
    }

    double calcularComissao(double valorVenda) {
        return valorVenda * percentualComissao / 100;
    }

    void registrarComissao(double valorVenda) {
        totalComissoes += calcularComissao(valorVenda);
    }

    void exibirDados() {
        System.out.println("-------------------------------");
        System.out.println("Nome do vendedor: " + nome);
        System.out.println("Comissão do vendedor: " + totalComissoes);
    }
}
