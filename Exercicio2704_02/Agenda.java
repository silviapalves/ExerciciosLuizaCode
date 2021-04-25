package br.com.silvia.aulas.Exercicio2704_02;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

    List<Pessoas> pessoas = new ArrayList(10);
    int index;

    public void Armazena() {

        pessoas.add(new Pessoas("Maria", 40, 1.6));
        pessoas.add(new Pessoas("Jose", 45, 1.7));
        pessoas.add(new Pessoas("Rodolfo", 70, 1.65));

    }

    public void Remove() {
        pessoas.removeIf(pessoas -> pessoas.nome.equals("Maria"));


    }

    public int Busca() {

        for (Pessoas ser1 : pessoas) {

            if(ser1.nome.equals("Rodolfo")){

                index = pessoas.indexOf(ser1);

            }
        }
        return index;
    }

    public void Imprimir() {
        System.out.println("A lista atual é:");
        for (Pessoas ser1 : pessoas) {
            System.out.println(ser1.nome + " ; " + ser1.idade + " ; " + ser1.altura + "\n");
        }

    }

    public void ImprimirByIndice() {

        System.out.println("Nome: " + pessoas.get(1).nome + "; Idade: " + pessoas.get(1).idade + "; Altura: " +  pessoas.get(1).altura);

    }
}





