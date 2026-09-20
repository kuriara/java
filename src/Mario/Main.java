package Mario;

public class Main {
    public static void main(String[] args) {

        Fase fase1 = new Fase ("Yoshi island", 200);
        Moeda moeda1 = new Moeda (1);
        Moeda moeda2 = new Moeda (5);
        Inimigo inimigo1 = new Inimigo ("Goomba", 100);
        Inimigo inimigo2 = new Inimigo ("Koopa", 50);
        Mario mario1 = new Mario ("Mario");

        mario1.exibirStatus();

        moeda1.coletar(mario1);
        moeda2.coletar(mario1);
        inimigo1.serPisado(mario1);

        mario1.exibirStatus();

        inimigo2.serPisado(mario1);

        mario1.exibirStatus();

        fase1.concluir(mario1);

        fase1.exibirDados();

        mario1.exibirStatus();

    }
}
