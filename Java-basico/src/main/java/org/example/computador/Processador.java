package org.example.computador;

public class Processador extends Componetes {
    private String frequencia;

    public Processador(String marca, String modelo, String capacidadeDeArmazenamento, String frequencia) {
        super(marca, modelo, capacidadeDeArmazenamento);
        this.frequencia = frequencia;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Processador{" +
                "frequencia='" + frequencia + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
