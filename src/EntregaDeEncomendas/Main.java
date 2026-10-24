package EntregaDeEncomendas;

public class Main {
    public static void main(String[] args) {

        CentralEntregas centralEntregas1 = new CentralEntregas(3);

        Endereco endereco1 = new Endereco("Shigashina", 120, "Tokyo");
        Encomenda encomenda1 = new Encomenda(101, 2, endereco1);
        Rota rota1 = new Rota(10, 5);
        EntregaExpressa entrega1 = new EntregaExpressa(encomenda1, rota1, "Punpun", 4);

        Endereco endereco2 = new Endereco("Jokenpo", 100, "Hiroshima");
        Encomenda encomenda2 = new Encomenda(102, 10, endereco2);
        Rota rota2 = new Rota(10, 5);
        EntregaEconomica entrega2 = new EntregaEconomica(encomenda2, rota2, 3, "Hyogo");

        Endereco endereco3 = new Endereco("Ken", 95, "Hokkaido");
        Encomenda encomenda3 = new Encomenda(103, 1, endereco3);
        Rota rota3 = new Rota(10, 5);
        EntregaExpressa entrega3 = new EntregaExpressa(encomenda3, rota3, "Aiko", 8);

        Endereco endereco4 = new Endereco("Po", 103, "Chin");
        Encomenda encomenda4 = new Encomenda(101, 1, endereco4);
        Rota rota4 = new Rota(10, 5);
        EntregaExpressa entrega4 = new EntregaExpressa(encomenda4, rota4, "Sachi", 8);

        System.out.println(entrega1.calcularFrete());

        System.out.println(entrega2.calcularFrete());

        System.out.println(entrega3.calcularFrete());

        System.out.println(entrega1.gerarDescricao());

        centralEntregas1.adicionar(entrega1);

        centralEntregas1.adicionar(entrega2);

        centralEntregas1.adicionar(entrega3);

        System.out.println(centralEntregas1.adicionar(entrega4));

        System.out.println(centralEntregas1.totalPendentes());

        System.out.println(centralEntregas1.finalizar(101));

        System.out.println(centralEntregas1.totalPendentes());

        System.out.println(centralEntregas1.finalizar(101));

    }

}
