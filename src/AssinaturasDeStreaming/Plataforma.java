package AssinaturasDeStreaming;

public class Plataforma {

    private Assinatura[] assinaturas;
    private int quantidade;

    public Plataforma(int capacidade) {
        if (capacidade > 0) {
            this.assinaturas = new Assinatura[capacidade];
        }
        this.quantidade = 0;
    }

    public boolean cadastrar(Assinatura a) {
        if (quantidade == assinaturas.length) {
            return false;
        }
        for (int i = 0; i < quantidade; i++) {
            if (assinaturas[i] == a) {
                return false;
            }
        }
        assinaturas[quantidade] = a;
        quantidade++;
        return true;
    }

    public Fatura[] gerarMeses(int meses) {

        int ativas = 0;

        for (int i = 0; i < assinaturas.length; i++) {
            if (assinaturas[i].isAtiva()) {
                ativas++;
            }
        }

        Fatura[] faturas = new Fatura[ativas];

        for (int i = 0; i < assinaturas.length; i++) {
            if (meses <= 0) {
                faturas[i] = null;
            }
            if (meses > 0) {
                faturas[i] = new Fatura(assinaturas[i], meses);
            }
        }
        return faturas;
    }

}
