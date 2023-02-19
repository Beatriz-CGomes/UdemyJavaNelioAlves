package EstrturaCondicional;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
// A seguir, calcule e mostre o valor da conta a pagar

		Scanner sc = new Scanner(System.in);

		int op, quantidade;
		double soma;

		System.out.println("/tLanchonete do Clebão");
		System.out.println("Escolha o seu pedido ");
		System.out.println("1 - Cachorro Quente R$4,00 ");
		System.out.println("2 - X-Salada R$4,50 ");
		System.out.println("3 - X-Bacon R$5,00 ");
		System.out.println("4 - Torrada Simples R$2,00 ");
		System.out.println("5 Refrigerante R1,50");
		op = sc.nextInt();

		System.out.println("Qual a quantidade que você deseja?");
		quantidade = sc.nextInt();
		
		switch (op) {
		case 1:
			soma = quantidade * 4.00;
			System.out.println("Cachorro Quente Total: R$ " + soma);
			break;
		case 2:
			soma = quantidade * 4.50;
			System.out.println("X-Salada Total: R$ " + soma);
			break;
		case 3:
			soma = quantidade * 5.00;
			System.out.println("X-Bacon Total: R$ " + soma);
			break;
		case 4:
			soma = quantidade * 2.00;
			System.out.println("Torrada Simples Total: R$ " + soma);
			break;
		case 5:
			soma = quantidade * 1.50;
			System.out.println("Refrigerante Total: R$ " + soma);
			break;
		}
		
		sc.close();

	}

}
