package SistemaDeFuncionarios;

public class Main {

    public static void main(String[] args) {

        Gerente gerente1 = new Gerente("Punpun", 2000, "Financeiro");
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Afro", 3000, "Java");
        Vendedores vendedores1 = new Vendedores("Aiko", 2000.0);
        Estagiario estagiario1 = new Estagiario("PooP", 1300, "FIP");

        System.out.println("AUMENTAR SALÁRIO");

        gerente1.aumentarSalario(10);
        gerente1.exibirDados();

        System.out.println();
        System.out.println("REGISTRAR VENDAS");

        vendedores1.registrarVenda(1000.0);
        vendedores1.registrarVenda(500.0);
        vendedores1.exibirDados();

        System.out.println();
        System.out.println("COMISSÃO:");

        System.out.println(vendedores1.calcularComissao());

        System.out.println();
        System.out.println("VENDA NEGATIVA: ");

        vendedores1.registrarVenda(-5);
        vendedores1.exibirDados();

        System.out.println();
        System.out.println("EXIBIR DADOS: ");
        System.out.println();
        System.out.println("GERENTE: ");
        gerente1.exibirDados();
        System.out.println();
        System.out.println("DESENVOLVEDOR: ");
        desenvolvedor1.exibirDados();
        System.out.println();
        System.out.println("VENDEDOR: ");
        vendedores1.exibirDados();
        System.out.println();
        System.out.println("ESTAGIÁRIO: ");
        estagiario1.exibirDados();
    }

}
