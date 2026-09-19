package CarroQuestao;

public class Venda {

    Carro carro;
    Cliente cliente;
    Vendedor vendedor;
    double valorFinal;
    boolean concluida;

    public Venda(Carro carro, Cliente cliente, Vendedor vendedor) {
        this.carro = carro;
        this.cliente = cliente;
        this.vendedor = vendedor;
        valorFinal = 0;
        concluida = false;
    }

    boolean finalizar() {
        if (concluida == true) {
            return false;
        }
        if (carro.disponivel == false) {
            return false;
        }
        if (cliente.pagarValor(carro.preco) == false) {
            return false;
        }
        else {
            valorFinal = carro.preco;
            carro.disponivel = false;
            cliente.carrosComprados += 1;
            vendedor.registrarComissao(valorFinal);
            concluida = true;
            return true;
        }
    }

    void exibirResumo() {
        System.out.println("-------------------------------");
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("Vendedor: " + vendedor.nome);
        System.out.println("Carro: " + carro.modelo);
        System.out.println("Valor do carro: " + valorFinal);
    }


}
