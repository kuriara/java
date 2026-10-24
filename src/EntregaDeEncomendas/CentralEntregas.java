package EntregaDeEncomendas;

public class CentralEntregas {

    private Entrega[] entregas;
    private int quantidade;

    public CentralEntregas(int capacidade) {
        if (capacidade > 0) {
            this.entregas = new Entrega[capacidade];
        }
        this.quantidade = 0;
    }

    boolean adicionar(Entrega e) {
        if (this.quantidade == entregas.length) {
            return false;
        }
        for (int i = 0; i < quantidade; i++) {
            if (entregas[i].getEncomenda().getCodigo() == e.getEncomenda().getCodigo()) {
                return false;
            }
        }
        entregas[quantidade] = e;
        quantidade++;
        return true;
    }



    public double totalPendentes() {
        double soma = 0;
        for (Entrega entrega : entregas) {
            if (!entrega.getConcluida()) {
                soma += entrega.calcularFrete();
            }
        }
        return soma;
    }

    public boolean finalizar(int codigo) {
        for (int i = 0; i < quantidade; i++) {
            if (entregas[i].getConcluida()) {
                return false;
            }
            if (entregas[i].getEncomenda().getCodigo() == codigo) {
                entregas[i].setConcluida(true);
                return true;
            }
        }
        return false;
    }
}
