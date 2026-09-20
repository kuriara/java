package SistemaDeRestaurante;

public class Pedido {
    Pratos pratos;
    Cliente cliente;
    boolean concluido;
    double valorFinal;

    public Pedido(Pratos pratos, Cliente cliente) {
        this.pratos = pratos;
        this.cliente = cliente;
        concluido = false;
        valorFinal = 0;
    }

    boolean finalizarPedido() {
        if (concluido == true) {
            return false;
        }
        if (pratos.disponivel == false) {
            return false;
        }
        if (cliente.saldo < pratos.preco) {
            return false;
        }
        cliente.realizarPagamento(pratos);
        valorFinal = pratos.preco;
        cliente.quantidadePedidos += 1;
        pratos.disponivel = false;
        concluido = true;
        return true;
    }

    void exibirDados() {
        System.out.println("Cliente que pediu: " + cliente.nome);
        System.out.println("Prato: " + pratos.nome);
        System.out.println("Valor final do pedido: " + valorFinal);
    }


}
