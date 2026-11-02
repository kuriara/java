package SistemaDeCombateEntrePersonagens;

public class Arma {

    private String nome;
    private int bonusDano;
    private int durabilidade;

    public Arma (String nome, int bonusDano, int durabilidade) {
        this.nome = nome;
        this.bonusDano = bonusDano;
        this.durabilidade = durabilidade;
    }

    public int bonusAtivo() {
        if (durabilidade > 0) {
            return bonusDano;
        }
        return 0;
    }

    public void usar() {
        if (durabilidade > 0) {
            durabilidade--;
        }
    }

    public int getDurabilidade() {
        return durabilidade;
    }
}
