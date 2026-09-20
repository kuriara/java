package PetShop;

public class Main {

    public static void main(String[] args) {
        Tutor tutor1 = new Tutor("Punpun", "99999-9999", 100);
        Pet pet1 = new Pet(12, "Cachorro", "Scooby", tutor1);
        Servico servico1 = new Servico("Banho", 25, 2);
        Atendimento atendimento1 = new Atendimento(pet1, servico1);

        atendimento1.exibirResumo();
        atendimento1.finalizar();

        atendimento1.exibirResumo();
        tutor1.exibirDados();

    }




}
