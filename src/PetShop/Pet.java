package PetShop;

public class Pet {
    String nome;
    String especie;
    double peso;
    Tutor tutor;

    public Pet(double peso, String especie, String nome, Tutor tutor) {
        this.peso = peso;
        this.especie = especie;
        this.nome = nome;
        this.tutor = tutor;
    }

    void atualizarPeso(double novoPeso) {
        if (novoPeso > 0) {
            peso += novoPeso;
        }
    }

    void exibirDados() {
        System.out.println("Nome do pet: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Peso do pet: " + peso);
        System.out.println("Nome do tutor: " + tutor.nome);
    }

}
