package org.example.animal;

public class PAto implements Animal{
    @Override
    public String comer() {
        return "Semente";
    }

    @Override
    public String emitirSom() {
        return "Quack!";
    }
}
