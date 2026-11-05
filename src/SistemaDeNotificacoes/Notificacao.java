package SistemaDeNotificacoes;

public class Notificacao {

    private Destinatario destinatario;
    private String mensagem;
    private boolean enviada;

    public Notificacao(Destinatario destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
        this.enviada = false;
    }

    public String formatarMensagem() {
        return mensagem;
    }

    public String canal() {
        return "GENERICA";
    }

    public boolean enviar() {
        if (enviada || !destinatario.isAtivo()) {
            return false;
        }
//        System.out.print(canal() + " " + destinatario.exibir() + " " + formatarMensagem());
        enviada = true;
        return true;
    }

}
