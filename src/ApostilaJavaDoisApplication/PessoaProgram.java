package ApostilaJavaDoisApplication;

import java.util.Scanner;

import ApostilaJavaDoisEntities.Pessoa;

public class PessoaProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Pessoa p = new Pessoa();

		System.out.println("Nome:");
		String nome = sc.next();
		sc.nextLine();
		p.setNome(nome);

		System.out.println("Digite a sua altura");
		double altura = sc.nextDouble();
		p.setAltura(altura);

		System.out.println("Digite a sua data de nascimento");
		String data = sc.next();
		p.setDataNascimento(data);

		System.out.println("Digite o ano do atual");
		int anoAtual = sc.nextInt();
		p.setAnoAtual(anoAtual);

		System.out.println("Digite o ano do seu nascimento");
		int anoNascimento = sc.nextInt();
		p.setAnoNascimento(anoNascimento);

		System.out.println(p);

		sc.close();

	}

}
