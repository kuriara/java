package PetShop2;

public class Servico {

    String nome;
    double precoBase;
    double adicionalPorKg;

    public Servico(String nome, double precoBase, double adicionalPorKg) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.adicionalPorKg = adicionalPorKg;
    }

    double calcularPreco(Pet pet) {
        return precoBase + pet.peso * adicionalPorKg;
    }

    void exibirDados() {
        System.out.println("Nome do serviço: " + nome);
        System.out.println("Preço base: " + precoBase);
        System.out.println("Adicional por KG: " + adicionalPorKg);
    }

}
