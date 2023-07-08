package caelum;

import java.util.Scanner;

public class Dois_caelum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("Entre com a sua idade :"); int i = sc.nextInt();
		 * 
		 * while (i < 10) { System.out.println(i); i++; }
		 * 
		 * 
		 * int j = 5; int x = j++ + 5; System.out.println(j); System.out.println(x);
		 * 
		 * 
		 * int k = 5; int y = ++k; System.out.println(k); System.out.println(y);
		 * 
		 * 
		 * 
		 * int y = 10;
		 * 
		 * for (int i = 0; i < 100; i++) { if( i > 50 && i < 60) {
		 * //System.out.println("Achei um numero divisivel por 19 entre x e y ");
		 * continue; } System.out.println(i);
		 * 
		 * }
		 * 
		 * 
		 * System.out.println("N"); int N = sc.nextInt();
		 * 
		 * for (int i = 0; i <= N; i++) { if (i % 2 == 0) { System.out.println(i); } }
		 */
		int conteAlgo = 0;

		System.out.println("Digite algo: ");
		String algo = sc.nextLine();

		for (int i = 0; i < algo.length(); i++) {
			if (algo == "A" || algo == "E") {
				conteAlgo++;
				System.out.println(conteAlgo);
			}
		}
		System.out.println(algo);
		System.out.println(conteAlgo);

		sc.close();
	}

}
