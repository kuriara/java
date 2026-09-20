package Mario;

public class Inimigo {
    String tipo;
    int pontosRecompensa;
    boolean derrotado;

    public Inimigo(String tipo, int pontosRecompensa) {
        this.tipo = tipo;
        this.pontosRecompensa = pontosRecompensa;
        this.derrotado = false;
    }

    void atacar(Mario mario) {
        if (derrotado == false) {
            mario.receberDano();
        }
    }

    boolean serPisado(Mario mario) {
        if (mario.vidas > 0 && derrotado == false) {
            derrotado = true;
            mario.pontos += pontosRecompensa;
            return true;
        }
        return false;
    }

    void exibirStatus() {
        System.out.println("Tipo do inimigo: " + tipo);
        System.out.println("Recompensa do inimigo: " + pontosRecompensa);
        System.out.println("Derrotado? " + derrotado);
    }

}
