package SistemaDeAcademia;

public class Matricula {

    Aluno aluno;
    Plano plano;
    int quantidadeMes;
    double valorPago;
    boolean confirmada;

    public Matricula(Aluno aluno, Plano plano, int quantidadeMes) {
        this.aluno = aluno;
        this.plano = plano;
        this.quantidadeMes = quantidadeMes;
        valorPago = 0;
        confirmada = false;
    }

    boolean confirmarMatricula() {
        if (quantidadeMes > 0 && plano.ativo == true && confirmada == false) {
            valorPago = plano.precoMensal * quantidadeMes;
            confirmada = true;
            return true;
        }
        return false;
    }

    void exibirDados() {
        System.out.println("Aluno: " + aluno.nome);
        System.out.println("Valor pago: " + valorPago);
        System.out.println("Confirmado? " + confirmada);
    }

}
