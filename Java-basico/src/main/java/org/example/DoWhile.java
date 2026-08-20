package org.example;

import java.util.Scanner;

public class DoWhile {
    static void main() {
        Scanner ler = new Scanner(System.in);
        int avalicao;
            do {
                System.out.println("Avalie nosso atendimento, de 1 a 5 estrelas:");
                avalicao = ler.nextInt();
            }while (avalicao<1||avalicao>5);
                System.out.println("Obrigado");
            }

    }
