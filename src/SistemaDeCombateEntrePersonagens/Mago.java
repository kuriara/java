package SistemaDeCombateEntrePersonagens;

public class Mago extends Personagem {

    private int poderMagico;
    private int mana;

    public Mago(int vida, String nome, int forca, Arma arma, int poderMagico, int mana) {
        super(vida, nome, forca, arma);
        this.poderMagico = poderMagico;
        this.mana = mana;
    }

    @Override
    public int calcularDano() {
        if (mana >= 10) {
            return super.calcularDano() + poderMagico;
        }
        return super.calcularDano();
    }

    @Override
    public boolean atacar(Personagem alvo) {
        if (!super.atacar(alvo)) {
            return false;
        }
        mana -= 10;
        return true;
    }

    public int getMana() {
        return mana;
    }
}
