package SistemaBancario;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("12345", "Punpun");

        conta1.exibirResumo();

        conta1.depositar(-1);

        System.out.println();
        conta1.exibirResumo();

        conta1.sacar(100.0);

        System.out.println();
        conta1.exibirResumo();

        conta1.setTitular("To");

        System.out.println();
        conta1.exibirResumo();

        conta1.setTitular("Aiko");

        System.out.println();
        conta1.exibirResumo();
    }
}
