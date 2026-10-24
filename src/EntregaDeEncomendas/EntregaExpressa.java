package EntregaDeEncomendas;

public class EntregaExpressa extends Entrega{

    private int prazoHoras;
    private String nomeEntregador;

    public EntregaExpressa(Encomenda encomenda, Rota rota, String nomeEntregador, int prazoHoras) {
        super(encomenda, rota);
        this.nomeEntregador = nomeEntregador;
        this.prazoHoras = prazoHoras;
    }

    @Override
    public double calcularFrete() {
        if (super.calcularFrete() == 0) {
            return 0;
        }
        else {
            if (prazoHoras <= 6) {
                return super.calcularFrete() + 1.5 * super.getRota().getDistanciaKm() + 10;
            }
            return super.calcularFrete() + 1.5 * super.getRota().getDistanciaKm();
        }
    }

    @Override
    public String gerarDescricao() {
        return super.gerarDescricao() +
                "\nPrazo das horas= " + prazoHoras +
                "\nNome do entregador= " + nomeEntregador;
    }

}
