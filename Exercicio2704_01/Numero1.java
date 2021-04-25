package br.com.silvia.aulas.Exercicio2704_01;

import java.time.LocalDate;
import java.time.Period;


public class Numero1 {

    private String nome;
    private String nascimento_1;
    private Double altura;

    public String getNome() {
        return nome;
    }

    public String getNascimento_1() {
        return nascimento_1;
    }

    public Double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascimento_1(String nascimento_1) {
        this.nascimento_1 = nascimento_1;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Numero1(String nome, String nascimento_1, Double altura) {
        this.nome = nome;
        this.nascimento_1 = nascimento_1;
        this.altura = altura;
    }

    public Numero1() {
    }

    public void printData() {
        System.out.println("Nome da pessoa: " + nome);
        System.out.println("Data de nascimento: " + nascimento_1);
        System.out.println("Altura: " + altura);

    }



    public void CalculaAge(){
        DataDeNascimento datadenascimento = new DataDeNascimento(nascimento_1);
        LocalDate formatado = datadenascimento.Data();
        LocalDate agora = LocalDate.now();
        Period age  = Period.between(formatado, agora);

        System.out.println("A "+ nome+" tem " + age.getYears() + " anos, " +age.getMonths()+ " meses e " + age.getDays() + " dias");
    }

}

