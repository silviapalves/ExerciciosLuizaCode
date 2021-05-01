package br.com.magalu.lista_22_04.Exercicio11;

import java.util.Scanner;

public class SalarioFinal {

    public void Salario() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero total de carros vendidos: ");

        Double numtotal;
        numtotal = scan.nextDouble();

        System.out.println("Digite o valor total das vendas: ");

        Double vendas;
        vendas = scan.nextDouble();

        System.out.println("Digite o salario fixo: ");

        Double fixo;
        fixo = scan.nextDouble();

        System.out.println("Digite a comissao fixa: ");

        Double comissao;
        comissao = scan.nextDouble();

        double resultado = fixo + comissao * numtotal + 0.05 * vendas;

        System.out.println("O salario final é " + resultado);

    }
}