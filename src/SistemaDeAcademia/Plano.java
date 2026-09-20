package SistemaDeAcademia;

public class Plano {

    String nome;
    double precoMensal;
    boolean ativo;

    public Plano(String nome, double precoMensal) {
        this.nome = nome;
        this.precoMensal = precoMensal;
        ativo = true;
    }

    void desativarPlano() {
        ativo = false;
    }

    void exibirDados() {
        System.out.println("Nome do plano: " + nome);
        System.out.println("Preço mensal: " + precoMensal);
        System.out.println("Ativo? " + ativo);
    }

}
