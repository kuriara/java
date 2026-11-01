package AssinaturasDeStreaming;

public class Fatura {

    private Assinatura assinatura;
    private int meses;
    private double total;
    private boolean paga;

    public Fatura(Assinatura assinatura, int meses) {
        this.assinatura = assinatura;
        this.meses = meses;
        total = assinatura.calcularCusto(meses);
        paga = false;
    }

    public boolean pagar() {
        if (total <= 0 || paga) {
            paga = false;
            return false;
        }
        paga = true;
        return true;
    }

    public String resumo() {
        return assinatura.getCliente().identificar() + " " + assinatura.getNomePlano() + " " + meses + " "
                + total + " " + paga;
    }

}
