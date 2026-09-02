package org.example.animais;

public class Main {
    static void main() {

        Cachorro cachorro = new Cachorro();
        Galo galo = new Galo();
        Gato gato = new Gato();

        System.out.println("Cachorro:");
        System.out.println("O Cachorro emite o som " + cachorro.emitirSom() + " e come "+ cachorro.comer());
        System.out.println("Galo:");
        System.out.println("O galo emite o som " + galo.emitirSom() + " e come "+ galo.comer());
        System.out.println("Gato:");
        System.out.println("O gato emite o som " + gato.emitirSom() + " e come "+ gato.comer());
    }
}
