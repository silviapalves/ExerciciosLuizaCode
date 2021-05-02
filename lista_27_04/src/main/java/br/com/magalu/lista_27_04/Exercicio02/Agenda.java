package br.com.magalu.lista_27_04.Exercicio02;

import java.util.ArrayList;
import java.util.Objects;

public class Agenda {

    ArrayList<PessoasToAdd> lista = new ArrayList<PessoasToAdd>(20);
    int index;

    public void Armazena(String nome, int idade, double altura) {

        PessoasToAdd pessoastoadd;
        pessoastoadd = new PessoasToAdd(nome, idade, altura);
        lista.add(pessoastoadd);
        System.out.println("---------------Contato adicionado---------------------");
        System.out.println("Contato adicionado: " + pessoastoadd.getNome() + ", " + pessoastoadd.getIdade() + " anos, " + pessoastoadd.getAltura() + " m");
        System.out.println("A agenda contem " + lista.size() + " contatos");
    }

    public void Remove(String nome) {
        lista.removeIf(lista -> lista.nome.equals(nome));
        System.out.println("-------------------------------------------------------");
        System.out.println("Contato removido");
        System.out.println("A agenda contem " + lista.size() + " contatos");
    }

    public void Busca(String nome) {

        for (PessoasToAdd contato : lista) {

            if (contato.nome.equals(nome)) {
                System.out.println("---------------Busca de contatos---------------------");
                System.out.println("O indice de " + nome + " é " + lista.indexOf(contato));
            }
        }

    }

    public void ImprimeAgenda() {
        System.out.println("---------------Lista atual----------------------");
        for (PessoasToAdd contato : lista) {
            System.out.println("Nome: " + contato.nome + "; Idade: " + contato.idade + " anos; Altura: " + contato.altura + " m");
        }

    }

    public void ImprimePessoa(int i) {
        System.out.println("---------------Contato por indice----------------------");
        System.out.println("O contato de indece " + i + " é:");
        System.out.println("Nome: " + lista.get(1).nome + "; Idade: " + lista.get(1).idade + " anos; Altura: " +  lista.get(1).altura + " m");

    }
}

