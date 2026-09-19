package Venda;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        Venda venda1 = new Venda();

        produto1.preco = 80.0;
        produto1.nome = "Pneu";
        produto1.quantidadeEstoque = 2;

        produto2.preco = 40.0;
        produto2.nome = "Farol";
        produto2.quantidadeEstoque = 4;

        cliente1.saldo = 200.0;
        cliente1.nome = "José";
        cliente1.cpf = "000.000.000-01";

        cliente2.saldo = 400.0;
        cliente2.nome = "Maria";
        cliente2.cpf = "000.000.000-02";

        System.out.println("Dados do cliente e produto 1 antes da venda");
        produto1.exibirDados();
        cliente1.exibirDados();
        System.out.println();

        System.out.println("Dados do cliente e produto 2 antes da venda");
        produto2.exibirDados();
        cliente2.exibirDados();
        System.out.println();

        System.out.println("Dados da venda 1 com o cliente e produto 1");
        venda1.cliente = cliente1;
        venda1.produto = produto1;
        venda1.quantidade = 2;
        venda1.percentualDesconto = 10;
        venda1.exibirResumo();
        System.out.println();

        System.out.println("Dados do cliente e produto 1 depois da venda");
        venda1.finalizarVenda();
        produto1.exibirDados();
        cliente1.exibirDados();

    }
}
