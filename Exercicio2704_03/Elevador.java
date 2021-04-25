package br.com.silvia.aulas.Exercicio2704_03;

public class Elevador {

    private int andarAtual;
    private int totalDeAndares;
    private int capacity;
    private int numPessoas;


    public int getTotalDeAndares() {
        return totalDeAndares;
    }

    public void setTotalDeAndares(int totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void Inicializa(int capacity, int totalDeAndares){

        andarAtual = 0;
        numPessoas = 0;
        this.capacity = capacity;
        this.totalDeAndares = totalDeAndares;

        //System.out.println(andarAtual + " " + numPessoas + capacity + totalDeAndares);

    }


    public void Add(){

        if (numPessoas < capacity){

            numPessoas = numPessoas + 1;
        }else{
            System.out.println("There is no space");
        }

    }

    public void Remove(){

        if (numPessoas != 0){

            numPessoas = numPessoas-1;

        }else{
            System.out.println("There is no one");
        }

    }

    public void Sobe(){

        if (andarAtual < totalDeAndares){

            andarAtual = andarAtual+1;

        }else{
            System.out.println("Voce esta no ultimo andar");
        }

    }

    public void Desce(){

        if (andarAtual > 0){

            andarAtual = andarAtual-1;

        }else{
            System.out.println("Voce esta no terreo");
        }




    }

    public void Print(){

        System.out.println("\nO numero de pessoas atual é: " + numPessoas + "\nO andar atual é: " + andarAtual);

    }

}
