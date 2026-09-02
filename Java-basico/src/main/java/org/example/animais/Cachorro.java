package org.example.animais;

public class Cachorro implements Animal {
    @Override
    public String emitirSom() {
        return "AU!AU!";
    }

    @Override
    public String comer() {
        return "Sua mãe";
    }
}
