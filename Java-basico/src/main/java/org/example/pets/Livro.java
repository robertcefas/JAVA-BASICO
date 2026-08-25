package org.example.pets;

public class Livro {
    private String titulo;
    private String autor;
    private int isbn;
    private int numeroDePaginas;
    private String valorDeCompra;

    public Livro(String titulo, String autor, int isbn, int numeroDePaginas, String valorDeCompra) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeroDePaginas = numeroDePaginas;
        this.valorDeCompra = valorDeCompra;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getValorDeCompra() {
        return valorDeCompra;
    }

    public void setValorDeCompra(String valorDeCompra) {
        this.valorDeCompra = valorDeCompra;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn=" + isbn +
                ", numeroDePaginas=" + numeroDePaginas +
                ", valorDeCompra='" + valorDeCompra + '\'' +
                '}';
    }
}
