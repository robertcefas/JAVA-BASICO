package Visibilidade;

public class Produtos {
    public Produtos(String nomeproduto, int quantidade, double preco) {
        this.nomeproduto = nomeproduto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    //Atributos
    private  String nomeproduto;
    private  int    quantidade;
    private double preco;

    public String getNomeproduto() {
        return nomeproduto;
    }

    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
