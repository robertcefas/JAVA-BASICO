package org.example.Empresa;

import org.example.Tinder.Sexo;

public class Main {
    static void main() {
        Funcionarios funcionario1 = new Funcionarios(14, "Robert Cefas", "R$ 5500",Setor.FINANCEIRO, Sexo.MASCULINO,27);
        Funcionarios funcionario2 = new Funcionarios(12, "Larissa Virginia","R$ 2500", Setor.RECURSOS_HUMANOS,Sexo.FEMININO,25);

        System.out.println(funcionario1.toString());
        System.out.println(funcionario2.toString());
    }
}
