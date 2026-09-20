package SistemaDeAcademia;

public class Aluno {

    String nome;
    int idade;
    double peso;
    int quantidadeTreino;

    public Aluno(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        quantidadeTreino = 0;
    }

    void registrarTreino() {
        quantidadeTreino++;
    }

    void alterarPeso(double valor) {
        if (valor > 0) {
            peso = valor;
        }
    }

    void exibirDados() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("Quantidade de treinos: " + quantidadeTreino);
    }


}
