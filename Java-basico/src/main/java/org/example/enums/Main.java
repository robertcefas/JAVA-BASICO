package org.example.enums;

public class Main {
    static void main() {
        Clientes cliente1 = new Clientes("Marta", Pedido.ABERTO);

        System.out.println(cliente1.toString());
    }
}
