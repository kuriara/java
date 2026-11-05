package SistemaDeNotificacoes;

public class NotificacaoSMS extends Notificacao {

    private int limiteCaracteres;

    public NotificacaoSMS(Destinatario destinatario, String mensagem, int limiteCaracteres) {
        super(destinatario, mensagem);
        if (limiteCaracteres >= 3) {
            this.limiteCaracteres = limiteCaracteres;
        }
    }

    @Override
    public String canal() {
        return "SMS";
    }

    @Override
    public String formatarMensagem() {
        if (super.formatarMensagem().length() > limiteCaracteres) {
            return super.formatarMensagem().substring(0, limiteCaracteres) + "...";
        }
        return super.formatarMensagem();
    }

}
