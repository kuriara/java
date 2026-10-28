package PetShop2;

public class Pet {
    String nome;
    String especie;
    double peso;
    Tutor tutor;

    public Pet(String nome, String especie, double peso, Tutor tutor) {
        this.nome = nome;
        this.especie = especie;
        this.peso = peso;
        this.tutor = tutor;
    }

    void atualizarPeso(double novoPeso) {
        if (novoPeso > 0) {
            peso = novoPeso;
        }
    }

    void exibirDados() {
        System.out.println("Nome do pet: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("Tutor: " + tutor.nome);
    }


}
