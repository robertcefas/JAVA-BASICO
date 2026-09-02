package org.example.empresa;

public class Main {
    static void main() {
        Motoboy motoboy = new Motoboy("Nilton",
                "12/05/2002",
                Sexo.MASCULINO, Setor.OPERACOES,
                1618,
                "AB");

        Diretor diretor = new Diretor("Robert",
                "16/05/2005",
                Sexo.MASCULINO,
                Setor.FINANCEIRO,
                2055);

        System.out.println(diretor.toString());
        diretor.admin(motoboy);
    }
}
