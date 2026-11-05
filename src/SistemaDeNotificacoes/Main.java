package SistemaDeNotificacoes;

public class Main {

    public static void main(String[] args) {

        Destinatario punpun = new Destinatario("Punpun", "9999-9999");
        Destinatario aiko = new Destinatario("Aiko", "9999-9998");
        Destinatario sachi = new Destinatario("Sachi" , "9999-9997");
        Destinatario afro = new Destinatario("Afro", "9999-9996");

        CentralNotificacoes central1 = new CentralNotificacoes(4);
        NotificacaoEmail notificacaoEmail = new NotificacaoEmail(punpun, "Pedido aprovado", "Aviso");
        NotificacaoSMS notificacaoSMS = new NotificacaoSMS(aiko, "Pedido confirmado para retirada", 20);
        NotificacaoPush notificacaoPush = new NotificacaoPush(sachi, "Saiu para entrega", "Loja", "Entrega");
        NotificacaoWhatsapp notificacaoWhatsapp = new NotificacaoWhatsapp(afro, "Ola", "Loja");

        afro.desativar();

        central1.adicionar(notificacaoEmail);
        central1.adicionar(notificacaoSMS);
        central1.adicionar(notificacaoPush);
        central1.adicionar(notificacaoWhatsapp);

        central1.processarFila();

        central1.getUltimoLote();

    }

}
