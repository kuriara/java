package EntregaDeEncomendas;

public class EntregaEconomica extends Entrega {

    private int prazoDias;
    private String centroDistribuicao;

    public EntregaEconomica(Encomenda encomenda, Rota rota, int prazoDias, String centroDistribuicao) {
        super(encomenda, rota);
        this.prazoDias = prazoDias;
        this.centroDistribuicao = centroDistribuicao;
    }

    @Override
    public double calcularFrete() {
        if (super.calcularFrete() == 0) {
            return 0;
        }
        else {
            if (super.getEncomenda().getPesoKg() >= 10) {
                return super.calcularFrete() + 0.2 * super.getRota().getDistanciaKm() -  0.1 * (super.calcularFrete() +
                        0.2 * super.getRota().getDistanciaKm());
            }
            return super.calcularFrete() + 0.2 * super.getRota().getDistanciaKm();
        }
    }

    @Override
    public String gerarDescricao() {
        return super.gerarDescricao() +
                "Prazo em dias= " + prazoDias +
                "Centro de distribuição= " + centroDistribuicao;
    }

}
