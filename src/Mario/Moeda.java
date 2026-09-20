package Mario;

public class Moeda {

    int valor;
    boolean coletada;

    public Moeda(int valor) {
        this.valor = valor;
        coletada = false;
    }

    boolean coletar(Mario mario) {
        if (mario.vidas > 0 && coletada == false) {
            mario.moedas += valor;
            mario.pontos += valor * 10;
            coletada = true;
            return true;
        }
        return false;
    }

    void exibirStatus() {
        System.out.println("Valor da moeda: " + valor);
        System.out.println("Moeda coletada? " + coletada);
    }

}
