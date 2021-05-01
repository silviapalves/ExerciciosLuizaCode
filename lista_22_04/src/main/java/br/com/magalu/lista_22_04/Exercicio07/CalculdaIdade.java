package br.com.magalu.lista_22_04.Exercicio07;

import java.util.Scanner;

public class CalculdaIdade {

    public void Idade() {

        Scanner scan = new Scanner (System.in);

        System.out.println("Digite sua idade em anos: ");

        int ano;
        ano = scan.nextInt();

        System.out.println("Digite os meses adicionais da sua idade: ");

        int mes;
        mes = scan.nextInt();

        System.out.println("Digite os dias adicionais da sua idade: ");

        int dias;
        dias = scan.nextInt();

        System.out.println(365*ano+30*mes+dias + " dias");

    }
}
