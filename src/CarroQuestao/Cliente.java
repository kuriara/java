package CarroQuestao;

public class Cliente {

    String nome;
    String cpf;
    double saldo;
    int carrosComprados;

    public Cliente(){
        carrosComprados = 0;
    }

    boolean pagarValor(double valor) {
        if (saldo >= valor && valor > 0){
            saldo -= valor;
            return true;
        }
        System.out.println("Saldo insuficiente ou valor negativo!");
        return false;
    }

    void adicionarSaldo(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    void exibirDados() {
        System.out.println("-------------------------------");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Saldo do cliente: " + saldo);
        System.out.println("Carros comprados do cliente: " + carrosComprados);
    }
}
