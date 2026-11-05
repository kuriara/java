package SistemaDeNotificacoes;

public class CentralNotificacoes {

    private Notificacao[] fila;
    private int quantidade;
    private RegistroEnvio[] ultimoLote;

    public CentralNotificacoes(int capacidade) {
        this.fila = new Notificacao[capacidade];
        this.quantidade = 0;
        this.ultimoLote = null;
    }

    public boolean adicionar(Notificacao n) {
        if (quantidade == fila.length) {
            return false;
        }
        for (int i = 0; i < quantidade; i++) {
            if (n == fila[i]) {
                return false;
            }
        }
        fila[quantidade] = n;
        quantidade++;
        return true;
    }

    public int processarFila() {

        if (quantidade == 0) {
            return 0;
        }

        this.ultimoLote = new RegistroEnvio[quantidade];
        int sucesso = 0;

        for (int i = 0; i < quantidade; i++) {

            fila[i].enviar();

            ultimoLote[i] = new RegistroEnvio(fila[i].canal(), fila[i].formatarMensagem(), fila[i].enviar());

            if (fila[i].enviar()) {
                sucesso ++;
            }

            fila[i] = null;
        }
        return sucesso;
    }

//    public Notificacao[] getFila() {
//        for (int i = 0; i < fila.length; i++) {
//            return fila[i];
//        }
//    }


    public void getUltimoLote() {
        for (int i = 0; i < ultimoLote.length; i++) {
            System.out.println(ultimoLote[i].resumo());
        }
    }
}

