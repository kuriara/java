package SistemaDeCombateEntrePersonagens;

public class Arena {

    private Equipe equipeA;
    private Equipe equipeB;
    private boolean turnoA;

    public Arena(Equipe equipeA, Equipe equipeB) {
        this.equipeB = equipeB;
        this.equipeA = equipeA;
        this.turnoA = true;
    }

    public boolean executarTurno(Personagem a, Personagem alvo) {
        if (!equipeA.temVivos()) {
            return false;
        }
        if (!equipeB.temVivos()) {
            return false;
        }
        if (turnoA && equipeA.temVivos() && equipeB.temVivos() && equipeA.contem(a)) {
            a.atacar(alvo);
            return true;
        }
        if (!turnoA && equipeA.temVivos() && equipeB.temVivos() && equipeB.contem(alvo)) {
            alvo.atacar(a);
            return true;
        }
        resultado();
        return true;
    }

    public String resultado() {
        if (equipeA.temVivos() && equipeB.temVivos()) {
            return "EM_ANDAMENTO";
        }
        if (equipeA.temVivos() && !equipeB.temVivos()) {
            return "EQUIPE CAMPEÃ: A";
        }
        if (!equipeA.temVivos() && equipeB.temVivos()) {
            return "EQUIPE CAMPEÃ: B";
        }
        return "EMPATE";
    }

}
