package org.example.animal;

public class Galo implements Animal{
    @Override
    public String comer() {
        return "Milho";
    }

    @Override
    public String emitirSom() {
        return "COCORICO!";
    }
}
