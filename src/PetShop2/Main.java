package PetShop2;

public class Main {

    public static void main(String[] args) {

        Tutor tutor1 = new Tutor("Punpun", "99999-9999", 100);
        Pet pet1 = new Pet("Oyasumi", "Cachorro", 12, tutor1);
        Servico servico1 = new Servico("Banho", 25, 2);
        Atendimento atendimento1 = new Atendimento(pet1, servico1);

        atendimento1.exibirDados();

        System.out.println();
        System.out.println("----FINALIZANDO----");

        atendimento1.finalizar();

        atendimento1.exibirDados();
        System.out.println();
        tutor1.exibirDados();

    }

}
