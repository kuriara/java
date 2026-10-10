package SistemaDeFuncionarios;

public class Funcionario {

    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    void aumentarSalario(int percentual) {
        if (percentual > 0) {
            salarioBase += salarioBase * percentual / 100;
        }
    }

    void exibirDados() {
        System.out.println("NOME: " + this.nome);
        System.out.println("SALÁRIO: " + this.salarioBase);
    }

    //GETTERS

    public String getNome() {
        return this.nome;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

}
