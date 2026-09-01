package org.example.calculadora;

public class Main {
    static void main() {
        Soma soma = new Soma();
        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Subtracao subtracao = new Subtracao();

        System.out.println("Soma "+ soma.calcular(10,5));
        System.out.println("Divisão "+ divisao.calcular(10,5));
        System.out.println("Multiplicação "+ multiplicacao.calcular(10,5));
        System.out.println("Subtração "+ subtracao.calcular(10,5));
    }
}
