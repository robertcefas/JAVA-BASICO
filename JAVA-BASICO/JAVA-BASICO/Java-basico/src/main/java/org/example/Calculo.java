package org.example;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Calculo {
    static void main() {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
         String nome = ler.next();
                
        double nota1 = 6;
        double nota2 = 10;
        double nota3 = 5;

        double media = ((nota1 + nota2 + nota3) / 3);

        System.out.println("Sua media é: " + media );
        if (media > 7) {
            System.out.println("Aprovado");
        } else if ((media > 5) & (media < 7)) {
            System.out.println("VERIFICAR SUPLEMENTE");
        }else {
            System.out.println("Reprovado");
    }
    }
    
}
