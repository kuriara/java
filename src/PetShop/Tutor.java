package PetShop;

public class Tutor {

    String nome;
    String telefone;
    double saldoInicial;


    public Tutor(String nome, String telefone, double saldoInicial) {
        this.nome = nome;
        this.telefone = telefone;
        this.saldoInicial = saldoInicial;
    }

    boolean pagar(double valor) {
        if (valor > 0 && saldoInicial > valor) {
            saldoInicial -= valor;
            return true;
        }
        return false;
    }

    void adicionarSaldo(double valor) {
        if (valor > 0) {
            saldoInicial += valor;
        }
    }

    void exibirDados() {
        System.out.println("Nome do tutor: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Saldo: " + saldoInicial);
    }

}
