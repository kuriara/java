package CarroQuestao;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Cliente cliente1 = new Cliente();
        Vendedor vendedor1 = new Vendedor();
        Venda venda1 = new Venda(carro1, cliente1, vendedor1);

        carro1.preco = 50000.0;
        carro1.modelo = "celta";
        carro1.ano = 2002;
        carro1.marca = "chevrolet";

        cliente1.saldo = 60000.0;
        cliente1.nome = "Akiko";
        cliente1.cpf = "000.000.000-01";
        cliente1.carrosComprados = 0;

        vendedor1.percentualComissao = 5;
        vendedor1.nome = "Masashi";

        carro1.exibirDados();
        cliente1.exibirDados();
        vendedor1.exibirDados();
        venda1.exibirResumo();

        carro1.aplicarDesconto(10);
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("10% DE DESCONTO:");
        carro1.exibirDados();

        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("APÓS A VENDA:");



        venda1.finalizar();

        carro1.exibirDados();
        cliente1.exibirDados();
        vendedor1.exibirDados();
        venda1.exibirResumo();

        System.out.println("-------------------------------");
    }
}
