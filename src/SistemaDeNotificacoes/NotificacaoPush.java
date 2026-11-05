package SistemaDeNotificacoes;

public class NotificacaoPush extends Notificacao {

    private String aplicativo;
    private String titulo;

    public NotificacaoPush(Destinatario destinatario, String mensagem, String aplicativo, String titulo) {
        super(destinatario, mensagem);
        this.aplicativo = aplicativo;
        this.titulo = titulo;
    }

    @Override
    public String canal() {
        return "PUSH";
    }

    @Override
    public String formatarMensagem() {
        return aplicativo + " " + titulo + super.formatarMensagem();
    }

}
