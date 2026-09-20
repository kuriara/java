package SistemaDeRestaurante;

public class Cliente {

    String nome;
    double saldo;
    int quantidadePedidos;

    public Cliente(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
        quantidadePedidos = 0;
    }

    void realizarPagamento(Pratos pratos) {
        if (pratos.preco > 0 && saldo > pratos.preco) {
            saldo -= pratos.preco;
        }
    }

    void exibirDados() {
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Saldo: " + saldo);
        System.out.println("Quantidade de pedidos: " + quantidadePedidos);
    }

}
