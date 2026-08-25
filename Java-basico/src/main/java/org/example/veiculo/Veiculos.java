package org.example.veiculo;

public class Veiculos {
    private String placa;
    private String cor;
    private int numeroDePassageiro;
    private int capacidadeDeTanque;
    private String velocidadeMaxima;
    private String consumoMedio;

    public Veiculos(String placa, String cor, int numeroDePassageiro, int capacidadeDeTanque, String velocidadeMaxima, String consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroDePassageiro = numeroDePassageiro;
        this.capacidadeDeTanque = capacidadeDeTanque;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumoMedio = consumoMedio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroDePassageiro() {
        return numeroDePassageiro;
    }

    public void setNumeroDePassageiro(int numeroDePassageiro) {
        this.numeroDePassageiro = numeroDePassageiro;
    }

    public int getCapacidadeDeTanque() {
        return capacidadeDeTanque;
    }

    public void setCapacidadeDeTanque(int capacidadeDeTanque) {
        this.capacidadeDeTanque = capacidadeDeTanque;
    }

    public String getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(String velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(String consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    @Override
    public String toString() {
        return "Veiculos{" +
                "placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", numeroDePassageiro=" + numeroDePassageiro +
                ", capacidadeDeTanque=" + capacidadeDeTanque +
                ", velocidadeMaxima='" + velocidadeMaxima + '\'' +
                ", consumoMedio='" + consumoMedio + '\'' +
                '}';
    }
}
