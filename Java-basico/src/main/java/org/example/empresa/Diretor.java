package org.example.empresa;

public class Diretor extends Funcionario implements Contratacao{
    private final  double PREMIO = 1.2;//para somar  //Ou 0.2 se usar o outro metodo (para diminuir)

    public Diretor(String nome, String dataDeNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataDeNascimento, sexo, setor, salarioBase);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public double getSalarioFinal() {
        //double resultado;
        //resultado = super.salarioBase * this.PREMIO;
        //resultado = super.salarioBase + (super.salarioBase * this.PREMIO);
        //return resultado;
        return super.salarioBase * this.PREMIO;
    }

    @Override
    public String toString() {
        return "Diretor" +
                "PREMIO: " + PREMIO +
                ", Nome: " + nome + '\'' +
                ", Data de Nascimento: " + dataDeNascimento + '\'' +
                ", Sexo: " + sexo +
                ", Setor: " + setor +
                ", Salário Base" + salarioBase +
                ",Salário Final: " + this.getSalarioFinal()+
                '}';
    }

    @Override
    public void admin(Funcionario funcionario) {
        System.out.println("Admitir: "+ funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitir: " + funcionario.toString());

    }
}
