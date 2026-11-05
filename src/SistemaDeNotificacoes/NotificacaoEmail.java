package SistemaDeNotificacoes;

public class NotificacaoEmail extends Notificacao {

    private String assunto;

    public NotificacaoEmail(Destinatario destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    @Override
    public String canal() {
        return "EMAIL";
    }

    @Override
    public String formatarMensagem() {
        return "Assunto: " + assunto + "\n" + "Mensagem: " + super.formatarMensagem();
    }

}
