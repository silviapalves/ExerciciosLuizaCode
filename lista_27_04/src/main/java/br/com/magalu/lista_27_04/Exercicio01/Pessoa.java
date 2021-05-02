package br.com.magalu.lista_27_04.Exercicio01;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pessoa {

    private String nome;
    private String nascimento;
    private Double altura;
    private LocalDate dataformatada;

    public String getNome() {
        return nome;
    }

    public String getNascimento_1() { return nascimento; }

    public Double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascimento_1(String nascimento) {
        this.nascimento = nascimento;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Pessoa(String nome, String nascimento, Double altura) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.altura = altura;
        DateTimeFormatter toDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        dataformatada = LocalDate.parse(this.nascimento, toDate);

    }

    public void printData() {
        System.out.println("---------------Dados da pessoa----------------");
        System.out.println("Nome da pessoa: " + this.nome);
        System.out.println("Data de nascimento: " + this.nascimento);
        System.out.println("Altura: " + this.altura);

        }

    public void CalculaAge(){

        LocalDate agora = LocalDate.now();
        Period age  = Period.between(dataformatada, agora);

        System.out.println("A "+ nome +" tem " + age.getYears() + " anos, " +age.getMonths()+ " meses e " + age.getDays() + " dias");
    }
}