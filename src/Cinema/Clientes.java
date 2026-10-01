package Cinema;

public class Clientes {

    String nome;
    int idade;
    double saldo;

    public Clientes(String nome, int idade, double saldo) {
        this.nome = nome;
        this.idade = idade;
        this.saldo = saldo;
    }

    void acrescentarSaldo(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    void descontarSaldo(double valor) {

    }
}
