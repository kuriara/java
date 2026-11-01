package AssinaturasDeStreaming;

public class AssinaturaPremium extends Assinatura {

    private double taxaConteudoExclusivo;

    public AssinaturaPremium(Cliente cliente, String nomePlano, double valorMensalidade, double taxaConteudoExclusivo) {
        super(cliente, nomePlano, valorMensalidade);
        this.taxaConteudoExclusivo = taxaConteudoExclusivo;
    }

    @Override
    public double calcularCusto(int meses) {
        return super.calcularCusto(meses) + taxaConteudoExclusivo * meses;
    }

}
