package org.example.computador;

public class DispositidoDeArmazenamento extends Componetes{
    protected String tipoDeConexao;

    public DispositidoDeArmazenamento(String marca, String modelo, String capacidadeDeArmazenamento, String tipoDeConexao) {
        super(marca, modelo, capacidadeDeArmazenamento);
        this.tipoDeConexao = tipoDeConexao;
    }

    public String getTipoDeConexao() {
        return tipoDeConexao;
    }

    public void setTipoDeConexao(String tipoDeConexao) {
        this.tipoDeConexao = tipoDeConexao;
    }

    @Override
    public String toString() {
        return "DispositidoDeArmazenamento{" +
                "tipoDeConexao='" + tipoDeConexao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
