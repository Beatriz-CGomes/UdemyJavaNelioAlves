package caelum;

public class Exercicio1 {

	public static void main(String[] args) {

		System.out.println("1 - EXERCICIO");
		for (int i = 150; i <= 300; i++) {
			System.out.println(i);

		}

		System.out.println("-----------------------");
		System.out.println("2 - EXERCICIO");

		int soma = 0;
		int j;
		for (j = 1; j <= 100; j++) {
			soma = soma + j;
		}

		System.out.println(j);

		System.out.println("**");
		int soma2 = 0;
		int k = 1;
		while (k <= 100) {
			soma = soma + k;
			k++;
		}

		System.out.println(k);

		System.out.println("-----------------------");
		System.out.println("3 - EXERCICIO");

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println("Multiplos de 3 " + i);
			}
		}
		System.out.println("-----------------------");
		System.out.println("4 - EXERCICIO");

		int num = 13;
		System.out.println("Iniciando " + num);
		while (num != 1) {
			if (num % 2 == 0) {
				num = num / 2;
			} else {
				num = 3 * num + 1;
			}
		}
		System.out.println(num);

	}

}
