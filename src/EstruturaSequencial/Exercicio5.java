package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago

		Scanner sc = new Scanner(System.in);

		int codigo1, quantidade1, codigo2, quantidade2;
		float valorUniPeça1, valorUniPeça2, valorTotal;
		System.out.println("Digite o codigo da peça");
		codigo1 = sc.nextInt();
		System.out.println("Entra com a quantidade de peças");
		quantidade1 = sc.nextInt();
		System.out.println("Entra com valor unitário da peça");
		valorUniPeça1 = sc.nextFloat();
		System.out.println("");

		System.out.println("Digite o codigo da peça");
		codigo2 = sc.nextInt();
		System.out.println("Entra com a quantidade de peças");
		quantidade2 = sc.nextInt();
		System.out.println("Entra com valor unitário da peça");
		valorUniPeça2 = sc.nextFloat();
		System.out.println("");
		valorTotal = valorUniPeça1 * quantidade1 + valorUniPeça2 * quantidade2;

		System.out.println("VALOR A PAGAR: R$ " + valorTotal);
		sc.close();

	}

}
