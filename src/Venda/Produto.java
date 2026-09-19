package Venda;

public class Produto {
    String nome;
    double preco;
    int quantidadeEstoque;

    void calcularValorEmEstoque() {
        preco *= quantidadeEstoque;
    }

    boolean temEstoque(int quantidade){
        if (quantidade >= quantidadeEstoque) {
            return true;
        }
        return false;
    }

    void retirarEstoque(int quantidade){
        quantidadeEstoque -= quantidade;
    }

    void aplicarDesconto(double percentualDesconto) {
        preco = preco - (preco * (percentualDesconto / 100));
    }

    void exibirDados() {
        System.out.println("------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
    }

}
