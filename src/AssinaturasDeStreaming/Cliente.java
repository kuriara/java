package AssinaturasDeStreaming;

public class Cliente {

    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String identificar() {
        return nome + " " +  email;
    }

}
