package PetShop;

public class Atendimento {

    Pet pet;
    Servico servico;
    double valorCobrado;
    boolean finalizado;

    public Atendimento (Pet pet, Servico servico) {
        this.pet = pet;
        this.servico = servico;
        valorCobrado = 0;
        finalizado = false;
    }

    double calcularTotal() {
        return servico.calcularPreco(pet);
    }

    boolean finalizar() {
        if (pet.tutor.pagar(calcularTotal()) == true && finalizado == false) {
            valorCobrado = calcularTotal();
            finalizado = true;
            return true;
        }
        return false;
    }

    void exibirResumo() {
        System.out.println("Animal: " + pet.nome);
        System.out.println("Tutor: " + pet.tutor.nome);
        System.out.println("Serviço: " + servico.nome);
        System.out.println("Situação: " + finalizado);
        System.out.println("Valor cobrado: " + valorCobrado);
    }

}
