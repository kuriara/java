package SistemaDeCombateEntrePersonagens;

public class Guerreiro extends Personagem {

    private int bonusEspada;

    public Guerreiro(int vida, String nome, int forca, Arma arma, int bonusEspada) {
        super(vida, nome, forca, arma);
        this.bonusEspada = bonusEspada;
    }

    @Override
    public int calcularDano() {
        return super.calcularDano() + bonusEspada;
    }

}
