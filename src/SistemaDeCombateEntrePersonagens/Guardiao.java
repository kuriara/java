package SistemaDeCombateEntrePersonagens;

public class Guardiao extends Personagem{

    private int armadura;

    public Guardiao(int vida, String nome, int forca, Arma arma, int armadura) {
        super(vida, nome, forca, arma);
        this.armadura = armadura;
    }

    @Override
    public void receberDano(int dano) {
        if (dano > 0 && armadura >= dano) {
            armadura -= dano;
        }
        if (dano > 0 && dano > armadura) {
            dano -= armadura;
            super.receberDano(dano);
        }
    }

}
