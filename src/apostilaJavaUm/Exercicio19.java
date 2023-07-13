package apostilaJavaUm;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int F = 0, M = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o sexo da pessoa: 'F' - FEMININO / 'M' = MASCULINO ");
			char sexo = sc.next().charAt(0);

			if (sexo == 'F') {
				F++;
				System.out.println("Sexo Feminino!");

			} else {
				M++;
				System.out.println("Sexo Masculino!");
			}
		}

		System.out.println("Total de MULHERES: " + F);
		System.out.println("Total de HOMENS: " + M);

		sc.close();
	}

}
