package org.example.Tinder;

public class Endereco {
    private String lagradouro;
    private String numero;
    private String complemento;
    private String cep;
    private String cidade;
    private UnidadeFederatipa unidadeFederatipa ;

    public Endereco(String lagradouro, String numero, String complemento, String cep, String cidade, UnidadeFederatipa unidadeFederatipa) {
        this.lagradouro = lagradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.unidadeFederatipa = unidadeFederatipa;
    }

    public String getLagradouro() {
        return lagradouro;
    }

    public void setLagradouro(String lagradouro) {
        this.lagradouro = lagradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UnidadeFederatipa getUnidadeFederatipa() {
        return unidadeFederatipa;
    }

    public void setUnidadeFederatipa(UnidadeFederatipa unidadeFederatipa) {
        this.unidadeFederatipa = unidadeFederatipa;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "lagradouro='" + lagradouro + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                ", unidadeFederatipa=" + unidadeFederatipa +
                '}';
    }
}
