package SistemaDeRestaurante;

public class Pratos {

    String nome;
    String categoria;
    double preco;
    boolean disponivel;

    public Pratos(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        disponivel = true;
    }

    void aplicarDesconto(double valor) {
        if (valor > 0) {
            preco -= preco * valor;
        }
    }

    boolean alterarDisponibilidade() {
        if(disponivel == false) {
            disponivel = true;
            return true;
        }
        return false;
    }

    void exibirDados() {
        System.out.println("Nome do prato: " + nome);
        System.out.println("Valor do prato: " + preco);
        System.out.println("Prato disponível? " + disponivel);
    }

}
