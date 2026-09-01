package org.example.animal;

public class Cachorro implements Animal{
    @Override
    public String comer() {
        return "Figado de Bandido";
    }

    @Override
    public String emitirSom() {
        return "RUFH!RUFH!";
    }
}
