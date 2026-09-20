package SistemaDeAcademia;

public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Punpun", 21, 74.0);
        Plano plano1 = new Plano("SUS", 80.0);
        Matricula matricula1 = new Matricula(aluno1, plano1, 3);

        aluno1.exibirDados();
        plano1.exibirDados();
        matricula1.exibirDados();

        matricula1.confirmarMatricula();

        System.out.println();
        System.out.println("Confirmada:");
        System.out.println();


        aluno1.exibirDados();
        plano1.exibirDados();
        matricula1.exibirDados();

    }

}
