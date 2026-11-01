package AssinaturasDeStreaming;

public class Assinatura {

    private Cliente cliente;
    private String nomePlano;
    private double valorMensalidade;
    private boolean ativa;

    public Assinatura(Cliente cliente, String nomePlano, double valorMensalidade) {
        this.cliente = cliente;
        this.nomePlano = nomePlano;
        this.valorMensalidade = valorMensalidade;
        this.ativa = true;
    }

    public double calcularCusto(int meses) {
        if (meses <= 0 || ativa == false) {
            return 0;
        }
        return valorMensalidade * meses;
    }

    public void cancelar() {
        ativa = false;
    }

    //GETTERS E SETTERS

    public boolean isAtiva() {
        return ativa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public double getValorMensalidade() {
        return valorMensalidade;
    }
}
