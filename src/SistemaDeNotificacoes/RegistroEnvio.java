package SistemaDeNotificacoes;

public class RegistroEnvio {

    private String canal;
    private String texto;
    private boolean sucesso;

    public RegistroEnvio(String canal, String texto, boolean sucesso) {
        this.texto = texto;
        this.canal = canal;
        this.sucesso = sucesso;
    }

    public String resumo() {
        return canal + " " + texto + " " +  sucesso;
    }

}
