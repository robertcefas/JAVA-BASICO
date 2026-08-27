package org.example.computador;

public class Main {
    static void main() {

        Processador processador1 =new Processador("Corsair","Ryzen","16GB","4600Ghz");
        Memoria memoria1 = new Memoria("Corsair","DDR1","8GB","8Gb");
        PlacaMae placaMae1 = new PlacaMae("Gigabyte","Ryzen","250GB","AM4");
        DispositidoDeArmazenamento dda1 = new DispositidoDeArmazenamento("Corsair","SSD","250GB","SATA");

        System.out.println(memoria1.toString());
        System.out.println(processador1.toString());
        System.out.println(placaMae1.toString());
        System.out.println(dda1.toString());

    }
}
