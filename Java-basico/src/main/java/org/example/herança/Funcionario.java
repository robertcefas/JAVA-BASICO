package org.example.herança;

public class Funcionario extends Pessoa{
    private int matricula;
    private int cargo;
    private int salario;

    public Funcionario(String nome, int idade, int matricula, int cargo, int salario) {
        super(nome, idade);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula=" + matricula +
                ", cargo=" + cargo +
                ", salario=" + salario +
                '}';
    }
}
