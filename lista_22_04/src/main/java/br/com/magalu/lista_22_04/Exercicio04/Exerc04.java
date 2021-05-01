package br.com.magalu.lista_22_04.Exercicio04;

public class Exerc04 {

    public void LetraA(){
        double a = 6*(3+2);
        double aa = 6*3+6*2;
        if (a == aa) {
            System.out.println("Produz o mesmo resultado");
        } else {
            System.out.println("Não produz o mesmo resultado");
        }

    }

    public void LetraB(){
        double b = 2+(6*(3+2));
        double bb = 2+6*3+6*2;
        if (b == bb) {
            System.out.println("Produz o mesmo resultado");
        } else {
            System.out.println("Não produz o mesmo resultado");
        }

    }

    public void LetraC(){
        double c = 2+(3*6)/(2+4);
        double cc = 2+3*6/(2+4);
        if (c == cc) {
            System.out.println("Produz o mesmo resultado");
        } else {
            System.out.println("Não produz o mesmo resultado");
        }

    }

}
