package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domino.Pessoa;



public class Program {

	public static void main(String[] args) {


		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		/*
		//BUSCANDO UMA PESSOA NO BANCO DE DADOS
		Pessoa p = em.find(Pessoa.class, 2);

		System.out.println(p);
		*/
		
		/*
		//APAGANDO UMA PESSOA DO BANCO DE DADOS
		Pessoa p = new Pessoa(2, null, null);
		*/
		
		Pessoa p = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		//O JPA SÓ CONSEGUE REMOVER UMA INSTANCIA MONITORADA E NÃO DESTACADA
		//objeto monitorado é um objeto que eu acabei de inserir ou um objeto que buscamos no banco de dados e não fechou o entitymaneger
		em.getTransaction().commit();
		
		//SEMPRE COLOCAR A TRANSAÇÃO SE NÃO FOR APENAS PARA FAZER UMA BUSCA
		System.out.println("Pronto!");
		em.close();
		emf.close();
	}

}
