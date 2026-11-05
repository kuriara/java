package SistemaDeNotificacoes;

public class Destinatario {

    private String nome;
    private String contato;
    private boolean ativo;

    public Destinatario(String nome, String contato) {
        this.nome = nome;
        this.contato = contato;
        this.ativo = true;
    }

    public void desativar() {
        ativo = false;
    }

    public String exibir() {
        return nome + " " + contato;
    }

    // GETTERS E SETTERS

    public boolean isAtivo() {
        return ativo;
    }
}
