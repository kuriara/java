package EntregaDeEncomendas;

import org.w3c.dom.ls.LSOutput;

public class Encomenda {

    private int codigo;
    private double pesoKg;
    private Endereco destino;

    public Encomenda(int codigo, double pesoKg, Endereco destino) {
        this.codigo = codigo;
        this.pesoKg = pesoKg;
        this.destino = destino;
    }

    public String descrever() {
        return " Código= " + codigo +
                " Peso= " + pesoKg +
                " Destino= " + destino.formatar();
    }

    public int getCodigo() {

        return codigo;
    }

    public double getPesoKg() {
        return pesoKg;
    }

}
