package SistemaDeCombateEntrePersonagens;

public class Arqueiro extends Personagem {

    private int precisao;
    private int flechas;

    public Arqueiro(int vida, String nome, int forca, Arma arma, int precisao, int flechas) {
        super(vida, nome, forca, arma);
        this.precisao = precisao;
        this.flechas = flechas;
    }

    @Override
    public int calcularDano() {
        if (flechas > 0) {
            return super.calcularDano() + precisao;
        }
        return super.calcularDano();
    }

    @Override
    public boolean atacar(Personagem alvo) {
        if (!super.atacar(alvo)) {
            return false;
        }
        flechas--;
        return true;
    }

    public int getFlechas() {
        return flechas;
    }
}
