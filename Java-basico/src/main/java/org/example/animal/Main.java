package org.example.animal;

public class Main {
    static void main() {
        Cachorro cachorro = new Cachorro();
        Gato gato   = new Gato() ;
        PAto pAto = new PAto();
        Galo galo = new Galo();

        System.out.println("Cachorro: "+ cachorro.emitirSom());
        System.out.println("Cachorro: "+ cachorro.comer());
        System.out.println("Gato: "+ gato.emitirSom());
        System.out.println("Gato: "+ gato.comer());
        System.out.println("Pato: "+ pAto.emitirSom());
        System.out.println("Pato: "+ pAto.comer());
        System.out.println("Galo: "+ galo.emitirSom());
        System.out.println("Galo: "+ galo.comer());
    }
}
