package PetShop2;

public class Atendimento {

    Pet pet;
    Servico servico;
    double valorCobrado;
    boolean finalizado;

    public Atendimento(Pet pet, Servico servico) {
        this.pet = pet;
        this.servico = servico;
        valorCobrado = 0;
        finalizado = false;
    }

    void calcularTotal() {
        System.out.println("Valor estimado: " + servico.calcularPreco(pet));
    }

    boolean finalizar() {
        if (finalizado == false && pet.tutor.pagar(servico.calcularPreco(pet))) {
            valorCobrado = servico.calcularPreco(pet);
            finalizado = true;
            return true;
        }
        return false;
    }

    void exibirDados() {
        System.out.println("Animal: " + pet.nome);
        System.out.println("Tutor: " + pet.tutor.nome);
        System.out.println("Serviço: " + servico.nome);
        System.out.println("Finalizado? " + finalizado);
        if (finalizado) {
            System.out.println("Valor cobrado: " + valorCobrado);
        }
    }


}
