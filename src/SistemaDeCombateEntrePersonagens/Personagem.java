package SistemaDeCombateEntrePersonagens;

public class Personagem {

    private String nome;
    private int vida;
    private int forca;
    private Arma arma;

    public Personagem(int vida, String nome, int forca, Arma arma) {
        this.vida = vida;
        this.nome = nome;
        this.forca = forca;
        this.arma = arma;
    }

    public int calcularDano() {
        return forca + arma.bonusAtivo();
    }

    public void receberDano(int dano) {
        if (dano >= 0) {
            vida -= dano;
        }
    }

    public boolean estaVivo() {
        if (vida > 0) {
            return true;
        }
        return false;
    }

    public boolean atacar (Personagem alvo) {
        if (!alvo.estaVivo()) {
            return false;
        }
        alvo.receberDano(calcularDano());
        arma.usar();
        return true;
    }

    public int getVida() {
        return vida;
    }
}
