package br.com.magalu.lista_22_04.Exercicio05;

import java.util.Scanner;

public class Exerc05 {

    public void antecessor() {

        Scanner scan = new Scanner (System.in);

        System.out.println("Digite o numero que vc quer: ");

        double numero1;
        numero1 = scan.nextDouble();

        System.out.println(numero1-1);

    }
}
