package org.example.animais;

public class Gato implements Animal{
    @Override
    public String emitirSom() {
        return "Miau!Miua!";
    }

    @Override
    public String comer() {
        return "Rato";
    }
}
