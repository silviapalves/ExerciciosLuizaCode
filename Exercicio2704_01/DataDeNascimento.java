package br.com.silvia.aulas.Exercicio2704_01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataDeNascimento {

    // Declara as variaveis
    private String nascimento;

    public String getNascimento() {
        return nascimento;
    }


    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    // Cria construtor com a string de nacimento
    public DataDeNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    // Metodo para transformar a string em formato de data
    public LocalDate Data () {

        DateTimeFormatter toDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return LocalDate.parse(nascimento,toDate);

    }
}
