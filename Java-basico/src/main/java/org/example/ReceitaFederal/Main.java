package org.example.ReceitaFederal;

public class Main {
    static void main() {
        Fisica fisica1 = new Fisica("Robert Cefas", "7198422-4699", "001.002.003-04","123456789","16/05/2005");
        Juridica juridica1 = new Juridica("Juliana", "7198797-2077", "1234001123", "123456");

        System.out.println(fisica1.toString());
        System.out.println(juridica1.toString());
    }
}
