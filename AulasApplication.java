package br.com.silvia.aulas;

import br.com.silvia.aulas.Exercicio2704_01.Numero1;
import br.com.silvia.aulas.Exercicio2704_02.Agenda;
import br.com.silvia.aulas.Exercicio2704_03.Elevador;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulasApplication {

	public static void main(String[] args) {

		SpringApplication.run(AulasApplication.class, args);

		// Com construtor full não precisa de get e set?

		Numero1 teste = new Numero1("Silvia", "23-10-1988", 1.59);
		teste.printData();
		teste.CalculaAge();

		// Para usar get e set

		Numero1 teste2 = new Numero1();
		teste2.setNome("Ana");
		teste2.setNascimento_1("21-02-1959");
		teste2.setAltura(1.55);
		teste2.printData();
		teste2.CalculaAge();

		Agenda teste3 = new Agenda();
		teste3.Armazena();
		teste3.Remove();
		int indice = teste3.Busca();
		System.out.println("\nA posição da agenda é : " + indice + "\n");
		teste3.Imprimir();
		teste3.ImprimirByIndice();

		Elevador teste4 = new Elevador();
		teste4.Inicializa(10,15);

//		teste4.setCapacity(10);
//		teste4.setTotalDeAndares(15);

		teste4.Add();
		teste4.Add();
		teste4.Add();
		teste4.Remove();
		teste4.Sobe();
		teste4.Sobe();
		teste4.Sobe();
		teste4.Sobe();
		teste4.Desce();
		teste4.Print();




	}



}
