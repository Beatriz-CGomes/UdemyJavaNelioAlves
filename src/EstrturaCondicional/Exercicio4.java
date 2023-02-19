package EstrturaCondicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
		// jogo, sabendo que o
		// mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de
		// 1 hora e máxima de
		// 24 horas.

		Scanner sc = new Scanner(System.in);

		int inicio, fim, soma = 0, dia = 24;

		System.out.println("Entre com horario do inicio do jogo ");
		inicio = sc.nextInt();

		System.out.println("Entre com horario do final do jogo ");
		fim = sc.nextInt();

		if (inicio > fim) {
			soma = dia - inicio + fim;
		} else if (inicio < fim) {
			soma = fim - inicio;
		}
		System.out.println("O JOGO DUROU " + soma + " HORA(S ");
		sc.close();
	}

}
