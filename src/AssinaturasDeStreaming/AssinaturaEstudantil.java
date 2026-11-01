package AssinaturasDeStreaming;

public class AssinaturaEstudantil extends Assinatura{

    private double percentualDesconto;

    public AssinaturaEstudantil(Cliente cliente, String nomePlano, double valorMensalidade, double percentualDesconto) {
        super(cliente, nomePlano, valorMensalidade);
        if (percentualDesconto >= 0 && percentualDesconto <= 100) {
            this.percentualDesconto = percentualDesconto;
        }
    }

    @Override
    public double calcularCusto(int meses) {
        return super.calcularCusto(meses) - (super.calcularCusto(meses) * (percentualDesconto / 100));
    }

}
