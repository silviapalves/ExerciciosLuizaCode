package br.com.magalu.lista_27_04;

import br.com.magalu.lista_27_04.Exercicio01.Pessoa;
import br.com.magalu.lista_27_04.Exercicio02.Agenda;
import br.com.magalu.lista_27_04.Exercicio03.Elevador;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lista2704Application {

	public static void main(String[] args) {


		SpringApplication.run(Lista2704Application.class, args);

//		Pessoa pessoa1 = new Pessoa("Silvia","23-10-1988",1.59);
//		pessoa1.printData();
//		pessoa1.CalculaAge();

//		Agenda contato1 = new Agenda();
//		contato1.Armazena("Silvia", 32, 1.59);
//		contato1.Armazena("Bete", 30, 1.50);
//		contato1.Armazena("Jose", 40, 1.70);
//		contato1.Remove("Bete");
//		contato1.Busca("Jose");
//		contato1.ImprimeAgenda();
//		contato1.ImprimePessoa(1);

//	}

		Elevador teste = new Elevador();
		teste.Inicializa(10,5);
		teste.Add();
		teste.Add();
		teste.Add();
		teste.Remove();
		teste.Sobe();
		teste.Sobe();
		teste.Sobe();
		teste.Desce();
		teste.Desce();
		teste.Print();


	}
}