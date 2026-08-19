package org.example;

import java.util.Scanner;

public class Loja {
    static void main() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor da sua compra: ");

        double compra = ler.nextDouble();
        double prestacao = (compra/5);

        System.out.println("Loja Mamão com Açúcar");
        System.out.println("Serão 5 prestação de:" + prestacao);
    }
}
