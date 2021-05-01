package br.com.magalu.lista_22_04.Exercicio10;

import java.util.Scanner;

public class CustoFinal {

    public void Total() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o custo de fabrica do carro: ");

        Double custo;
        custo = scan.nextDouble();

        double distribuidor = 28;
        double impostos = 45;

        double result = (distribuidor/100)*custo + (impostos/100)*custo + custo;

        System.out.println("O custo final é " + result);


    }
}