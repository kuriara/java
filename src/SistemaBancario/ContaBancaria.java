package SistemaBancario;

public class ContaBancaria {

    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        saldo = 0.0;
    }

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
        else {
            System.out.println("VALOR INVÁLIDO!");
        }
    }

    void sacar(double valor) {
        if (valor < 0) {
            System.out.println("VALOR INVÁLIDO!");
        }
        else if (valor > saldo) {
            System.out.println("SALDO INSUFICIENTE!");
        }
        else {
            saldo -= valor;
        }
    }

    void exibirResumo() {
        System.out.println("NÚMERO DA CONTA: " + numeroConta);
        System.out.println("TITULAR: " + titular);
        System.out.println("SALDO: " + saldo);
    }

    //GETTERS E SETTERS

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public String setTitular(String titular) {
        if(titular != "Aiko") {
            return this.titular;
        }
        else {
            this.titular = titular;
            return titular;
        }
    }

    public double getSaldo() {
        return saldo;
    }

}
