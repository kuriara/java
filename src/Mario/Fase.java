package Mario;

public class Fase {

    String nome;
    int meta;
    boolean concluida;

    public Fase(String nome, int meta) {
        this.nome = nome;
        this.meta = meta;
        concluida = false;
    }

    boolean podeConcluir(Mario mario) {
        if (mario.vidas > 0 && mario.pontos >= meta) {
            return true;
        }
        return false;
    }

    boolean concluir(Mario mario) {
        if (podeConcluir(mario)) {
            concluida = true;
            return true;
        }
        return false;
    }

    void exibirDados() {
        System.out.println("Nome da fase: " + nome);
        System.out.println("Meta da fase: " + meta);
        System.out.println("Concluída?" + concluida);
    }

}
