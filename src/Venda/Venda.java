package Venda;

public class Venda {
    Cliente cliente;
    Produto produto;
    int quantidade;
    double percentualDesconto;

    double calcularSubtotal(){
        return produto.preco * quantidade;
    }

    double calcularDesconto(){
        return calcularSubtotal() * (percentualDesconto / 100);
    }

    double calcularValorFinal(){
        return calcularSubtotal() - calcularDesconto();
    }

    boolean podeFinalizar(){
        if (this.quantidade > 0) {
            return true;
        }
        if (produto.temEstoque(quantidade)) {
            return true;
        }
        if (cliente.temSaldo(calcularValorFinal())) {
            return true;
        }
        return false;
    }

    void finalizarVenda() {
        if (podeFinalizar()) {
            produto.quantidadeEstoque -= quantidade;
            cliente.saldo -= calcularValorFinal();
        }
    }

    void exibirResumo() {
        System.out.println("------------------------");
        System.out.println("Venda.Cliente que está realizando a compra: " + cliente.nome);
        System.out.println("Venda.Produto que está sendo comprado: " + produto.nome);
        System.out.println("Preço do produto: " + produto.preco);
        System.out.println("Quantidade a ser comprada: " + quantidade);
        System.out.println("Valor total da venda: " + calcularValorFinal());
    }
}
