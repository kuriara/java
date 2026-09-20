package SistemaDeRestaurante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pratos pratos1 = new Pratos("Hamburger", "Sanduíche", 40.0);
        Cliente cliente1 = new Cliente("Punpun", 100.0);
        Pedido pedido1 = new Pedido(pratos1, cliente1);



    }
}
