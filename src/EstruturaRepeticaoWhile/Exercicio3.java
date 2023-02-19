package EstruturaRepeticaoWhile;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
// um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
// 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
// que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
// mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo
		Scanner sc = new Scanner(System.in);

		int op = 0, alcool = 0, gasolina = 0, diesel = 0;
		System.out.println("Posto da Javaga");
		while (op != 4) {
			System.out.println("Por favor, selecione uma das opções");
			System.out.println("1 - Alcool");
			System.out.println("2 - Gasolina");
			System.out.println("3 - Diesel");
			System.out.println("4 - fim");
			op = sc.nextInt();

			switch (op) {
			case 1:
				if (op == 1) {
					alcool += 1;
				}
				break;

			case 2:
				if (op == 2) {
					gasolina += 1;

				}
				break;
			case 3:
				if (op == 3) {
					diesel += 1;
				}
				break;
			}
		}
		System.out.println("Muito obrigada");
		System.out.println("Alcool " + alcool);
		System.out.println("Gasolina " + gasolina);
		System.out.println("Diesel " + diesel);

		sc.close();
	}

}
