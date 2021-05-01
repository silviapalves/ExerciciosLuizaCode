package br.com.magalu.lista_22_04.Exercicio06;

import java.util.Scanner;

public class CalculaArea {

    public void Result() {

        Scanner scan = new Scanner (System.in);

        System.out.println("Digite o valor da base do retangulo: ");

        double base;
        base = scan.nextDouble();

        System.out.println("Digite o valor da altura do retangulo: ");

        double altura;
        altura = scan.nextDouble();

        System.out.println(base*altura);

    }
}
