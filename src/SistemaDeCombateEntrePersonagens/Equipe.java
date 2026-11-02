package SistemaDeCombateEntrePersonagens;

public class Equipe {

    private String nome;
    private Personagem[] membros;
    private int quantidade;

    public Equipe(String nome, int capacidade) {
        if (capacidade > 0) {
            this.membros = new Personagem[capacidade];
        }
        this.nome = nome;
    }

    public boolean adicionar(Personagem p) {
        if (quantidade == membros.length) {
            return false;
        }
        for (int i = 0; i < quantidade; i++) {
            if (p == membros[i]) {
                return false;
            }
        }
        if (!p.estaVivo()) {
            return false;
        }
        membros[quantidade] = p;
        quantidade++;
        return true;
    }

    public boolean contem(Personagem p) {
        for (int i = 0; i < quantidade; i++) {
            if (p == membros[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean temVivos() {
        for (int i = 0; i < quantidade; i++) {
            if (membros[i].estaVivo()) {
                return true;
            }
        }
        return false;
    }

}
