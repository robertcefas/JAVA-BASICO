package org.example.computador;

public abstract class Componetes {
    protected String marca;
    protected String modelo;
    private String CapacidadeDeArmazenamento;

    public Componetes(String marca, String modelo, String capacidadeDeArmazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        CapacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCapacidadeDeArmazenamento() {
        return CapacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(String capacidadeDeArmazenamento) {
        CapacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    @Override
    public String toString() {
        return "Componetes{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", CapacidadeDeArmazenamento='" + CapacidadeDeArmazenamento + '\'' +
                '}';
    }
}
