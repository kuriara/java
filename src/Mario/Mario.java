package Mario;

public class Mario {
    String nome;
    int vidas;
    int moedas;
    int pontos;

    public Mario(String nome) {
        this.nome = nome;
        vidas = 3;
        moedas = 0;
        pontos = 0;
    }

    void pular() {
        if (vidas > 0) {
            System.out.println("Pulo!");
        }
    }

    void receberDano() {
        if (vidas != 0) {
            vidas -= 1;
        }
    }

    void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Vidas: " + vidas);
        System.out.println("Moedas: " + moedas);
        System.out.println("Pontos: " + pontos);
    }
}
