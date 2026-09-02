package org.example.empresa;

public enum Setor {
    RECURSOS_HUMANOS ("Recursos Humanas"),
    FINANCEIRO ("Financeiro"),
    OPERACOES ("Operações");

    private String nome;

    Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
