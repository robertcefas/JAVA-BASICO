package org.example.animal;

public class Gato implements Animal{
    @Override
    public String emitirSom() {
        return "Pis!PiS";
    }

    @Override
    public String comer() {
        return "Peixe!";
    }
}
