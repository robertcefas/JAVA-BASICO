package org.example.computador;

public class PlacaMae extends Componetes {
    protected String soquete;

    public PlacaMae(String marca, String modelo, String capacidadeDeArmazenamento, String soquete) {
        super(marca, modelo, capacidadeDeArmazenamento);
        this.soquete = soquete;
    }

    public String getSoquete() {
        return soquete;
    }

    public void setSoquete(String soquete) {
        this.soquete = soquete;
    }

    @Override
    public String toString() {
        return "PlacaMae{" +
                "soquete='" + soquete + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
