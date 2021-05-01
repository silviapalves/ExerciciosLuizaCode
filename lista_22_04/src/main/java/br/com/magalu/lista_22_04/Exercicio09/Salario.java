package br.com.magalu.lista_22_04.Exercicio09;

import java.util.Scanner;

public class Salario {

    public void CalculaSalario() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salario mensal atual: ");

        Double salario;
        salario = scan.nextDouble();

        System.out.println("Digite o percentual de reajuste: ");

        Double reajuste;
        reajuste = scan.nextDouble();

        double novosalario = (reajuste / 100 + 1) * salario;


        System.out.println("o novo salario é " + novosalario);
    }
}