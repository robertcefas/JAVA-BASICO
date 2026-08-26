package org.example.Banco;

public class Main {
    static void main() {
        Conta conta1 = new Conta("NuBank",01,"12345678-9","CORRENTE",123.11,"R$01");
        Funcionario funcionario1 = new Funcionario(16, "Robert", "Ruia do Congo", "71 9 8797-2076", "robert@email.com", conta1);

        System.out.println(conta1.toString());
        System.out.println(funcionario1.toString());
    }
}
