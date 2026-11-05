package SistemaDeNotificacoes;

public class NotificacaoWhatsapp extends Notificacao {

    private String empresa;

    public NotificacaoWhatsapp(Destinatario destinatario, String mensagem, String empresa) {
        super(destinatario, mensagem);
        this.empresa = empresa;
    }

    @Override
    public String canal() {
        return "WHATSAPP";
    }

    @Override
    public String formatarMensagem() {
        return super.formatarMensagem() + "\n" + "Enviado por empresa";
    }

}
