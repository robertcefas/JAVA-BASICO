package org.example.pets;

public class Pet {
    private String nome;
    private int idade;
    private String raca;
    private String porte;
    private String alimentecao;

    public Pet(String nome, int idade, String raca, String porte, String alimentecao) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.porte = porte;
        this.alimentecao = alimentecao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getAlimentecao() {
        return alimentecao;
    }

    public void setAlimentecao(String alimentecao) {
        this.alimentecao = alimentecao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + '\n' +
                "Idade: " + idade +'\n' +
                "Raça: " + raca + '\n' +
                "Porte: " + porte + '\n' +
                "Alimentação: " + alimentecao + '\n';
    }
}
