package br.com.magalu.lista_22_04.Exercicio08;

import java.util.Scanner;

public class CalculaEleitores {

    public void Eleitores() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero total de eleitores: ");

        Double numtotal;
        numtotal = scan.nextDouble();

        System.out.println("Digite o numero de votos brancos: ");

        Double votosbrancos;
        votosbrancos = scan.nextDouble();

        System.out.println("Digite o numero de votos nulos: ");

        Double votosnulos;
        votosnulos = scan.nextDouble();

        System.out.println("Digite o numero de votos validos: ");

        Double votosvalidos;
        votosvalidos = scan.nextDouble();

        double _votosbrancos = (votosbrancos/numtotal)*100;
        double _votosnulos = (votosnulos/numtotal)*100;
        double _votosvalidos = (votosvalidos/numtotal)*100;


        System.out.println(_votosbrancos  + "% de votos brancos");
        System.out.println(_votosnulos  + "% de votos nulos");
        System.out.println(_votosvalidos  + "% de votos validos");

    }
}