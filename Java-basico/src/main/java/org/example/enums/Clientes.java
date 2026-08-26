package org.example.enums;

public class Clientes {
    private String nome;
    private Pedido pedido;

    public Clientes(String nome, Pedido pedido) {
        this.nome = nome;
        this.pedido = pedido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "nome='" + nome + '\'' +
                ", pedido=" + pedido +
                '}';
    }
}
