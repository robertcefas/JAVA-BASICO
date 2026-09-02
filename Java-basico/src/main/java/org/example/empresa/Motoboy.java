package org.example.empresa;

public class Motoboy extends Funcionario {
    private  String cnh;

    public Motoboy(String nome, String dataDeNascimento, Sexo sexo, Setor setor, double salarioBase, String cnh) {
        super(nome, dataDeNascimento, sexo, setor, salarioBase);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase;
    }

    @Override
    public String toString() {
        return "Motoboy" +
                "CNH: " + cnh + '\'' +
                ", Nome: " + nome + '\'' +
                ", Data de Nascimento:" + dataDeNascimento + '\'' +
                ", Sexo: " + sexo +
                ", Setor: " + setor +
                ", Salário Base: " + salarioBase +
                ",Salário FInal: " + this.getSalarioFinal()+
                '}';
    }
}
