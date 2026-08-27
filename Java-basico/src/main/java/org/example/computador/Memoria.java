package org.example.computador;

public class Memoria extends Componetes {
    protected String capacidadeDeArmazenamento;

    public Memoria(String marca, String modelo, String capacidadeDeArmazenamento, String capacidadeDeArmazenamento1) {
        super(marca, modelo, capacidadeDeArmazenamento);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento1;
    }

    @Override
    public String getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    @Override
    public void setCapacidadeDeArmazenamento(String capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "capacidadeDeArmazenamento='" + capacidadeDeArmazenamento + '\'' +
                '}';
    }
}

