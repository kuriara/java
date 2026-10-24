package EntregaDeEncomendas;

public class Entrega {

    private Encomenda encomenda;
    private Rota rota;
    private boolean concluida;

    public Entrega(Encomenda encomenda, Rota rota) {
        this.encomenda = encomenda;
        this.rota = rota;
        concluida = false;
    }

    public double calcularFrete() {
        if (rota.getDistanciaKm() <= 0) {
            return 0;
        }
        return rota.custoBase() + 2 * encomenda.getPesoKg();
    }

    public boolean concluir() {
        if (concluida == true) {
            return false;
        }
        concluida = true;
        return true;
    }

    public String gerarDescricao() {
        return "Entrega:" +
                "\nEncomenda:" + encomenda.descrever() +
                "\nDistância=" + rota.getDistanciaKm() +
                "\nSituação=" + concluida;
    }

    public Rota getRota() {
        return rota;
    }

    public Encomenda getEncomenda() {
        return encomenda;
    }

    public boolean getConcluida() {
        return concluida;
    }

    public boolean setConcluida(boolean valor) {
        concluida = valor;
        return concluida;
    }
}
