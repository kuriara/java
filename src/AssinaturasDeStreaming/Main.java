package AssinaturasDeStreaming;

public class Main {

    public static void main(String[] args) {

        Plataforma plataforma1 = new Plataforma(3);

        Cliente cliente1 = new Cliente("Ana", "ana@hotmail.com");
        AssinaturaPremium assinaturaAna = new AssinaturaPremium(cliente1, "Premium", 50, 20);

        Cliente cliente2 = new Cliente("Bruno", "bruno@hotmail.com");
        AssinaturaEstudantil assinaturaBruno = new AssinaturaEstudantil(cliente2, "Estudantil", 40, 25);

        Cliente cliente3 = new Cliente("Carla", "carla@hotmail.com");
        AssinaturaPremium assinaturaCarla = new AssinaturaPremium(cliente3, "Premium", 60, 30);

        plataforma1.cadastrar(assinaturaAna);
        plataforma1.cadastrar(assinaturaBruno);
        plataforma1.cadastrar(assinaturaCarla);

        Fatura[] faturas = plataforma1.gerarMeses(3);

        for (int i = 0; i < faturas.length; i++) {
            System.out.println(faturas[i].resumo());
        }

        System.out.println();

        faturas[0].pagar();
        System.out.println(faturas[0].resumo());

        System.out.println();

        faturas[0].pagar();
        System.out.println(faturas[0].resumo());


    }

}
