package CarroQuestao;

public class Carro {

    String modelo;
    String marca;
    int ano;
    double preco;
    boolean disponivel;

    public Carro() {
        disponivel = true;
    }

    void aplicarDesconto(double percentual){
        if (percentual >= 0 && percentual <= 20) {
            preco = preco - (preco * percentual / 100);
        }
    }

    void marcarComoVendido() {
        disponivel = false;
    }

    void exibirDados() {
        System.out.println("-------------------------------");
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Marca do carro: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: " + preco);
        System.out.println("Está disponível? " + disponivel);
    }

}
