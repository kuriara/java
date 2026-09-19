package Venda;

public class Cliente {
    String nome;
    String cpf;
    double saldo;

    boolean temSaldo(double valor){
        if (valor >= saldo) {
            return true;
        }
        return false;
    }

    void descontarSaldo(double valor){
        saldo -= valor;
    }

    void adicionarSaldo(double valor) {
        saldo += valor;
    }

    void exibirDados(){
        System.out.println("------------------------");
        System.out.println("Venda.Cliente : " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Saldo: " + saldo);
    }

}
