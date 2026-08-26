package org.example.Patshop;

public class Main {
    static void main() {
        Pet pete1 = new Pet("Ralph", 12, "RS");
        Cliente cliente1 = new Cliente("Robert", 21, pete1);

        System.out.println(cliente1.toString());
        System.out.println(pete1.toString());
    }
}
